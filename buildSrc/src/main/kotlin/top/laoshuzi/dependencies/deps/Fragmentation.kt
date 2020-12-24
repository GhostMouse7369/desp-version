package top.laoshuzi.dependencies.deps

object Fragmentation {

    val fragmentation_version = "1.3.8"
    val fragmentationx_version = "1.0.1"
    val fragmentation_xuexuan_version = "1.0.6"
    val fragmentationx_xuexuan_version = "1.0.6"

    val fragmentation = Deps("me.yokeyword", "fragmentation", fragmentation_version)

    val fragmentationx = Deps("me.yokeyword", "fragmentationx", fragmentationx_version)
    val fragmentationx_core = Deps("me.yokeyword", "fragmentationx-core", fragmentationx_version)
    val fragmentationx_swipeback = Deps("me.yokeyword", "fragmentationx-swipeback", fragmentationx_version)

    val fragmentationx_xuexuan = Deps("me.xuexuan", "fragmentationx", fragmentationx_xuexuan_version)
    val fragmentationx_xuexuan_core = Deps("me.xuexuan", "fragmentationx-core", fragmentationx_xuexuan_version)
    val fragmentationx_xuexuan_swipeback = Deps("me.xuexuan", "fragmentationx-swipeback", fragmentationx_xuexuan_version)

}
