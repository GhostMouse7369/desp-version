package top.laoshuzi.dependencies.deps

object Springframework {

    val spring_version = "5.1.5.RELEASE"
    val spring_boot_version = "2.3.5.RELEASE"
    val spring_cloud_version = "Hoxton.SR8"
    val spring_dependency_management_version = "1.0.10.RELEASE"

    val spring_context = Deps("org.springframework:spring-context", spring_version)

    val spring_boot_starter = Deps("org.springframework.boot", "spring-boot-starter", null)
    val spring_boot_starter_web = Deps("org.springframework.boot", "spring-boot-starter-web", null)
    val spring_boot_starter_actuator = Deps("org.springframework.boot", "spring-boot-starter-actuator", null)
    val spring_boot_starter_data_jpa = Deps("org.springframework.boot", "spring-boot-starter-data-jpa", null)

    val spring_cloud_consul_all = Deps("org.springframework.cloud", "spring-cloud-starter-consul-all", null)
    val spring_cloud_consul_config = Deps("org.springframework.cloud", "spring-cloud-starter-consul-config", null)
    val spring_cloud_consul_discovery = Deps("org.springframework.cloud", "spring-cloud-starter-consul-discovery", null)


    val security_core = Deps("org.springframework.security", "spring-security-core", null)

}