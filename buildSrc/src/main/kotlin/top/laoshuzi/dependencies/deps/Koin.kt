package top.laoshuzi.dependencies.deps

object Koin {

    val koin_version = "3.2.0"

    val core = Deps("io.insert-koin", "koin-core", koin_version)
    val test = Deps("io.insert-koin", "koin-test", koin_version)

    val test_junit4 = Deps("io.insert-koin", "koin-test-junit4", koin_version)
    val test_junit5 = Deps("io.insert-koin", "koin-test-junit5", koin_version)

    val android = Deps("io.insert-koin", "koin-android", koin_version)
    val androidx_compat = Deps("io.insert-koin", "koin-android-compat", koin_version)
    val androidx_workmanager = Deps("io.insert-koin", "koin-androidx-workmanager", koin_version)
    val androidx_navigation = Deps("io.insert-koin", "koin-androidx-navigation", koin_version)
    val androidx_compose = Deps("io.insert-koin", "koin-androidx-compose", koin_version)

    val ktor = Deps("io.insert-koin", "koin-ktor", koin_version)
    val logger_slf4j = Deps("io.insert-koin", "koin-logger-slf4j", koin_version)

}