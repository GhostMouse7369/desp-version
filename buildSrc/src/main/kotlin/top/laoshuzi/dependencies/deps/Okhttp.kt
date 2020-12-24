package top.laoshuzi.dependencies.deps

object Okhttp {

    val okhttp_version = "4.9.0"

    val okhttp = Deps("com.squareup.okhttp3", "okhttp", okhttp_version)
    val okhttp_logging_interceptor = Deps("com.squareup.okhttp3", "logging-interceptor", okhttp_version)

}