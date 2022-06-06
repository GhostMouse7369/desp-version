package top.laoshuzi.dependencies.config

/**
 * Created by mouse on 2019/6/15.
 */
object AndroidBuildConfig {

    val application_id = "top.laoshuzi.test"
    val version_code: Int = 1
    val version_name = "0.1.0"

    val build_tools = "30.0.2"
    val min_sdk: Int = 19
    val target_sdk: Int = 31
    val test_instrumentation_runner = "android.support.test.runner.AndroidJUnitRunner"
    val consumer_file = "consumer-rules.pro"
    val proguard_file = "proguard-rules.pro"
}