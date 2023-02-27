package top.laoshuzi.dependencies.deps

object Kotlinx {

    val kotlinx_datetime_version = "0.4.0"
    val kotlinx_collections_immutable_version = "0.3.5"
    val kotlinx_serialization_version = "1.4.0"
    val kotlinx_cli_version = "0.3.5"

    //    val kotlinx_io_version = "x.x.x"
    val kotlinx_coroutines_version = "1.6.2"

    val kotlinx_datetime =
        Deps("org.jetbrains.kotlinx", "kotlinx-datetime", kotlinx_datetime_version)

    val kotlinx_collections_immutable =
        Deps("org.jetbrains.kotlinx", "kotlinx-collections-immutable", kotlinx_collections_immutable_version)

    val kotlinx_serialization_json =
        Deps("org.jetbrains.kotlinx", "kotlinx-serialization-json", kotlinx_serialization_version)

    val kotlinx_cli =
        Deps("org.jetbrains.kotlinx", "kotlinx-cli", kotlinx_cli_version)

//    val kotlinx_io =
//        Deps("org.jetbrains.kotlinx", "kotlinx-io-jvm", kotlinx_io_version)

    val kotlinx_coroutines_core =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-core", kotlinx_coroutines_version)

    val kotlinx_coroutines_js =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-core-js", kotlinx_coroutines_version)

    val kotlinx_coroutines_native =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-core-native", kotlinx_coroutines_version)

    //Dispatchers.Main context for Android applications.
    val kotlinx_coroutines_android =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-android", kotlinx_coroutines_version)

    //Dispatchers.JavaFx context for JavaFX UI applications.
    val kotlinx_coroutines_javafx =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-javafx", kotlinx_coroutines_version)

    //Dispatchers.Swing context for Swing UI applications.
    val kotlinx_coroutines_swing =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-swing", kotlinx_coroutines_version)

    val kotlinx_coroutines_reactivestreams =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-reactive ", kotlinx_coroutines_version)
    val kotlinx_coroutines_reactor =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-reactor", kotlinx_coroutines_version)
    val kotlinx_coroutines_rx2 =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-rx2", kotlinx_coroutines_version)
    val kotlinx_coroutines_rx3 =
        Deps("org.jetbrains.kotlinx", "kotlinx-coroutines-rx3", kotlinx_coroutines_version)
}