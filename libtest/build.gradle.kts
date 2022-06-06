import top.laoshuzi.dependencies.config.AndroidBuildConfig
import top.laoshuzi.dependencies.deps.*
import top.laoshuzi.dependencies.publish.MavenPublish.mavenAndroidPublication
import top.laoshuzi.dependencies.publish.MavenPublish.mavenRepository

plugins {
    id("com.android.library")
    kotlin("android")
    `maven-publish`
}

group = "top.laoshuzi.android"
version = "0.1.0"
//val artifactId = "libtest"

val ziweiRepositoryDomainName: String by project
val ziweiRepositoryUsername: String by project
val ziweiRepositoryPassword: String by project

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    compileSdk = AndroidBuildConfig.target_sdk
    defaultConfig {
        minSdk = AndroidBuildConfig.min_sdk
        targetSdk = AndroidBuildConfig.target_sdk
        testInstrumentationRunner = AndroidBuildConfig.test_instrumentation_runner
        consumerProguardFiles(AndroidBuildConfig.consumer_file)
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                AndroidBuildConfig.proguard_file
            )
        }
    }
}

dependencies {
    api(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(deps(Kotlin.stdlib_jdk8))
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("mavenAndroid") {
                mavenAndroidPublication(project)
            }
        }
        repositories {
            maven {
                mavenRepository(
                    project,
                    ziweiRepositoryDomainName,
                    ziweiRepositoryUsername,
                    ziweiRepositoryPassword
                )
                isAllowInsecureProtocol = true
            }
        }
    }
}
