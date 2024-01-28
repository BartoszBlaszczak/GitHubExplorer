package hex.githubexplorer.adapter.http

import hex.githubexplorer.adapter.http.CallParameters.USERNAME
import io.ktor.http.HttpStatusCode.Companion.NotAcceptable
import io.ktor.serialization.jackson.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.openapi.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.plugins.swagger.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

object Server {
    fun startServer() {
        embeddedServer(Netty, port = 8080) {
            install(ContentNegotiation) {
                jackson()
            }

            install(StatusPages) {
                status(NotAcceptable) { call, statusCode ->
                    call.respond(statusCode, """{"status": $statusCode "Message": "Only JSON format is supported" }""")
                }
            }

            routing {
                openAPI(path = "openapi", swaggerFile = "openapi/documentation.yaml")
                swaggerUI(path = "swagger", swaggerFile = "openapi/documentation.yaml")

                get("/ready") { call.respondText("OK") }
                get("/githubrepos/{$USERNAME}") { call.githubRepos() }
            }
        }.start(wait = true)
    }
}

object CallParameters {
    const val USERNAME = "username"
}
