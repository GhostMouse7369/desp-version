package top.laoshuzi.dependencies.deps

object Arouter {

    val arouter_api_version = "1.5.0"
    val arouter_compiler_version = "1.2.2"
    val arouter_register_version = "1.0.2"

    val api = Deps("com.alibaba", "arouter-api", arouter_api_version)
    val compiler = Deps("com.alibaba", "arouter-compiler", arouter_compiler_version)
    val register = Deps("com.alibaba", "arouter-register", arouter_register_version)

}