package top.laoshuzi.dependencies.deps

object Jackson {

    val jackson_version = "2.9.7"

    val jackson_annotations = Deps("com.fasterxml.jackson.core", "jackson-annotations", jackson_version)
    val jackson_databind = Deps("com.fasterxml.jackson.core", "jackson-databind", jackson_version)

}
