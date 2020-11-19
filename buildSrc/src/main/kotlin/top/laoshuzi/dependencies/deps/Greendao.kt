package top.laoshuzi.dependencies.deps

object Greendao {

    val greendao_version = "3.2.0"

    val plugin = Deps("org.greenrobot", "greendao-gradle-plugin", greendao_version)
    val greendao = Deps("org.greenrobot", "greendao", greendao_version)

}