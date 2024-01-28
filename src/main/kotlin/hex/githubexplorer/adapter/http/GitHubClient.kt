package hex.githubexplorer.adapter.http

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import hex.githubexplorer.domain.Branch
import hex.githubexplorer.domain.GithubErrorResponse
import hex.githubexplorer.domain.Repository
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.http.ContentType.Application.Json
import hex.githubexplorer.Properties.githubUrl

object GitHubClient {

    suspend fun getRepos(username: String): Either<GithubErrorResponse, List<Repository>> {
        return httpClient.get("$githubUrl/users/$username/repos") { accept(Json) }
            .resolve<List<GithubRepositoryData>>()
            .map { repositoryData -> repositoryData.map { Repository(it.name, it.owner.login, it.fork) } }
    }

    suspend fun getBranches(username: String, repositoryName: String): Either<GithubErrorResponse, List<Branch>> {
        return httpClient.get("$githubUrl/repos/$username/$repositoryName/branches") { accept(Json) }
            .resolve<List<GithubRepositoryBranchData>>()
            .map { branchData -> branchData.map { Branch(it.name, it.commit.sha) } }
    }

    private suspend inline fun <reified T> HttpResponse.resolve(): Either<GithubErrorResponse, T> = when (status) {
        HttpStatusCode.OK -> body<T>().right()
        else -> GithubErrorResponse(status.value, bodyAsText()).left()
    }
}

private data class GithubRepositoryData(val name: String, val owner: GithubRepositoryOwnerData, val fork: Boolean)
private data class GithubRepositoryOwnerData(val login: String)


private data class GithubRepositoryBranchData(val name: String, val commit: GithubRepositoryCommitData)
private data class GithubRepositoryCommitData(val sha: String)