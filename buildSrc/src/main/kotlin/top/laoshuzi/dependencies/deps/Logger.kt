package top.laoshuzi.dependencies.deps

object Logger {

    val logback_version = "1.2.3"
    val slf4j_version = "1.7.25"
    val log4j_version = "2.14.0"


    val logback_core = Deps("ch.qos.logback", "logback-core", logback_version)
    val logback_classic = Deps("ch.qos.logback", "logback-classic", logback_version)

    val slf4j = Deps("org.slf4j", "slf4j-api", slf4j_version)
    val log4j = Deps("org.apache.logging.log4j", "log4j-api", log4j_version)

}