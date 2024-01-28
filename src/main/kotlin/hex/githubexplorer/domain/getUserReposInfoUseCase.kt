package hex.githubexplorer.domain

import arrow.core.Either
import arrow.core.Either.*
import arrow.core.flatMap
import arrow.core.right
import hex.githubexplorer.adapter.http.GitHubClient

suspend fun getUserRepositoriesInfo(username: String): Either<GithubErrorResponse, List<RepositoryData>> {
    return GitHubClient.getRepos(username)
        .flatMap { repos ->
            val notForkRepos = repos.filter { it.fork.not() }
            notForkRepos.map { repository ->
                when (val branches = GitHubClient.getBranches(username, repository.name)) {
                    is Left -> return@flatMap branches
                    is Right -> RepositoryData(repository, branches.value)
                }
            }.right()
        }
}
