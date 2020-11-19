package top.laoshuzi.dependencies.deps

object Koin {

    val koin_version = "2.0.1"

    val core = Deps("org.koin", "koin-core", koin_version)
    val core_ext = Deps("org.koin", "koin-core-ext", koin_version)
    val test = Deps("org.koin", "koin-test", koin_version)
    val java = Deps("org.koin", "koin-java", koin_version)

    val android = Deps("org.koin", "koin-android", koin_version)
    val android_ext = Deps("org.koin", "koin-android-ext", koin_version)
    val android_scope = Deps("org.koin", "koin-android-scope", koin_version)
    val android_viewmodel = Deps("org.koin", "koin-android-viewmodel", koin_version)

    val androidx_ext = Deps("org.koin", "koin-androidx-ext", koin_version)
    val androidx_scope = Deps("org.koin", "koin-androidx-scope", koin_version)
    val androidx_viewmodel = Deps("org.koin", "koin-androidx-viewmodel", koin_version)

    val ktor = Deps("org.koin", "koin-ktor", koin_version)

}