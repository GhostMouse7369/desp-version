package top.laoshuzi.dependencies.deps

object Springframework {

    val spring_version = "5.4.5"
    val spring_boot_version = "3.0.0"
    val spring_cloud_version = "2022.0.0-M5"
    val spring_dependency_management_version = "1.1.0"

    val spring_context =
        Deps("org.springframework", "spring-context", null)

    val spring_boot =
        Deps("org.springframework.boot", "spring-boot", null)
    val spring_boot_starter =
        Deps("org.springframework.boot", "spring-boot-starter", null)
    val spring_boot_starter_test =
        Deps("org.springframework.boot", "spring-boot-starter-test", null)
    val spring_boot_starter_web =
        Deps("org.springframework.boot", "spring-boot-starter-web", null)
    val spring_boot_starter_security =
        Deps("org.springframework.boot", "spring-boot-starter-security", null)
    val spring_boot_starter_actuator =
        Deps("org.springframework.boot", "spring-boot-starter-actuator", null)
    val spring_boot_starter_jdbc =
        Deps("org.springframework.boot", "spring-boot-starter-jdbc", null)
    val spring_boot_starter_data_jpa =
        Deps("org.springframework.boot", "spring-boot-starter-data-jpa", null)
    val spring_boot_starter_data_redis =
        Deps("org.springframework.boot", "spring-boot-starter-data-redis", null)

    val spring_cloud_consul_all =
        Deps("org.springframework.cloud", "spring-cloud-starter-consul-all", null)
    val spring_cloud_consul_config =
        Deps("org.springframework.cloud", "spring-cloud-starter-consul-config", null)
    val spring_cloud_consul_discovery =
        Deps("org.springframework.cloud", "spring-cloud-starter-consul-discovery", null)

    val data_redis =
        Deps("org.springframework.data", "spring-data-redis", null)

    val security_test =
        Deps("org.springframework.security", "spring-security-test", null)
    val security_core =
        Deps("org.springframework.security", "spring-security-core", null)
    val security_web =
        Deps("org.springframework.security", "spring-security-web", null)
    val security_config =
        Deps("org.springframework.security", "spring-security-config", null)
    val security_remoting =
        Deps("org.springframework.security", "spring-security-remoting", null)
    val security_acl =
        Deps("org.springframework.security", "spring-security-acl", null)
    val security_cas =
        Deps("org.springframework.security", "spring-security-cas", null)
    val security_oauth2_core =
        Deps("org.springframework.security", "spring-security-oauth2-core", null)
    val security_oauth2_jose =
        Deps("org.springframework.security", "spring-security-oauth2-jose", null)
    val security_oauth2_client =
        Deps("org.springframework.security", "spring-security-oauth2-client", null)
    val security_oauth2_resource_server =
        Deps("org.springframework.security", "spring-security-oauth2-resource-server", null)

}