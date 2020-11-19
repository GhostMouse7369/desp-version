package top.laoshuzi.dependencies.deps

object Common {

    val core_version = "0.1.0"

    val core = Deps("top.laoshuzi.server.common", "core", core_version)
    val core_mqtt = Deps("top.laoshuzi.server.common", "core-mqtt", core_version)
    val core_grpc = Deps("top.laoshuzi.server.common", "core-grpc", core_version)

}