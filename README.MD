This is an application to explore [GitHub](https://github.com/) repositories for given username.

[Here](Backend%20Code%20Challenge%20-%20Mobile.pdf) are the requirements.

It is written in Kotlin/JVM and using:
- builder [Gradle](https://gradle.org/)
- server [Ktor](https://ktor.io/)

Run `./gradlew build` to generate executable jar file.

Run `./gradlew run` to start the application.

You can also run it on Docker using [Dockerfile](Dockerfile).

To view the Swagger documentation, visit http://localhost:8080/swagger.

The main endpoint is: http://localhost:8080/githubrepos/$username (for example: http://localhost:8080/githubrepos/BartoszBlaszczak)
