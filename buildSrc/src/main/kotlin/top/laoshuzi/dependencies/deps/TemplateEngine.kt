package top.laoshuzi.dependencies.deps

object TemplateEngine {

    val velocity_version = "2.1"
    val freemarker_version = "2.3.29"
    val ibeetl_version = "3.0.13.RELEASE"

    val velocity = Deps("org.apache.velocity", "velocity-engine-core", velocity_version)
    val freemarker = Deps("org.freemarker", "freemarker", freemarker_version)
    val ibeetl = Deps("com.ibeetl", "ibeetl", ibeetl_version)

}