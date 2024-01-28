package hex.githubexplorer.adapter.http

import com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.jackson.*

val httpClient = HttpClient(OkHttp) {
    install(ContentNegotiation) {
        jackson { configure(FAIL_ON_UNKNOWN_PROPERTIES, false) }
    }
}
