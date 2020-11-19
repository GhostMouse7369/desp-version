package top.laoshuzi.dependencies.deps

object MybatisPlus {

    val mybatis_plus_version = "3.2.0"

    val mybatis_plus_generator = Deps("com.baomidou", "mybatis-plus-generator", mybatis_plus_version)
    val mybatis_plus_boot_starter = Deps("com.baomidou", "mybatis-plus-boot-starter", mybatis_plus_version)
    val mybatis_plus_core = Deps("com.baomidou", "mybatis-plus-core", mybatis_plus_version)
    val mybatis_plus_extension = Deps("com.baomidou", "mybatis-plus-extension", mybatis_plus_version)

}