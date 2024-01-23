package top.laoshuzi.dependencies.deps

object Jdbc {

    val mysql_version = "8.0.33"
    val postgresql_version = "42.6.0"
    val sqlite_version = "3.44.1.0"

    val druid_version = "1.2.20"
    val p6spy_version = "3.9.1"


    val mysql_jdbc = Deps("mysql", "mysql-connector-java", mysql_version)
    val postgresql_jdbc = Deps("org.postgresql", "postgresql", postgresql_version)
    val sqlite_jdbc = Deps("org.xerial", "sqlite-jdbc", sqlite_version)

    val druid = Deps("com.alibaba", "druid-spring-boot-starter", druid_version)
    val p6spy = Deps("p6spy", "p6spy", p6spy_version)


}