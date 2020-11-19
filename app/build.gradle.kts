import top.laoshuzi.dependencies.BuildConfig
import top.laoshuzi.dependencies.deps.*

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

kapt {
    arguments {
        arg("AROUTER_MODULE_NAME", project.name)
    }
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    compileSdkVersion(BuildConfig.target_sdk)
    defaultConfig {
        applicationId = BuildConfig.application_id
        minSdkVersion(BuildConfig.min_sdk)
        targetSdkVersion(BuildConfig.target_sdk)
        versionCode = BuildConfig.version_code
        versionName = BuildConfig.version_name
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
//        javaCompileOptions {
//            annotationProcessorOptions {
//                arguments = mapOf("AROUTER_MODULE_NAME" to project.name)
//            }
//        }
    }
    signingConfigs {
        create("release") {
            keyAlias = BuildConfig.sign_key_alias
            keyPassword = BuildConfig.sign_key_password
            storeFile = file(BuildConfig.sign_store_file)
            storePassword = BuildConfig.sign_store_password
        }
    }
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(deps(Kotlin.stdlib_jdk8))

    testImplementation(deps(Junit.junit))
    androidTestImplementation(deps(AndroidX.test_runner))
//    androidTestImplementation(deps(AndroidX.test_espresso))

    implementation(deps(AndroidX.android_material))
    implementation(deps(AndroidX.legacy_support_v4))
    implementation(deps(AndroidX.appcompat))
    implementation(deps(AndroidX.recyclerview))
    implementation(deps(AndroidX.cardview))
    implementation(deps(AndroidX.constraint_layout))

    implementation(deps(AndroidX.lifecycle_extensions))
    implementation(deps(AndroidX.lifecycle_viewmodel))
    implementation(deps(AndroidX.lifecycle_livedata))
    implementation(deps(AndroidX.lifecycle_runtime))
    implementation(deps(AndroidX.lifecycle_common_java8))
    implementation(deps(AndroidX.lifecycle_reactivestreams))
    kapt(deps(AndroidX.lifecycle_compiler))

    implementation(deps(AndroidX.room_runtime))
    implementation(deps(AndroidX.room_rxjava2))
    implementation(deps(AndroidX.room_ktx))
    implementation(deps(AndroidX.room_guava))
    kapt(deps(AndroidX.room_compiler))

    implementation(deps(AndroidX.navigation_fragment_ktx))
    implementation(deps(AndroidX.navigation_ui_ktx))

    implementation(deps(Koin.android))
    implementation(deps(Koin.android_ext))
    implementation(deps(Koin.android_scope))
    implementation(deps(Koin.android_viewmodel))

    implementation(deps(Arouter.api))
    kapt(deps(Arouter.compiler))

    implementation(deps(ReactiveX.rx_java))
    implementation(deps(ReactiveX.rx_kotlin))
    implementation(deps(ReactiveX.rx_android))

    implementation(deps(Retrofit.retrofit))
    implementation(deps(Retrofit.adapter_rxjava2))
    implementation(deps(Retrofit.converter_gson))

    implementation(deps(Fastjson.fastjson))
    implementation(deps(Jackson.jackson_annotations))
    implementation(deps(Jackson.jackson_databind))

    implementation(deps(Utilcode.utilcode))

    implementation(deps(RvAdapter.zhy_rv_adapter))

    implementation(deps(Fragmentation.fragmentationx))

}
