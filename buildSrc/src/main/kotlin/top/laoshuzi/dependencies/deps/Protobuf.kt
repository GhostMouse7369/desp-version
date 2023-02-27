package top.laoshuzi.dependencies.deps

object Protobuf {

    val protobuf_plugin_version = "0.8.18"
    val protobuf_version = "3.20.1"

    val protobuf_java_util = Deps("com.google.protobuf", "protobuf-java-util", protobuf_version)
    val protobuf_kotlin = Deps("com.google.protobuf", "protobuf-kotlin", protobuf_version)
    val protobuf_kotlin_lite = Deps("com.google.protobuf", "protobuf-kotlin-lite", protobuf_version)

}
