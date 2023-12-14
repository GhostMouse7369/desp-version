package top.laoshuzi.dependencies.deps

object Ktor {

    val ktor_version = "2.3.7"


    //Ktor IO
    val io = Deps("io.ktor", "ktor-io", ktor_version)
    val io_jvm = Deps("io.ktor", "ktor-io-jvm", ktor_version)

    //Ktor Network
    val network = Deps("io.ktor", "ktor-network", ktor_version)
    val network_jvm = Deps("io.ktor", "ktor-network-jvm", ktor_version)

    //Ktor HTTP
    val http = Deps("io.ktor", "ktor-http", ktor_version)
    val http_jvm = Deps("io.ktor", "ktor-http-jvm", ktor_version)
    val http_native = Deps("io.ktor", "ktor-http-native", ktor_version)

    //Ktor WebSockets
    val websockets = Deps("io.ktor", "ktor-websockets", ktor_version)
    val websockets_jvm = Deps("io.ktor", "ktor-websockets-jvm", ktor_version)

    //Ktor Auth
    val auth = Deps("io.ktor", "ktor-auth", ktor_version)

    //Ktor Serialization
    val serialization = Deps("io.ktor", "ktor-serialization", ktor_version)
    val serialization_kotlinx_gson = Deps("io.ktor", "ktor-serialization-gson", ktor_version)
    val serialization_kotlinx_jackson = Deps("io.ktor", "ktor-serialization-jackson", ktor_version)
    val serialization_kotlinx_json = Deps("io.ktor", "ktor-serialization-kotlinx-json", ktor_version)
    val serialization_kotlinx_xml = Deps("io.ktor", "ktor-serialization-kotlinx-xml", ktor_version)
    val serialization_kotlinx_cbor = Deps("io.ktor", "ktor-serialization-kotlinx-cbor", ktor_version)

    //Ktor Client
    val client = Deps("io.ktor", "ktor-client", ktor_version)

    //Ktor Server
    val server = Deps("io.ktor", "ktor-server", ktor_version)

    //Ktor Client Core
    val client_core = Deps("io.ktor", "ktor-client-core", ktor_version)
    val client_core_jvm = Deps("io.ktor", "ktor-client-core-jvm", ktor_version)
    val client_core_js = Deps("io.ktor", "ktor-client-core-js", ktor_version)
    val client_core_native = Deps("io.ktor", "ktor-client-core-native", ktor_version)
    val client_core_linuxx64 = Deps("io.ktor", "ktor-client-core-linuxx64", ktor_version)
    val client_core_mingwx64 = Deps("io.ktor", "ktor-client-core-mingwx64", ktor_version)
    val client_core_iosx64 = Deps("io.ktor", "ktor-client-core-iosx64", ktor_version)
    val client_core_iosarm64 = Deps("io.ktor", "ktor-client-core-iosarm64", ktor_version)
    val client_core_macosx64 = Deps("io.ktor", "ktor-client-core-macosx64", ktor_version)

    //Ktor Client Apache (JVM)
    val client_apache = Deps("io.ktor", "ktor-client-apache", ktor_version)

    //Ktor Client Java (JVM)
    val client_java = Deps("io.ktor", "ktor-client-java", ktor_version)

    //Ktor Client Jetty (JVM)
    val client_jetty = Deps("io.ktor", "ktor-client-jetty", ktor_version)

    //Ktor Client Curl (Native)
    val client_curl = Deps("io.ktor", "ktor-client-curl", ktor_version)

    //Ktor Client Darwin (Native)
    val client_darwin = Deps("io.ktor", "ktor-client-darwin", ktor_version)

    //Ktor Client CIO (JVM, Android, Native)
    val client_cio = Deps("io.ktor", "ktor-client-cio", ktor_version)

    //Ktor Client OkHttp (JVM, Android)
    val client_okhttp = Deps("io.ktor", "ktor-client-okhttp", ktor_version)

    //Ktor Client JS (JavaScript)
    val client_js = Deps("io.ktor", "ktor-client-js", ktor_version)

    //Ktor Client Android (JVM, Android)
    val client_android = Deps("io.ktor", "ktor-client-android", ktor_version)

    //Ktor Client IOS
    val client_ios = Deps("io.ktor", "ktor-client-ios", ktor_version)
    val client_ios_iosx64 = Deps("io.ktor", "ktor-client-ios-iosx64", ktor_version)
    val client_ios_iosarm64 = Deps("io.ktor", "ktor-client-ios-iosarm64", ktor_version)

    //Ktor Client WebSockets
    val client_websockets = Deps("io.ktor", "ktor-client-websockets", ktor_version)
    val client_websockets_jvm = Deps("io.ktor", "ktor-client-websockets-jvm", ktor_version)

    //Ktor Client Serialization
    val client_serialization = Deps("io.ktor", "ktor-client-serialization", ktor_version)
    val client_serialization_jvm = Deps("io.ktor", "ktor-client-serialization-jvm", ktor_version)
    val client_serialization_js = Deps("io.ktor", "ktor-client-serialization-js", ktor_version)
    val client_serialization_iosx64 = Deps("io.ktor", "ktor-client-serialization-iosx64", ktor_version)

    //Ktor Client JSON
    val client_json = Deps("io.ktor", "ktor-client-json", ktor_version)
    val client_json_jvm = Deps("io.ktor", "ktor-client-json-jvm", ktor_version)
    val client_json_js = Deps("io.ktor", "ktor-client-json-js", ktor_version)

    //Ktor Client Jackson
    val client_jackson = Deps("io.ktor", "ktor-client-jackson", ktor_version)

    //Ktor Client Gson
    val client_gson = Deps("io.ktor", "ktor-client-gson", ktor_version)

    //Ktor Client Logging
    val client_logging = Deps("io.ktor", "ktor-client-logging", ktor_version)
    val client_logging_jvm = Deps("io.ktor", "ktor-client-logging-jvm", ktor_version)

    //Ktor Client Content Negotiation
    val client_content_negotiation = Deps("io.ktor", "ktor-client-content-negotiation", ktor_version)
    val client_content_negotiation_jvm = Deps("io.ktor", "ktor-client-content-negotiation-jvm", ktor_version)

    //Ktor Client Auth
    val client_auth = Deps("io.ktor", "ktor-client-auth", ktor_version)

    //Ktor Client Encoding
    val client_encoding = Deps("io.ktor", "ktor-client-encoding", ktor_version)

    //Ktor Client Mock
    val client_mock = Deps("io.ktor", "ktor-client-mock", ktor_version)


    //Ktor Server Core
    val server_core = Deps("io.ktor", "ktor-server-core", ktor_version)
    val server_core_jvm = Deps("io.ktor", "ktor-server-core-jvm", ktor_version)

    //Ktor Server Netty
    val server_netty = Deps("io.ktor", "ktor-server-netty", ktor_version)

    //Ktor Server Websockets
    val server_websockets = Deps("io.ktor", "ktor-server-websockets", ktor_version)

    //Ktor Server CIO
    val server_cio = Deps("io.ktor", "ktor-server-cio", ktor_version)

    //Ktor Server Auth
    val server_auth = Deps("io.ktor", "ktor-server-auth", ktor_version)

    //Ktor Server Auth JWT
    val server_auth_jwt = Deps("io.ktor", "ktor-server-auth-jwt", ktor_version)

    //Ktor Server Auth LDAP
    val server_auth_ldap = Deps("io.ktor", "ktor-server-auth-ldap", ktor_version)

    //Ktor Server Sessions
    val server_sessions = Deps("io.ktor", "ktor-server-sessions", ktor_version)

    //Ktor Server Content Negotiation
    val server_content_negotiation = Deps("io.ktor", "ktor-server-content-negotiation", ktor_version)

    //Ktor Server Cors
    val server_cors = Deps("io.ktor", "ktor-server-cors", ktor_version)

    //Ktor Server Html Builder
    val server_html_builder = Deps("io.ktor", "ktor-server-html-builder", ktor_version)

    //Ktor Server Locations
    val server_locations = Deps("io.ktor", "ktor-server-locations", ktor_version)

    //Ktor Server Webjars
    val server_webjars = Deps("io.ktor", "ktor-server-webjars", ktor_version)

    //Ktor Server Auto Head Response
    val server_auto_head_response = Deps("io.ktor", "ktor-server-auto-head-response", ktor_version)

    //Ktor Server Default Headers
    val server_default_headers = Deps("io.ktor", "ktor-server-default-headers", ktor_version)

    //Ktor Server Caching Headers
    val server_caching_headers = Deps("io.ktor", "ktor-server-caching-headers", ktor_version)

    //Ktor Server Conditional Headers
    val server_conditional_headers = Deps("io.ktor", "ktor-server-conditional-headers", ktor_version)

    //Ktor Server Forwarded Headers
    val server_forwarded_headers = Deps("io.ktor", "ktor-server-forwarded-headers", ktor_version)

    //Ktor Server status pages
    val server_status_pages = Deps("io.ktor", "ktor-server-status-pages", ktor_version)

}