package top.laoshuzi.dependencies.deps

object Apache {

    val commons_lang_version = "3.8"
    val commons_collections_version = "4.3"

    val logback_version = "1.2.3"
    val slf4j_version = "1.7.25"
    val lombok_version = "1.18.4"

    val commons_lang = Deps("org.apache.commons", "commons-lang3", commons_lang_version)
    val commons_collections = Deps("org.apache.commons", "commons-collections4", commons_collections_version)

    val logback_core = Deps("ch.qos.logback", "logback-core", logback_version)
    val logback_classic = Deps("ch.qos.logback", "logback-classic", logback_version)

    val slf4j = Deps("org.slf4j", "slf4j-api", slf4j_version)

    val lombok = Deps("org.projectlombok", "lombok", lombok_version)

}