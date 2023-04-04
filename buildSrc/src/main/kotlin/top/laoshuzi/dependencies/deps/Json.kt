package top.laoshuzi.dependencies.deps

object Json {

    val fastjson_version = "1.2.56"
    val gson_version = "2.10"
    val jackson_version = "2.12.4"

    val fastjson = Deps("com.alibaba", "fastjson", fastjson_version)

    val gson = Deps("com.google.code.gson", "gson", gson_version)

    val jackson_annotations = Deps("com.fasterxml.jackson.core", "jackson-annotations", jackson_version)
    val jackson_databind = Deps("com.fasterxml.jackson.core", "jackson-databind", jackson_version)
    val jackson_module_kotlin = Deps("com.fasterxml.jackson.module", "jackson-module-kotlin", jackson_version)


}
