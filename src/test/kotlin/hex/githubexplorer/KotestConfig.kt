package hex.githubexplorer

import hex.githubexplorer.WiremockServer.WIREMOCK_ADDRESS
import io.kotest.assertions.nondeterministic.eventually
import io.kotest.core.config.AbstractProjectConfig
import io.kotest.matchers.shouldBe
import io.ktor.http.HttpStatusCode.Companion.OK
import kotlin.concurrent.thread
import kotlin.time.Duration.Companion.seconds

@Suppress("UNUSED")
object KotestConfig : AbstractProjectConfig() {
    override suspend fun beforeProject() {
        loadProperties()

        thread { main() }
        waitForApplicationToBeReady()
    }

    private fun loadProperties() {
        System.setProperty("GITHUB_URL", WIREMOCK_ADDRESS)
    }

    private suspend fun waitForApplicationToBeReady() = eventually(10.seconds) {
        getReadiness().status shouldBe OK
    }
}
