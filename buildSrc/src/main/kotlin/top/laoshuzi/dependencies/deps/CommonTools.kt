package top.laoshuzi.dependencies.deps

object CommonTools {

    val commons_lang_version = "3.8"
    val commons_collections_version = "4.3"
    val commons_io_version = "2.11.0"
    val commons_codec_version = "1.16.0"

    val lombok_version = "1.18.4"
    val mapstruct_version = "1.5.5.Final"

    val hutool_version = "5.8.26"

    val commons_lang = Deps("org.apache.commons", "commons-lang3", commons_lang_version)
    val commons_collections = Deps("org.apache.commons", "commons-collections4", commons_collections_version)
    val commons_io = Deps("commons-io", "commons-io", commons_io_version)
    val commons_codec = Deps("commons-codec", "commons-codec", commons_codec_version)

    val lombok = Deps("org.projectlombok", "lombok", lombok_version)
    val mapstruct = Deps("org.mapstruct", "mapstruct", mapstruct_version)
    val mapstruct_processor = Deps("org.mapstruct", "mapstruct-processor", mapstruct_version)

    val hutool = Deps("cn.hutool", "hutool-all", hutool_version)

}