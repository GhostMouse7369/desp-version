import top.laoshuzi.dependencies.deps.*
import java.util.*
import java.io.FileInputStream

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

val application_id: String by project
val version_code: String by project
val version_name: String by project
val min_sdk_version: String by project
val target_sdk_version: String by project
val test_instrumentation_runner: String by project
val consumer_pro_file: String by project
val proguard_pro_file: String by project

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
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }
    compileSdk = target_sdk_version.toInt()
    defaultConfig {
        applicationId = application_id
        versionCode = version_code.toInt()
        versionName = version_name
        minSdk = min_sdk_version.toInt()
        targetSdk = target_sdk_version.toInt()
        testInstrumentationRunner = test_instrumentation_runner
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
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), proguard_pro_file)
        }
        getByName("debug") {
            isDebuggable = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), proguard_pro_file)
        }
    }
    flavorDimensions += "version"
    productFlavors {
        create("dev") {
            dimension = "version"
            applicationId = "${application_id}.test"
            manifestPlaceholders["app_name"] = "版本依赖-测试"
            resValue("string", "api_base_url", "http://www.qncxin.com")
        }
        create("stable") {
            dimension = "version"
            manifestPlaceholders["app_name"] = "版本依赖"
            resValue("string", "api_base_url", "http://www.qncxin.com")
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
    implementation(deps(Kotlinx.kotlinx_coroutines_android))
//    implementation(deps(Kotlinx.kotlinx_coroutines_rx2))

    //tools
    implementation(deps(AndroidEx.utilcodex))
    implementation("top.laoshuzi.android:androidutils:0.1.4")
    implementation("top.laoshuzi.android:viewbindingutils:0.1.0")
//    implementation("cn.hutool:hutool-all:5.4.4")

    //test
//    testImplementation(deps(Junit.junit))
//    androidTestImplementation(deps(AndroidX.test_runner))
//    androidTestImplementation(deps(AndroidX.test_espresso))

    //koin
    implementation(deps(Koin.android))

    //json
    implementation(deps(Json.fastjson))
    implementation(deps(Json.jackson_annotations))
    implementation(deps(Json.jackson_databind))

    //rxjava
    implementation("top.laoshuzi.android:rxutils:0.1.2")
    implementation(deps(ReactiveX.rx_java))
    implementation(deps(ReactiveX.rx_kotlin))
    implementation(deps(ReactiveX.rx_android))

    //okhttp
    implementation(deps(Okhttp.okhttp))
    implementation(deps(Okhttp.okhttp_logging_interceptor))

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
    implementation(deps(AndroidX.viewpager2))

    //lifecycle
    implementation("top.laoshuzi.android:lifecycleutils:0.1.5")
    implementation(deps(AndroidX.lifecycle_viewmodel_ktx))
    implementation(deps(AndroidX.lifecycle_reactivestreams_ktx))
//    implementation(deps(AndroidX.lifecycle_livedata_ktx))
//    implementation(deps(AndroidX.lifecycle_extensions))
//    kapt(deps(AndroidX.lifecycle_compiler))

    //room
    implementation(deps(AndroidX.room_runtime))
    implementation(deps(AndroidX.room_ktx))
    kapt(deps(AndroidX.room_compiler))

    //datastore
    implementation(deps(AndroidX.datastore))
    implementation(deps(AndroidX.datastore_preferences))

    //paging
//    implementation(deps(AndroidX.paging_runtime))
//    implementation(deps(AndroidX.paging_rxjava2))

    //navigation
    implementation(deps(AndroidX.navigation_fragment_ktx))
    implementation(deps(AndroidX.navigation_ui_ktx))

    //bus
//    implementation(deps(LiveEventBus.live_event_busx))

    //arouter
    implementation("top.laoshuzi.android:arouterutils:0.1.3")
    implementation(deps(AndroidEx.arouter_api))
    kapt(deps(AndroidEx.arouter_compiler))

    //bus
//    implementation(deps(LiveEventBus.live_event_busx))

    //ktor
    implementation(deps(Ktor.client_okhttp))
    implementation(deps(Ktor.client_gson))
    implementation(deps(Ktor.client_content_negotiation))
//    implementation(deps(Ktor.client_auth))
//    implementation(deps(Ktor.client_logging))

    //retrofit
//    implementation("top.laoshuzi.android:retrofitutils:0.1.2")
    implementation(deps(AndroidEx.retrofit))
    implementation(deps(AndroidEx.retrofit_converter_gson))

    //glide
    implementation(deps(AndroidEx.glide))
    kapt(deps(AndroidEx.glide_compiler))


    //view
//    implementation("top.laoshuzi.android:kxgraphics:0.1.0")
//    implementation("top.laoshuzi.android:signatureview:0.1.0")
//    implementation("top.laoshuzi.android:calendarview:0.1.1")
//    implementation("top.laoshuzi.android:dialogutils:0.1.0")
//    implementation("top.laoshuzi.android:rvbaseadapter:0.1.0")
//    implementation("top.laoshuzi.android:rvbaseadapter-paging:0.1.0")
    //
    implementation(deps(AndroidEx.fragmentationx))
    implementation(deps(AndroidEx.recycler_view_base_adapter))
    implementation(deps(AndroidEx.background_libraryx))
    implementation(deps(AndroidEx.android_auto_size))
    implementation(deps(AndroidEx.consecutive_scroller))
    implementation(deps(AndroidEx.smart_refresh_layout_kernel))
    implementation(deps(AndroidEx.smart_refresh_layout_header_classics))
    implementation(deps(AndroidEx.xpopup))
}
