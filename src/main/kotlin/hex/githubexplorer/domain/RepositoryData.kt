package hex.githubexplorer.domain

data class RepositoryData(
    val repository: Repository,
    val branches: List<Branch>,
)
data class Repository(val name: String, val ownerLogin: String, val fork: Boolean)
data class Branch(val name: String, val lastCommitSha: String)
