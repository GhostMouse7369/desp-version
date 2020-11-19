package top.laoshuzi.dependencies.deps

object Swagger {

    val swagger_version = "2.9.2"

    val swagger = Deps("io.springfox", "springfox-swagger2", swagger_version)
    val swagger_ui = Deps("io.springfox", "springfox-swagger-ui", swagger_version)

}