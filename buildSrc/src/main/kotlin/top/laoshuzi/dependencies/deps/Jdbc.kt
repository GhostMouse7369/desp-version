package top.laoshuzi.dependencies.deps

object Jdbc {

    val mysql_version = "8.0.13"
    val sqlite_version = "3.28.0"
    val p6spy_version = "3.9.0"


    val mysql_connector_java = Deps("mysql", "mysql-connector-java", mysql_version)
    val sqlite_jdbc = Deps("org.xerial", "sqlite-jdbc", sqlite_version)

    val p6spy = Deps("p6spy", "p6spy", p6spy_version)

}