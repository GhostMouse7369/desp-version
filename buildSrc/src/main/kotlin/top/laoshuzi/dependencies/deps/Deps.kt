package top.laoshuzi.dependencies.deps

data class Deps(
        var group: String,
        var id: String,
        var version: String? = "+"
) {
    fun gradleString(): String {
        return "$group:$id${version?.let { ":$it" }?:""}"
    }
}

fun deps(deps: Deps): String = deps.gradleString()