package top.laoshuzi.dependencies.deps

object BuildTools {

    val android_gradle_version = "4.1.1"

    val android_gradle_build_plugin = "com.android.tools.build:gradle:${android_gradle_version}"
    val kotlin_gradle_build_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.kotlin_version}"
    //    val android_gradle_build_plugin = Deps("com.android.tools.build", "gradle", android_gradle_version)
//    val kotlin_gradle_build_plugin = Deps("org.jetbrains.kotlin", "kotlin-gradle-plugin", Kotlin.kotlin_version)

}
