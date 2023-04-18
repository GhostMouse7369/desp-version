package top.laoshuzi.dependencies.deps

/**
 * Created by laoshuzi on 2023/4/4.
 */
object SpringframeworkEx {

    val mybatis_plus_version = "3.2.0"
    val swagger_version = "2.9.2"

    val mybatis_plus_generator = Deps("com.baomidou", "mybatis-plus-generator", mybatis_plus_version)
    val mybatis_plus_boot_starter = Deps("com.baomidou", "mybatis-plus-boot-starter", mybatis_plus_version)
    val mybatis_plus_core = Deps("com.baomidou", "mybatis-plus-core", mybatis_plus_version)
    val mybatis_plus_extension = Deps("com.baomidou", "mybatis-plus-extension", mybatis_plus_version)

    val swagger = Deps("io.springfox", "springfox-swagger2", swagger_version)
    val swagger_ui = Deps("io.springfox", "springfox-swagger-ui", swagger_version)

}