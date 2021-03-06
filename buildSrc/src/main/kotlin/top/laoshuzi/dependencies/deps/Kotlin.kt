package top.laoshuzi.dependencies.deps

object Kotlin {

    const val kotlin_version = "1.4.10"

    val stdlib_jdk8 = Deps("org.jetbrains.kotlin", "kotlin-stdlib-jdk8", "")
    val stdlib_js = Deps("org.jetbrains.kotlin", "kotlin-stdlib-js", kotlin_version)
    val reflect = Deps("org.jetbrains.kotlin", "kotlin-reflect", kotlin_version)
    val android_extensions = Deps("org.jetbrains.kotlin", "kotlin-android-extensions", kotlin_version)
    val test_junit = Deps("org.jetbrains.kotlin", "kotlin-test-junit", kotlin_version)
}