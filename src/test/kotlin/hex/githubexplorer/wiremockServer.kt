package hex.githubexplorer

import com.github.tomakehurst.wiremock.WireMockServer
import com.github.tomakehurst.wiremock.client.WireMock.*


object WiremockServer {
    private const val WIRE_MOCK_PORT = 1111
    const val WIREMOCK_ADDRESS = "http://localhost:$WIRE_MOCK_PORT"

    init {
        WireMockServer(WIRE_MOCK_PORT).also { configureFor(WIRE_MOCK_PORT); it.start() }
    }


    fun mockGetReposFor(username: String) {
        stubFor(
            get(urlEqualTo("/users/$username/repos"))
                .willReturn(okJson(GET_REPOSITORIES_RESPONSE))
        )

        stubFor(
            get(urlEqualTo("/repos/$username/first/branches"))
                .willReturn(okJson(FIRST_REPO_BRANCHES_RESPONSE))
        )

        stubFor(
            get(urlEqualTo("/repos/$username/second/branches"))
                .willReturn(okJson(SECOND_REPO_BRANCHES_RESPONSE))
        )
    }

    fun mockUserNotFound(username: String) {
        stubFor(
            get(urlEqualTo("/users/$username/repos"))
                .willReturn(notFound().withHeader("Content-Type", "application/json").withBody(USER_NOT_FOUND_RESPONSE))
        )
    }
}
