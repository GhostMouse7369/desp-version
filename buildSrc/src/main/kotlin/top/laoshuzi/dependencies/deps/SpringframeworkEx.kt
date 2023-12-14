package top.laoshuzi.dependencies.deps

/**
 * Created by laoshuzi on 2023/4/4.
 */
object SpringframeworkEx {

    val querydsl_version = "5.0.0"
    val querydsl_jakarta_version = "5.0.0:jakarta"
    val mybatis_plus_version = "3.2.0"
    val swagger_version = "2.9.2"
    val springdoc_version = "2.0.4"
    val knife4j_version = "4.1.0"


    val querydsl_core = Deps("com.querydsl", "querydsl-core", querydsl_version)
    val querydsl_jpa = Deps("com.querydsl", "querydsl-jpa", querydsl_version)
    val querydsl_jpa_jakarta = Deps("com.querydsl", "querydsl-jpa", querydsl_jakarta_version)
    val querydsl_apt_jakarta = Deps("com.querydsl", "querydsl-apt", querydsl_jakarta_version)

    val mybatis_plus_generator = Deps("com.baomidou", "mybatis-plus-generator", mybatis_plus_version)
    val mybatis_plus_boot_starter = Deps("com.baomidou", "mybatis-plus-boot-starter", mybatis_plus_version)
    val mybatis_plus_core = Deps("com.baomidou", "mybatis-plus-core", mybatis_plus_version)
    val mybatis_plus_extension = Deps("com.baomidou", "mybatis-plus-extension", mybatis_plus_version)

    val swagger = Deps("io.springfox", "springfox-swagger2", swagger_version)
    val swagger_ui = Deps("io.springfox", "springfox-swagger-ui", swagger_version)

    val springdoc_openapi_starter_common = Deps("org.springdoc", "springdoc-openapi-starter-common", springdoc_version)
    val springdoc_openapi_starter_webmvc_ui = Deps("org.springdoc", "springdoc-openapi-starter-webmvc-ui", springdoc_version)
    val springdoc_openapi_starter_webflux_ui = Deps("org.springdoc", "springdoc-openapi-starter-webflux-ui", springdoc_version)

    val knife4j_openapi3_ui = Deps("com.github.xiaoymin", "knife4j-openapi3-ui", knife4j_version)
    val knife4j_openapi3_starter = Deps("com.github.xiaoymin", "knife4j-openapi3-jakarta-spring-boot-starter", knife4j_version)

}