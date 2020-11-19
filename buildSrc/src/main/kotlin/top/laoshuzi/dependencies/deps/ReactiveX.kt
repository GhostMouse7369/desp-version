package top.laoshuzi.dependencies.deps

object ReactiveX {

    val reactivex_java_version = "2.2.10"
    val reactivex_android_version = "2.1.1"
    val reactivex_kotlin_version = "2.4.0"

    val rx_java = Deps("io.reactivex.rxjava2", "rxjava", reactivex_java_version)

    val rx_android = Deps("io.reactivex.rxjava2", "rxandroid", reactivex_android_version)

    val rx_kotlin = Deps("io.reactivex.rxjava2", "rxkotlin", reactivex_kotlin_version)

}
