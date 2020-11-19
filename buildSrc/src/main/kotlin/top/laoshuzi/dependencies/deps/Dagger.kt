package top.laoshuzi.dependencies.deps

object Dagger {

    val dagger_version = "2.11"

    val dagger = Deps("com.google.dagger", "dagger", dagger_version)
    val dagger_android = Deps("com.google.dagger", "dagger-android", dagger_version)
    val dagger_android_support = Deps("com.google.dagger", "dagger-android-support", dagger_version)
    val dagger_compiler = Deps("com.google.dagger", "dagger-compiler", dagger_version)
    val dagger_android_processor = Deps("com.google.dagger", "dagger-android-processor", dagger_version)

}