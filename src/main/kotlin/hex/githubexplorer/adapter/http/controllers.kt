package hex.githubexplorer.adapter.http

import hex.githubexplorer.domain.GithubErrorResponse
import hex.githubexplorer.domain.RepositoryData
import hex.githubexplorer.domain.getUserRepositoriesInfo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*

suspend fun ApplicationCall.githubRepos() {
    val username = requireNotNull(parameters[CallParameters.USERNAME])

    getUserRepositoriesInfo(username)
        .onRight { respond(it.map(RepositoryData::toResponse)) }
        .onLeft { respond(HttpStatusCode.BadGateway, it.toResponse()) }
}

data class GetUserReposResponse(val repositoryName: String, val ownerLogin: String, val branches: List<RepoBranch>)
data class RepoBranch(val name: String, val lastCommitSha: String)

fun RepositoryData.toResponse() = GetUserReposResponse(
    repositoryName = repository.name,
    ownerLogin = repository.ownerLogin,
    branches = branches.map { RepoBranch(name = it.name, lastCommitSha = it.lastCommitSha) },
    )

data class ErrorResponse(val status: Int, val message: String)
fun GithubErrorResponse.toResponse() = ErrorResponse(status, message)