package top.laoshuzi.dependencies.deps

/**
 * reference resources: https://developer.android.com/jetpack/androidx/versions?hl=zh-cn
 */
object AndroidX {

    val activity_version = "1.6.1"
    val ads_version = "1.0.0-alpha04"
    val annotation_version = "1.6.0"
    val appcompat_version = "1.6.1"
    val appsearch_version = "1.1.0-alpha02"
    val arch_core_version = "2.2.0"
    val asynclayoutinflater_version = "1.0.0"
    val autofill_version = "1.1.0"
    val benchmark_version = "1.1.1"
    val biometric_version = "1.1.0"
    val browser_version = "1.5.0"
    val car_app_version = "1.2.0"
    val camera_version = "1.2.1"
    val cardview_version = "1.0.0"
    val collection_version = "1.2.0"
    val compose_version = "1.2.0"
    val compose_animation_version = "1.3.3"
    val compose_compiler_version = "1.4.3"
    val compose_foundation_version = "1.3.1"
    val compose_material_version = "1.3.1"
    val compose_material3_version = "1.0.1"
    val compose_runtime_version = "1.3.3"
    val compose_ui_version = "1.3.3"
    val concurrent_version = "1.1.0"
    val constraintlayout_version = "2.1.4"
    val contentpager_version = "1.0.0"
    val coordinatorlayout_version = "1.2.0"
    val core_version = "1.9.0"
    val cursoradapter_version = "1.0.0"
    val customview_version = "1.1.0"
    val databinding_version = "3.5.0"
    val datastore_version = "1.0.0"
    val documentfile_version = "1.0.1"
    val draganddrop_version = "1.0.0"
    val drawerlayout_version = "1.1.1"
    val dynamicanimation_version = "1.0.0"
    val emoji_version = "1.1.0"
    val emoji2_version = "1.2.0"
    val enterprise_version = "1.1.0"
    val exifinterface_version = "1.3.6"
    val fragment_version = "1.5.5"
    val games_version = "1.2.2"
    val gridlayout_version = "1.0.0"
    val hilt_version = "1.0.0"
    val interpolator_version = "1.0.0"
    val leanback_version = "1.0.0"
    val legacy_version = "1.0.0"
    val lifecycle_version = "2.5.1"
    val loader_version = "1.1.0"
    val localbroadcastmanager_version = "1.1.0"
    val media_version = "1.6.0"
    val media2_version = "1.2.1"
    val media3_version = "1.0.0-rc01"
    val mediarouter_version = "1.3.1"
    val multidex_version = "2.0.1"
    val navigation_version = "2.5.3"
    val paging_version = "3.1.1"
    val palette_version = "1.0.0"
    val preference_version = "1.2.0"
    val print_version = "1.1.0-beta01"
    val profileinstaller_version = "1.2.2"
    val recommendation_version = "1.0.0"
    val recyclerview_version = "1.2.1"
    val recyclerview_selection_version = "1.1.0"
    val remotecallback_version = "1.0.0"
    val resourceinspection_annotation_version = "1.0.1"
    val room_version = "2.5.0"
    val savedstate_version = "1.2.0"
    val security_crypto_version = "1.0.0"
    val sharetarget_version = "1.2.0"
    val slidingpanelayout_version = "1.2.0"
    val startup_version = "1.1.1"
    val sqlite_version = "2.3.0"
    val swiperefreshlayout_version = "1.1.0"
    val test_version = "1.5.0"
    val test_runner_version = "1.5.2"
    val test_orchestrator_version = "1.4.2"
    val test_espresso_version = "3.5.1"
    val test_ext_junit_version = "1.1.5"
    val test_ext_truth_version = "1.5.0"
    val tracing_version = "1.1.0"
    val transition_version = "1.4.1"
    val vectordrawable_version = "1.1.0"
    val versionedparcelable_version = "1.1.1"
    val viewpager_version = "1.0.0"
    val viewpager2_version = "1.0.0"
    val wear_version = "1.2.0"
    val wear_input_version = "1.1.0"
    val wear_ongoingt_version = "1.0.0"
    val wear_phone_interactions_version = "1.0.1"
    val wear_remote_interactions_version = "1.0.0"
    val wear_compose_version = "1.1.2"
    val webkit_version = "1.6.0"
    val window_version = "1.0.0"
    val work_version = "2.8.0"
    val material_version = "1.1.1"


    val activity = Deps("androidx.activity", "activity", activity_version)
    val activity_ktx = Deps("androidx.activity", "activity-ktx", activity_version)

    val ads = Deps("androidx.ads", "ads-identifier", ads_version)

    val annotation = Deps("androidx.annotation", "annotation", annotation_version)

    val appcompat = Deps("androidx.appcompat", "appcompat", appcompat_version)
    val appcompat_resources = Deps("androidx.appcompat", "appcompat-resources", appcompat_version)

    val appsearch = Deps("androidx.appsearch", "appsearch", appsearch_version)
    val appsearch_compiler = Deps("androidx.appsearch", "appsearch-compiler", appsearch_version)
    val appsearch_local_storage = Deps("androidx.appsearch", "appsearch-local-storage", appsearch_version)
    val appsearch_platform_storage = Deps("androidx.appsearch", "appsearch-platform-storage", appsearch_version)

    val arch_core_common = Deps("androidx.arch.core", "core-common", arch_core_version)
    val arch_core_runtime = Deps("androidx.arch.core", "core-runtime", arch_core_version)
    val arch_core_testing = Deps("androidx.arch.core", "core-testing", arch_core_version)

    val asynclayoutinflater = Deps("androidx.asynclayoutinflater", "asynclayoutinflater", asynclayoutinflater_version)

    val autofill = Deps("androidx.autofill", "autofill", autofill_version)

    val benchmark = Deps("androidx.benchmark", "benchmark-macro-junit4", benchmark_version)

    val biometric = Deps("androidx.biometric", "biometric", biometric_version)

    val browser = Deps("androidx.browser", "browser", browser_version)

    val car_app = Deps("androidx.car.app", "app", car_app_version)
    val car_app_projected = Deps("androidx.car.app", "app-projected", car_app_version)
    val car_app_automotive = Deps("androidx.car.app", "app-automotive", car_app_version)
    val car_app_testing = Deps("androidx.car.app", "app-testing", car_app_version)

    val camera_core = Deps("androidx.camera", "camera-core", camera_version)
    val camera_camera2 = Deps("androidx.camera", "camera-camera2", camera_version)
    val camera_lifecycle = Deps("androidx.camera", "camera-lifecycle", camera_version)
    val camera_video = Deps("androidx.camera", "camera-video", camera_version)
    val camera_view = Deps("androidx.camera", "camera-view", camera_version)

    //    val camera_mlkit_vision = Deps("androidx.camera", "camera-mlkit-vision", camera_version)
    val camera_extensions = Deps("androidx.camera", "camera-extensions", camera_version)

    val cardview = Deps("androidx.cardview", "cardview", cardview_version)

    val collection = Deps("androidx.collection", "collection", collection_version)
    val collection_ktx = Deps("androidx.collection", "collection-ktx", collection_version)

    val compose_animation = Deps("androidx.compose.animation", "animation", compose_animation_version)
    val compose_compiler = Deps("androidx.compose.compiler", "compiler", compose_compiler_version)
    val compose_foundation = Deps("androidx.compose.foundation", "foundation", compose_foundation_version)
    val compose_material = Deps("androidx.compose.material", "foundation", compose_material_version)
    val compose_material3 = Deps("androidx.compose.material3", "material3", compose_material3_version)
    val compose_material3_window_size_class = Deps("androidx.compose.material3", "material3-window-size-class", compose_material3_version)
    val compose_runtime = Deps("androidx.compose.runtime", "runtime", compose_runtime_version)
    val compose_runtime_livedata = Deps("androidx.compose.runtime", "runtime-livedata", compose_runtime_version)
    val compose_runtime_rxjava2 = Deps("androidx.compose.runtime", "runtime-rxjava2", compose_runtime_version)
    val compose_ui = Deps("androidx.compose.ui", "ui", compose_ui_version)

    val concurrent = Deps("androidx.concurrent", "concurrent-futures", concurrent_version)
    val concurrent_ktx = Deps("androidx.concurrent", "concurrent-futures-ktx", concurrent_version)

    val constraintlayout = Deps("androidx.constraintlayout", "constraintlayout", constraintlayout_version)
    val constraintlayout_compose = Deps("androidx.constraintlayout", "constraintlayout-compose", constraintlayout_version)

    val contentpager = Deps("androidx.contentpager", "contentpager", contentpager_version)

    val coordinatorlayout = Deps("androidx.coordinatorlayout", "coordinatorlayout", coordinatorlayout_version)

    val core = Deps("androidx.core", "core", core_version)
    val core_ktx = Deps("androidx.core", "core-ktx", core_version)

    val cursoradapter = Deps("androidx.cursoradapter", "cursoradapter", cursoradapter_version)

    val customview = Deps("androidx.customview", "customview", customview_version)

    val datastore_core = Deps("androidx.datastore", "datastore-core", datastore_version)
    val datastore = Deps("androidx.datastore", "datastore", datastore_version)
    val datastore_rxjava2 = Deps("androidx.datastore", "datastore-rxjava2", datastore_version)
    val datastore_rxjava3 = Deps("androidx.datastore", "datastore-rxjava3", datastore_version)
    val datastore_preferences_core = Deps("androidx.datastore", "datastore-preferences-core", datastore_version)
    val datastore_preferences = Deps("androidx.datastore", "datastore-preferences", datastore_version)
    val datastore_preferences_rxjava2 = Deps("androidx.datastore", "datastore-preferences-rxjava2", datastore_version)
    val datastore_preferences_rxjava3 = Deps("androidx.datastore", "datastore-preferences-rxjava3", datastore_version)

    val documentfile = Deps("androidx.documentfile", "documentfile", documentfile_version)

    val draganddrop = Deps("androidx.draganddrop", "draganddrop", draganddrop_version)

    val drawerlayout = Deps("androidx.drawerlayout", "drawerlayout", drawerlayout_version)

    val dynamicanimation = Deps("androidx.dynamicanimation", "dynamicanimation", dynamicanimation_version)
    val dynamicanimation_ktx = Deps("androidx.dynamicanimation", "dynamicanimation-ktx", dynamicanimation_version)

    val emoji = Deps("androidx.emoji", "emoji", emoji_version)
    val emoji_appcompat = Deps("androidx.emoji", "emoji-appcompat", emoji_version)
    val emoji_bundled = Deps("androidx.emoji", "emoji-bundled", emoji_version)

    val emoji2 = Deps("androidx.emoji2", "emoji2", emoji2_version)
    val emoji2_views = Deps("androidx.emoji2", "emoji2-views", emoji2_version)
    val emoji2_views_helper = Deps("androidx.emoji2", "emoji2-views-helper", emoji2_version)

    val exifinterface = Deps("androidx.exifinterface", "exifinterface", exifinterface_version)

    val fragment = Deps("androidx.fragment", "fragment", fragment_version)
    val fragment_ktx = Deps("androidx.fragment", "fragment-ktx", fragment_version)
    val fragment_testing = Deps("androidx.fragment", "fragment-testing", fragment_version)

    val games_activity = Deps("androidx.games", "games-activity", games_version)

    val gridlayout = Deps("androidx.gridlayout", "gridlayout", gridlayout_version)

    val hilt_navigation = Deps("androidx.hilt", "hilt-navigation", hilt_version)
    val hilt_navigation_compose = Deps("androidx.hilt", "hilt-navigation-compose", hilt_version)

    val interpolator = Deps("androidx.interpolator", "interpolator", interpolator_version)

    val leanback = Deps("androidx.leanback", "leanback", leanback_version)
    val leanback_preference = Deps("androidx.leanback", "leanback-preference", leanback_version)
    val leanback_paging = Deps("androidx.leanback", "leanback-paging", leanback_version)
    val leanback_tab = Deps("androidx.leanback", "leanback-tab", leanback_version)

    val lifecycle_viewmodel = Deps("androidx.lifecycle", "lifecycle-viewmodel", lifecycle_version)
    val lifecycle_viewmodel_ktx = Deps("androidx.lifecycle", "lifecycle-viewmodel-ktx", lifecycle_version)
    val lifecycle_livedata = Deps("androidx.lifecycle", "lifecycle-livedata", lifecycle_version)
    val lifecycle_livedata_ktx = Deps("androidx.lifecycle", "lifecycle-livedata-ktx", lifecycle_version)
    val lifecycle_compose = Deps("androidx.lifecycle", "lifecycle-compose", lifecycle_version)
    val lifecycle_runtime = Deps("androidx.lifecycle", "lifecycle-runtime", lifecycle_version)
    val lifecycle_runtime_ktx = Deps("androidx.lifecycle", "lifecycle-runtime-ktx", lifecycle_version)
    val lifecycle_viewmodel_savedstate = Deps("androidx.lifecycle", "lifecycle-viewmodel-savedstate", lifecycle_version)
    val lifecycle_compiler = Deps("androidx.lifecycle", "lifecycle-compiler", lifecycle_version)
    val lifecycle_common_java8 = Deps("androidx.lifecycle", "lifecycle-common-java8", lifecycle_version)
    val lifecycle_service = Deps("androidx.lifecycle", "lifecycle-service", lifecycle_version)
    val lifecycle_process = Deps("androidx.lifecycle", "lifecycle-process", lifecycle_version)
    val lifecycle_reactivestreams = Deps("androidx.lifecycle", "lifecycle-reactivestreams", lifecycle_version)
    val lifecycle_reactivestreams_ktx = Deps("androidx.lifecycle", "lifecycle-reactivestreams-ktx", lifecycle_version)
    val lifecycle_runtime_testing = Deps("androidx.lifecycle", "lifecycle-runtime-testing", lifecycle_version)
//    val lifecycle_common = Deps("androidx.lifecycle", "lifecycle-common", lifecycle_version)
//    val lifecycle_extensions = Deps("androidx.lifecycle", "lifecycle-extensions", lifecycle_version)
//    val lifecycle_livedata_core = Deps("androidx.lifecycle", "lifecycle-livedata-core", lifecycle_version)
//    val lifecycle_livedata_core_ktx = Deps("androidx.lifecycle", "lifecycle-livedata-core-ktx", lifecycle_version)

    val loader = Deps("androidx.loader", "loader", loader_version)

    val localbroadcastmanager = Deps("androidx.localbroadcastmanager", "localbroadcastmanager", localbroadcastmanager_version)

    val media = Deps("androidx.media", "media", media_version)

    val media2_session = Deps("androidx.media2", "media2-session", media2_version)
    val media2_widget = Deps("androidx.media2", "media2-widget", media2_version)
    val media2_player = Deps("androidx.media2", "media2-player", media2_version)
//    val media2_exoplayer = Deps("androidx.media2", "media2-exoplayer", media2_version)

    val media3_common = Deps("androidx.media3", "media3-common", media3_version)
    val media3_database = Deps("androidx.media3", "media3-database", media3_version)
    val media3_decoder = Deps("androidx.media3", "media3-decoder", media3_version)
    val media3_transformer = Deps("androidx.media3", "media3-transformer", media3_version)
    val media3_cast = Deps("androidx.media3", "media3-cast", media3_version)
    val media3_extractor = Deps("androidx.media3", "media3-extractor", media3_version)
    val media3_session = Deps("androidx.media3", "media3-session", media3_version)
    val media3_datasource = Deps("androidx.media3", "media3-datasource", media3_version)
    val media3_datasource_cronet = Deps("androidx.media3", "media3-datasource-cronet", media3_version)
    val media3_datasource_okhttp = Deps("androidx.media3", "media3-datasource-okhttp", media3_version)
    val media3_datasource_rtmp = Deps("androidx.media3", "media3-datasource-rtmp", media3_version)
    val media3_ui = Deps("androidx.media3", "media3-ui", media3_version)
    val media3_ui_leanback = Deps("androidx.media3", "media3-ui-leanback", media3_version)
    val media3_exoplayer = Deps("androidx.media3", "media3-exoplayer", media3_version)
    val media3_exoplayer_dash = Deps("androidx.media3", "media3-exoplayer-dash", media3_version)
    val media3_exoplayer_hls = Deps("androidx.media3", "media3-exoplayer-hls", media3_version)
    val media3_exoplayer_rtsp = Deps("androidx.media3", "media3-exoplayer-rtsp", media3_version)
    val media3_exoplayer_ima = Deps("androidx.media3", "media3-exoplayer-ima", media3_version)
    val media3_exoplayer_workmanager = Deps("androidx.media3", "media3-exoplayer-workmanager", media3_version)
    val media3_test_utils = Deps("androidx.media3", "media3-test-utils", media3_version)
    val media3_test_utils_robolectric = Deps("androidx.media3", "media3-test-utils-robolectric", media3_version)

    val mediarouter = Deps("androidx.mediarouter", "mediarouter", mediarouter_version)

    val multidex = Deps("androidx.multidex", "multidex", multidex_version)
    val multidex_instrumentation = Deps("androidx.multidex", "multidex-instrumentation", multidex_version)

    val material = Deps("androidx.compose.materia", "material", material_version)

    val navigation_compose = Deps("androidx.navigation", "navigation-compose", navigation_version)
    val navigation_fragment = Deps("androidx.navigation", "navigation-fragment", navigation_version)
    val navigation_fragment_ktx = Deps("androidx.navigation", "navigation-fragment-ktx", navigation_version)
    val navigation_ui = Deps("androidx.navigation", "navigation-ui", navigation_version)
    val navigation_ui_ktx = Deps("androidx.navigation", "navigation-ui-ktx", navigation_version)
    val navigation_testing = Deps("androidx.navigation", "navigation-testing", navigation_version)

    val paging_common = Deps("androidx.paging", "paging-common", paging_version)
    val paging_runtime = Deps("androidx.paging", "paging-runtime", paging_version)
    val paging_rxjava2 = Deps("androidx.paging", "paging-rxjava2", paging_version)
    val paging_rxjava3 = Deps("androidx.paging", "paging-rxjava3", paging_version)
    val paging_guava = Deps("androidx.paging", "paging-guava", paging_version)
    val paging_compose = Deps("androidx.paging", "paging-compose", paging_version)

    val palette = Deps("androidx.palette", "palette", palette_version)
    val palette_ktx = Deps("androidx.palette", "palette-ktx", palette_version)

    val preference = Deps("androidx.preference", "preference", preference_version)
    val preference_ktx = Deps("androidx.preference", "preference-ktx", preference_version)

    val print = Deps("androidx.print", "print", print_version)

    val profileinstaller = Deps("androidx.profileinstaller", "profileinstaller", profileinstaller_version)

    val recommendation = Deps("androidx.recommendation", "recommendation", recommendation_version)

    val recyclerview = Deps("androidx.recyclerview", "recyclerview", recyclerview_version)
    val recyclerview_selection = Deps("androidx.recyclerview", "recyclerview-selection", recyclerview_selection_version)

    val remotecallback = Deps("androidx.remotecallback", "remotecallback", remotecallback_version)

    val resourceinspection_annotation = Deps("androidx.resourceinspection", "resourceinspection-annotation", resourceinspection_annotation_version)

    val room_common = Deps("androidx.room", "room-common", room_version)
    val room_runtime = Deps("androidx.room", "room-runtime", room_version)
    val room_compiler = Deps("androidx.room", "room-compiler", room_version)
    val room_ktx = Deps("androidx.room", "room-ktx", room_version)
    val room_rxjava2 = Deps("androidx.room", "room-rxjava2", room_version)
    val room_rxjava3 = Deps("androidx.room", "room-rxjava3", room_version)
    val room_guava = Deps("androidx.room", "room-guava", room_version)
    val room_paging = Deps("androidx.room", "room-paging", room_version)
    val room_testing = Deps("androidx.room", "room-testing", room_version)

    val savedstate = Deps("androidx.savedstate", "savedstate", savedstate_version)
    val savedstate_ktx = Deps("androidx.savedstate", "savedstate-ktx", savedstate_version)

    val security_crypto = Deps("androidx.security", "security-crypto", security_crypto_version)

    val sharetarget = Deps("androidx.sharetarget", "sharetarget", sharetarget_version)

    val slidingpanelayout = Deps("androidx.slidingpanelayout", "slidingpanelayout", slidingpanelayout_version)

    val sqlite = Deps("androidx.sqlite", "sqlite", sqlite_version)
    val sqlite_ktx = Deps("androidx.sqlite", "sqlite-ktx", sqlite_version)
    val sqlite_framework = Deps("androidx.sqlite", "sqlite-framework", sqlite_version)

    val startup = Deps("androidx.startup", "startup-runtime", startup_version)

    val swiperefreshlayout = Deps("androidx.swiperefreshlayout", "swiperefreshlayout", swiperefreshlayout_version)

    val test_core = Deps("androidx.test", "core", test_version)
    val test_core_ktx = Deps("androidx.test", "core-ktx", test_version)
    val test_runner = Deps("androidx.test", "runner", test_runner_version)
    val test_orchestrator = Deps("androidx.test", "orchestrator", test_orchestrator_version)
    val test_espresso_core = Deps("androidx.test.espresso", "espresso-core", test_espresso_version)
    val test_ext_junit = Deps("androidx.test.ext", "junit", test_ext_junit_version)
    val test_ext_junit_ktx = Deps("androidx.test.ext", "junit-ktx", test_ext_junit_version)
    val test_ext_truth = Deps("androidx.test.ext", "truth", test_ext_truth_version)

    val tracing = Deps("androidx.tracing", "tracing", tracing_version)
    val tracing_ktx = Deps("androidx.tracing", "tracing-ktx", tracing_version)

    val transition = Deps("androidx.transition", "transition", transition_version)
    val transition_ktx = Deps("androidx.transition", "transition-ktx", transition_version)

    val legacy_support_v4 = Deps("androidx.legacy", "legacy-support-v4", legacy_version)
    val legacy_support_v13 = Deps("androidx.legacy", "legacy-support-v13", legacy_version)
    val legacy_preference_v14 = Deps("androidx.legacy", "legacy-preference-v14", legacy_version)
    val legacy_support_core_ui = Deps("androidx.legacy", "legacy-support-core-ui", legacy_version)
    val legacy_support_core_utils = Deps("androidx.legacy", "legacy-support-core-utils", legacy_version)

    val vectordrawable = Deps("androidx.vectordrawable", "vectordrawable", vectordrawable_version)
    val vectordrawable_animated = Deps("androidx.vectordrawable", "vectordrawable-animated", vectordrawable_version)

    val versionedparcelable = Deps("androidx.versionedparcelable", "versionedparcelable", versionedparcelable_version)

    val viewpager = Deps("androidx.viewpager", "viewpager", viewpager_version)

    val viewpager2 = Deps("androidx.viewpager2", "viewpager2", viewpager2_version)

    val wear = Deps("androidx.wear", "wear", wear_version)
    val wear_input = Deps("androidx.wear", "wear-input", wear_input_version)
    val wear_input_testing = Deps("androidx.wear", "wear-input-testing", wear_input_version)
    val wear_ongoing = Deps("androidx.wear", "wear-ongoing", wear_ongoingt_version)
    val wear_phone_interactions = Deps("androidx.wear", "wear-phone-interactions", wear_phone_interactions_version)
    val wear_remote_interactions = Deps("androidx.wear", "wear-remote-interactions", wear_remote_interactions_version)

    val wear_compose = Deps("androidx.wear.compose", "compose-foundation", wear_compose_version)
    val wear_material = Deps("androidx.wear.compose", "compose-material", wear_compose_version)
    val wear_navigation = Deps("androidx.wear.compose", "compose-navigation", wear_compose_version)

    val webkit = Deps("androidx.webkit", "webkit", webkit_version)

    val window = Deps("androidx.window", "window", window_version)
    val window_java = Deps("androidx.window", "window-java", window_version)
    val window_rxjava2 = Deps("androidx.window", "window-rxjava2", window_version)
    val window_rxjava3 = Deps("androidx.window", "window-rxjava3", window_version)
    val window_testing = Deps("androidx.window", "window-testing", window_version)

    val work = Deps("androidx.work", "work-runtime", work_version)
    val work_ktx = Deps("androidx.work", "work-runtime-ktx", work_version)
    val work_rxjava2 = Deps("androidx.work", "work-rxjava2", work_version)
    val work_rxjava3 = Deps("androidx.work", "work-rxjava3", work_version)
    val work_gcm = Deps("androidx.work", "work-gcm", work_version)
    val work_testing = Deps("androidx.work", "work-testing", work_version)
    val work_multiprocess = Deps("androidx.work", "work-multiprocess", work_version)

}