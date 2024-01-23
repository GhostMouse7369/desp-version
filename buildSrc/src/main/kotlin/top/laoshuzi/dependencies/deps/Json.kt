package top.laoshuzi.dependencies.deps

object Json {

    val fastjson_version = "2.0.45"
    val fastjson2_version = "2.0.46"
    val gson_version = "2.10.1"
    val jackson_version = "2.16.1"

    val fastjson = Deps("com.alibaba", "fastjson", fastjson_version)
    val fastjson2 = Deps("com.alibaba.fastjson2", "fastjson2", fastjson2_version)

    val gson = Deps("com.google.code.gson", "gson", gson_version)

    val jackson_annotations = Deps("com.fasterxml.jackson.core", "jackson-annotations", jackson_version)
    val jackson_databind = Deps("com.fasterxml.jackson.core", "jackson-databind", jackson_version)
    val jackson_datatype_jsr310 = Deps("com.fasterxml.jackson.datatype", "jackson-datatype-jsr310", jackson_version)
    val jackson_module_kotlin = Deps("com.fasterxml.jackson.module", "jackson-module-kotlin", jackson_version)


}
