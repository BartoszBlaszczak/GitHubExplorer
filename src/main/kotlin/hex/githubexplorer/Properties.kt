package hex.githubexplorer

object Properties {
    val githubUrl: String = getProperty("GITHUB_URL") ?: "https://api.github.com"

}

private fun getProperty(key: String): String? = System.getProperty(key) ?: System.getenv(key)
