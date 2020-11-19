package top.laoshuzi.dependencies.deps

object Bintray {

    val bintray_gradle_version = "1.8.4"
    val bintray_release_version = "0.6.0"

    val bintray_gradle = Deps("com.jfrog.bintray.gradle", "gradle-bintray-plugin", bintray_gradle_version)

    val bintray_release = Deps("com.novoda", "bintray-release", bintray_release_version)

}
