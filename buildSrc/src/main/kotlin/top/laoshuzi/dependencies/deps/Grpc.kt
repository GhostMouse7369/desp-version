package top.laoshuzi.dependencies.deps

object Grpc {

    val grpc_version = "1.46.0"
    val grpc_kotlin_version = "1.3.0"
    val grpc_spring_boot_version = "2.10.1.RELEASE"

    val grpc_netty = Deps("io.grpc", "grpc-netty", grpc_version)
    val grpc_netty_shaded = Deps("io.grpc", "grpc-netty-shaded", grpc_version)
    val grpc_stub = Deps("io.grpc", "grpc-stub", grpc_version)
    val grpc_kotlin_stub = Deps("io.grpc", "grpc-kotlin-stub", grpc_kotlin_version)
    val grpc_protobuf = Deps("io.grpc", "grpc-protobuf", grpc_version)
    val grpc_protobuf_lite = Deps("io.grpc", "grpc-protobuf-lite", grpc_version)
    val grpc_services = Deps("io.grpc", "grpc-services", grpc_version)

    val grpc_spring_boot = Deps("net.devh", "grpc-spring-boot-starter", grpc_spring_boot_version)
    val grpc_server_spring_boot = Deps("net.devh", "grpc-server-spring-boot-starter", grpc_spring_boot_version)
    val grpc_client_spring_boot = Deps("net.devh", "grpc-client-spring-boot-starter", grpc_spring_boot_version)

}
