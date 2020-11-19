package top.laoshuzi.dependencies.deps

object Fragmentation {

    val fragmentation_version = "1.3.7"
    val fragmentationx_version = "1.0.1"

    val fragmentation = Deps("me.yokeyword", "fragmentation", fragmentation_version)

    val fragmentationx = Deps("me.yokeyword", "fragmentationx", fragmentationx_version)
    val fragmentationx_core = Deps("me.yokeyword", "fragmentationx-core", fragmentationx_version)
    val fragmentationx_swipeback = Deps("me.yokeyword", "fragmentationx-swipeback", fragmentationx_version)

}
