package top.laoshuzi.dependencies.deps

object Jackson {

    val jackson_version = "2.12.4"

    val jackson_annotations = Deps("com.fasterxml.jackson.core", "jackson-annotations", jackson_version)
    val jackson_databind = Deps("com.fasterxml.jackson.core", "jackson-databind", jackson_version)

    val jackson_module_kotlin = Deps("com.fasterxml.jackson.module", "jackson-module-kotlin", jackson_version)

}
