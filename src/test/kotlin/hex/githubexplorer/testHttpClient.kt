package hex.githubexplorer

import com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.ContentType.*
import io.ktor.serialization.jackson.*

val testHttpClient = HttpClient(OkHttp) {
    install(ContentNegotiation) {
        jackson { configure(FAIL_ON_UNKNOWN_PROPERTIES, false) }
    }
}

private const val APP_ADDRESS = "http://localhost:8080"

suspend fun getReadiness() = testHttpClient.get("$APP_ADDRESS/ready")

suspend fun getGithubReposInfoFor(username: String) = testHttpClient.get("$APP_ADDRESS/githubrepos/$username")

suspend fun getXmlGithubReposInfoFor(username: String) =
    HttpClient(OkHttp).get("$APP_ADDRESS/githubrepos/$username") { accept(Application.Xml) }
