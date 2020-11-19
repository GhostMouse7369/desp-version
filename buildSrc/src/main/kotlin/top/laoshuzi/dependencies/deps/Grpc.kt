package top.laoshuzi.dependencies.deps

object Grpc {

    val protobuf_plugin_version = "0.8.13"
    val protobuf_version = "3.13.0"
    val grpc_version = "1.32.1"
    val grpc_kotlin_version = "0.2.1"
    val grpc_spring_boot_version = "2.10.1.RELEASE"

    val grpc_netty = Deps("io.grpc", "grpc-netty", grpc_version)
    val grpc_netty_shaded = Deps("io.grpc", "grpc-netty-shaded", grpc_version)
    val grpc_stub = Deps("io.grpc", "grpc-stub", grpc_version)
    val grpc_kotlin_stub = Deps("io.grpc", "grpc-kotlin-stub", grpc_kotlin_version)
    val grpc_protobuf = Deps("io.grpc", "grpc-protobuf", grpc_version)
    val grpc_services = Deps("io.grpc", "grpc-services", grpc_version)

    val grpc_spring_boot = Deps("net.devh", "grpc-spring-boot-starter", grpc_spring_boot_version)
    val grpc_server_spring_boot = Deps("net.devh", "grpc-server-spring-boot-starter", grpc_spring_boot_version)
    val grpc_client_spring_boot = Deps("net.devh", "grpc-client-spring-boot-starter", grpc_spring_boot_version)

}
