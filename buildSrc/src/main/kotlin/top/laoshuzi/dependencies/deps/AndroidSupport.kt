package top.laoshuzi.dependencies.deps

@Deprecated("to Androidx")
object AndroidSupport {

    val android_support_version = "28.0.0"
    val multidex_version = "1.0.2"
    val constraint_layout_version = "1.1.3"
    val test_runner_version = "1.0.2"
    val test_espresso_core_version = "3.0.2"

    val support_annotations = Deps("com.android.support", "support-annotations", android_support_version)
    val support_v4 = Deps("com.android.support", "support-v4", android_support_version)
    val support_core_utils = Deps("com.android.support", "support-core-utils", android_support_version)
    val appcompat_v7 = Deps("com.android.support", "appcompat-v7", android_support_version)
    val recyclerview_v7 = Deps("com.android.support", "recyclerview-v7", android_support_version)
    val cardview_v7 = Deps("com.android.support", "cardview-v7", android_support_version)
    val v13 = Deps("com.android.support", "support-v1", android_support_version)
    val percent = Deps("com.android.support", "percent", android_support_version)
    val design = Deps("com.android.support", "design", android_support_version)

    val multidex = Deps("com.android.support", "multidex", multidex_version)

    val constraint_layout = Deps("com.android.support.constraint", "constraint-layout", constraint_layout_version)

    val test_runner = Deps("com.android.support.test", "runner", test_runner_version)
    val test_espresso_core = Deps("com.android.support.test.espresso", "espresso-core", test_espresso_core_version)

}