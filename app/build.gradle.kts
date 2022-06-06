import top.laoshuzi.dependencies.config.AndroidBuildConfig
import top.laoshuzi.dependencies.deps.*

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

val signKeyAlias: String by project
val signKeyPassword: String by project
val signStoreFile: String by project
val signStorePassword: String by project

kapt {
    arguments {
        arg("AROUTER_MODULE_NAME", project.name)
    }
}

android {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    compileSdk = AndroidBuildConfig.target_sdk
    defaultConfig {
        applicationId = AndroidBuildConfig.application_id
        minSdk = AndroidBuildConfig.min_sdk
        targetSdk = AndroidBuildConfig.target_sdk
        versionCode = AndroidBuildConfig.version_code
        versionName = AndroidBuildConfig.version_name
        testInstrumentationRunner = AndroidBuildConfig.test_instrumentation_runner
        multiDexEnabled = true
    }
    lint {
        isAbortOnError = false
    }
    buildFeatures {
        viewBinding = true
    }
    dataBinding {
        isEnabled = true
    }
    signingConfigs {
        create("release") {
            keyAlias = signKeyAlias
            keyPassword = signKeyPassword
//            storeFile = file("${project.rootDir}/${signStoreFile}")
            storeFile = file(signStoreFile)
            storePassword = signStorePassword
        }
    }
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                AndroidBuildConfig.proguard_file
            )
        }
        getByName("debug") {
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                AndroidBuildConfig.proguard_file
            )
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar"))))

    //kotlin
    implementation(deps(Kotlin.stdlib_jdk8))

    //tools
    implementation(deps(Common.core))
    implementation(deps(Utilcode.utilcodex))
    implementation("top.laoshuzi.android:androidutils:0.1.1")

    //test
//    testImplementation(deps(Junit.junit))
//    androidTestImplementation(deps(AndroidX.test_runner))
//    androidTestImplementation(deps(AndroidX.test_espresso))

    //koin
    implementation(deps(Koin.android))

    //component
    implementation(deps(AndroidX.multidex))
    implementation(deps(AndroidX.android_material))
    implementation(deps(AndroidX.legacy_support_v4))
    implementation(deps(AndroidX.activity))
    implementation(deps(AndroidX.fragment))
    implementation(deps(AndroidX.appcompat))
    implementation(deps(AndroidX.recyclerview))
    implementation(deps(AndroidX.cardview))
    implementation(deps(AndroidX.constraint_layout))

    //lifecycle
    implementation("top.laoshuzi.android:lifecycleutils:0.1.1")
    implementation(deps(AndroidX.lifecycle_livedata_ktx))
    implementation(deps(AndroidX.lifecycle_viewmodel_ktx))
    implementation(deps(AndroidX.lifecycle_reactivestreams_ktx))
    implementation(deps(AndroidX.lifecycle_extensions))
//    kapt(deps(AndroidX.lifecycle_compiler))

    //room
    implementation(deps(AndroidX.room_runtime))
    implementation(deps(AndroidX.room_rxjava2))
    implementation(deps(AndroidX.room_ktx))
//    implementation(deps(AndroidX.room_guava))
    kapt(deps(AndroidX.room_compiler))

    //paging
    implementation(deps(AndroidX.paging_runtime_ktx))
    implementation(deps(AndroidX.paging_rxjava2_ktx))

    //navigation
    implementation(deps(AndroidX.navigation_fragment_ktx))
    implementation(deps(AndroidX.navigation_ui_ktx))

    //okhttp
    implementation(deps(Okhttp.okhttp))
    implementation(deps(Okhttp.okhttp_logging_interceptor))

    //json
    implementation(deps(Fastjson.fastjson))
    implementation(deps(Jackson.jackson_annotations))
    implementation(deps(Jackson.jackson_databind))

    //glide
    implementation(deps(Glide.glide))
    kapt(deps(Glide.glide_compiler))

    //arouter
    implementation("top.laoshuzi.android:arouterutils:0.1.3")
    implementation(deps(Arouter.api))
    kapt(deps(Arouter.compiler))

    //rxjava
    implementation("top.laoshuzi.android:rxutils:0.1.2")
    implementation(deps(ReactiveX.rx_java))
    implementation(deps(ReactiveX.rx_kotlin))
    implementation(deps(ReactiveX.rx_android))
//    implementation(deps(ReactiveX.rx_http))
//    kapt(deps(ReactiveX.rx_http_compiler))\

    //bus
    implementation(deps(LiveEventBus.live_event_busx))

    //retrofit
//    implementation("top.laoshuzi.android:retrofitutils:0.1.2")
    implementation(deps(Retrofit.retrofit))
    implementation(deps(Retrofit.adapter_rxjava2))
    implementation(deps(Retrofit.converter_gson))
//    implementation(deps(Retrofit.converter_scalars))


    //view
//    implementation("top.laoshuzi.android:kxgraphics:0.1.0")
//    implementation("top.laoshuzi.android:signatureview:0.1.0")
//    implementation("top.laoshuzi.android:calendarview:0.1.1")
//    implementation("top.laoshuzi.android:dialogutils:0.1.0")
//    implementation("top.laoshuzi.android:rvbaseadapter:0.1.0")
//    implementation("top.laoshuzi.android:rvbaseadapter-paging:0.1.0")
//    implementation(deps(Fragmentation.fragmentationx_xuexuan))
    implementation(deps(Adapter.base_recycler_view_adapter))
    implementation(deps(Background.background_libraryx))
}
