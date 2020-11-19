package top.laoshuzi.dependencies.deps

@Deprecated("to Androidx")
object Lifecycle {

    val lifecycle_version = "2.0.0"

    val extensions = Deps("androidx.lifecycle", "lifecycle-extensions", lifecycle_version)
    val viewmodel = Deps("androidx.lifecycle", "lifecycle-viewmodel", lifecycle_version)
    val livedata = Deps("androidx.lifecycle", "lifecycle-livedata", lifecycle_version)
    val runtime = Deps("androidx.lifecycle", "lifecycle-runtime", lifecycle_version)
    val compiler = Deps("androidx.lifecycle", "lifecycle-compiler", lifecycle_version)
    val common_java8 = Deps("androidx.lifecycle", "lifecycle-common-java8", lifecycle_version)
    val reactivestreams = Deps("androidx.lifecycle", "lifecycle-reactivestreams", lifecycle_version)
    val test = Deps("androidx.arch.core", "core-testing", lifecycle_version)

}
