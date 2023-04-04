import top.laoshuzi.dependencies.config.AndroidBuildConfig
import top.laoshuzi.dependencies.deps.*
import java.util.Properties
import java.io.FileInputStream

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

val keystoreProperties = Properties().apply {
    load(FileInputStream(rootProject.file("keystore.properties")))
}

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
//        ndk {
//            abiFilters.addAll(mutableSetOf("armeabi", "armeabi-v7a", "armeabi-v8a", "x86"))
//        }
    }
    lint {
        abortOnError = false
    }
    viewBinding {
        enable = true
    }
    dataBinding {
        enable = true
    }
    signingConfigs {
        create("release") {
            storeFile = file(keystoreProperties["signStoreFile"] as String)
            storePassword = keystoreProperties["signStorePassword"] as String
            keyAlias = keystoreProperties["signKeyAlias"] as String
            keyPassword = keystoreProperties["signKeyPassword"] as String
        }
    }
    buildTypes {
        getByName("release") {
            isDebuggable = false
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), AndroidBuildConfig.proguard_file
            )
        }
        getByName("debug") {
            isDebuggable = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), AndroidBuildConfig.proguard_file
            )
        }
    }
    flavorDimensions += "version"
    productFlavors {
        create("dev") {
            dimension = "version"
            applicationId = "${AndroidBuildConfig.application_id}.test"
            manifestPlaceholders["app_name"] = "医院社区-测试"
            resValue("string", "api_base_url", "http://47.114.72.255:8080/medical_waste-0.0.1/")
        }
        create("stable") {
            dimension = "version"
            manifestPlaceholders["app_name"] = "医院社区"
            resValue("string", "api_base_url", "http://223.151.53.85:9090/medical_waste-0.0.1/")
        }
    }

    applicationVariants.all {
        val variant = this
        outputs.map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }.forEach { output ->
            val outputFileName = "app-${variant.baseName}-${variant.versionName}_${variant.versionCode}.apk"
            output.outputFileName = outputFileName
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar"))))

    //kotlin
    implementation(deps(Kotlin.stdlib_jdk8))

    //tools
    implementation(deps(Utilcode.utilcodex))
    implementation("top.laoshuzi.android:androidutils:0.1.2")
    implementation("top.laoshuzi.android:viewbindingutils:0.1.0")

    //test
//    testImplementation(deps(Junit.junit))
//    androidTestImplementation(deps(AndroidX.test_runner))
//    androidTestImplementation(deps(AndroidX.test_espresso))

    //koin
    implementation(deps(Koin.android))

    //component
    implementation(deps(Android.android_material))
    implementation(deps(AndroidX.multidex))
    implementation(deps(AndroidX.legacy_support_v4))
    implementation(deps(AndroidX.activity))
    implementation(deps(AndroidX.fragment))
    implementation(deps(AndroidX.appcompat))
    implementation(deps(AndroidX.recyclerview))
    implementation(deps(AndroidX.cardview))
    implementation(deps(AndroidX.constraintlayout))

    //lifecycle
    implementation(deps(AndroidX.lifecycle_viewmodel_ktx))
    implementation(deps(AndroidX.lifecycle_reactivestreams_ktx))
//    implementation(deps(AndroidX.lifecycle_livedata_ktx))
//    implementation(deps(AndroidX.lifecycle_extensions))
//    kapt(deps(AndroidX.lifecycle_compiler))

    //room
    implementation(deps(AndroidX.room_runtime))
    implementation(deps(AndroidX.room_rxjava2))
    implementation(deps(AndroidX.room_ktx))
//    implementation(deps(AndroidX.room_guava))
    kapt(deps(AndroidX.room_compiler))

    //paging
    implementation(deps(AndroidX.paging_runtime))
//    implementation(deps(AndroidX.paging_rxjava2))

    //navigation
    implementation(deps(AndroidX.navigation_fragment_ktx))
    implementation(deps(AndroidX.navigation_ui_ktx))

    //okhttp
    implementation(deps(Okhttp.okhttp))
    implementation(deps(Okhttp.okhttp_logging_interceptor))

    //json
    implementation(deps(Json.fastjson))
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
//    implementation(deps(LiveEventBus.live_event_busx))

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
//    implementation("com.github.li-xiaojun:XPopup:2.8.3")
    implementation(deps(Adapter.base_recycler_view_adapter))
    implementation(deps(Background.background_libraryx))
}
