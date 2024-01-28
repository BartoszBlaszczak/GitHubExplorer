package hex.githubexplorer

import hex.githubexplorer.WiremockServer.mockGetReposFor
import hex.githubexplorer.WiremockServer.mockUserNotFound
import hex.githubexplorer.adapter.http.ErrorResponse
import hex.githubexplorer.adapter.http.GetUserReposResponse
import hex.githubexplorer.adapter.http.RepoBranch
import io.kotest.core.spec.style.StringSpec
import io.kotest.inspectors.forAny
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldNotBeEmpty
import io.ktor.client.call.*
import io.ktor.client.statement.*
import io.ktor.http.HttpStatusCode.Companion.BadGateway
import io.ktor.http.HttpStatusCode.Companion.NotAcceptable
import io.ktor.http.HttpStatusCode.Companion.OK


class MainTest : StringSpec({
    "should return user repos" {
        // given
        val username = "BartoszBlaszczak"
        mockGetReposFor(username)

        // when
        val response = getGithubReposInfoFor(username)

        // then
        response.status shouldBe OK
        response.body<List<GetUserReposResponse>>().apply {
            size shouldBe 2
            forAny {
                it.repositoryName shouldBe "first"
                it.ownerLogin shouldBe username
                it.branches.shouldContainExactlyInAnyOrder(
                    RepoBranch(name = "feature/dev", lastCommitSha = "652069096462dad19acac805e0ac02c3af61a855"),
                    RepoBranch(name = "master", lastCommitSha = "073e3b1f039570c733812238fb2c2b90e85ed2ff"),
                )
            }
            forAny {
                it.repositoryName shouldBe "second"
                it.ownerLogin shouldBe username
                it.branches.shouldContainExactlyInAnyOrder(
                    RepoBranch(name = "HTML_DSL", lastCommitSha = "b77f6026833b8dcc9975872f03ae42a2f88bfadf"),
                    RepoBranch(name = "dev", lastCommitSha = "f115a2189b9f05a5e8b3dfa9a4ee8fd63a184020"),
                    RepoBranch(name = "drop_di", lastCommitSha = "53d8825869cad26ecaa8bf39fbf290381ee70a4a"),
                    RepoBranch(name = "master", lastCommitSha = "f115a2189b9f05a5e8b3dfa9a4ee8fd63a184020"),
                )
            }
        }
    }

    "should return no such user error" {
        // given
        val username = "NonexistentUser"
        mockUserNotFound(username)

        // when
        val response = getGithubReposInfoFor(username)

        // then
        response.status shouldBe BadGateway
        response.body<ErrorResponse>().apply {
            status shouldBe 404
            message.shouldNotBeEmpty()
        }
    }

    "should not be able to send xml response" {
        // given
        val username = "BartoszBlaszczak"
        mockGetReposFor(username)

        // when
        val response = getXmlGithubReposInfoFor(username)

        // then
        response.status shouldBe NotAcceptable
        response.bodyAsText() shouldBe """{"status": 406 Not Acceptable "Message": "Only JSON format is supported" }"""
    }
})
