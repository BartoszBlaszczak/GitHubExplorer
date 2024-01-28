plugins {
    application
    kotlin("jvm") version "1.9.22"
    id("io.gitlab.arturbosch.detekt").version("1.23.4")
    id("org.jetbrains.kotlinx.kover") version "0.7.5"
}

group = "hex"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val ktorVersion = "2.3.7"
    implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-status-pages-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-default-headers-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-jackson:$ktorVersion")
    implementation("io.ktor:ktor-server-openapi:$ktorVersion")
    implementation("io.ktor:ktor-server-swagger:$ktorVersion")

    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-json:$ktorVersion")
    implementation("io.ktor:ktor-client-jackson:$ktorVersion")
    implementation("io.ktor:ktor-client-okhttp:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")

    implementation("io.arrow-kt:arrow-core:1.2.0")

    val kotestVersion = "5.8.0"
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotestVersion")

    testImplementation("org.wiremock:wiremock:3.3.1")

}

application {
    mainClass.set("hex.githubexplorer.MainKt")
}

tasks.jar {
    manifest { attributes["Main-Class"] = "hex.githubexplorer.MainKt" }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
    from(configurations.runtimeClasspath.get().map{ if (it.isDirectory) it else zipTree(it) })
}


tasks.test {
    useJUnitPlatform()
}

detekt {
    config.setFrom(files("$rootDir/detekt-config.yml"))
}

koverReport {
    verify {
        rule {
            minBound(95)
        }
    }
}


kotlin {
    jvmToolchain(21)
}
