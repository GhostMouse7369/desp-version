package top.laoshuzi.dependencies.deps

object AndroidX {

    val activity_version = "1.4.0"
    val fragment_version = "1.4.1"
    val arch_core_version = "1.1.0"
    val lifecycle_version = "2.2.0"
    val paging_version = "3.1.1"
    val room_version = "2.4.3"
    val sqlite_version = "2.1.0"
    val navigation_version = "2.3.1"
    val appcompat_version = "1.2.0"
    val asynclayoutinflater_version = "1.0.0"
    val car_version = "1.0.0-alpha7"
    val cardview_version = "1.0.0"
    val collection_version = "1.1.0"
    val coordinatorlayout_version = "1.1.0"
    val cursoradapter_version = "1.0.0"
    val browser_version = "1.2.0"
    val customview_version = "1.1.0"
    val material_version = "1.1.1"
    val documentfile_version = "1.0.1"
    val drawerlayout_version = "1.1.1"
    val exifinterface_version = "1.3.1"
    val gridlayout_version = "1.0.0"
    val heifwriter_version = "1.0.0"
    val interpolator_version = "1.0.0"
    val leanback_version = "1.0.0"
    val loader_version = "1.1.0"
    val localbroadcastmanager_version = "1.0.0"
    val media_version = "1.2.0"
    val media2_version = "1.0.3"
    val mediarouter_version = "1.2.0"
    val multidex_version = "2.0.0"
    val palette_version = "1.0.0"
    val percentlayout_version = "1.0.0"
    val legacy_version = "1.0.0"
    val preference_version = "1.1.1"
    val print_version = "1.0.0"
    val recyclerview_version = "1.2.1"
    val annotation_version = "1.1.0"
    val core_version = "1.3.2"
    val emoji_version = "1.1.0"
    val swiperefreshlayout_version = "1.1.0"
    val transition_version = "1.3.1"
    val viewpager_version = "1.0.0"
    val viewpager2_version = "1.0.0"
    val wear_version = "1.1.0"
    val webkit_version = "1.3.0"
    val vectordrawable_version = "1.1.0"
    val constraint_layout_version = "2.0.4"
    val test_version = "1.3.0"
    val test_ext_version = "1.1.2"
    val test_espresso_version = "3.3.0"

    val android_material_version = "1.2.1"

    val activity = Deps("androidx.activity", "activity", activity_version)
    val activity_compose = Deps("androidx.activity", "activity-compose", activity_version)
    val activity_ktx = Deps("androidx.activity", "activity-ktx", activity_version)

    val fragment = Deps("androidx.fragment", "fragment", fragment_version)
    val fragment_ktx = Deps("androidx.fragment", "fragment-ktx", fragment_version)
    val fragment_testing = Deps("androidx.fragment", "fragment-testing", fragment_version)

    val arch_core_common = Deps("androidx.arch.core", "core-common", arch_core_version)
    val arch_core = Deps("androidx.arch.core", "core", arch_core_version)
    val arch_core_testing = Deps("androidx.arch.core", "core-testing", arch_core_version)
    val arch_core_runtime = Deps("androidx.arch.core", "core-runtime", arch_core_version)

    val lifecycle_common = Deps("androidx.lifecycle", "lifecycle-common", lifecycle_version)
    val lifecycle_common_java8 = Deps("androidx.lifecycle", "lifecycle-common-java8", lifecycle_version)
    val lifecycle_compiler = Deps("androidx.lifecycle", "lifecycle-compiler", lifecycle_version)
    val lifecycle_extensions = Deps("androidx.lifecycle", "lifecycle-extensions", lifecycle_version)
    val lifecycle_livedata = Deps("androidx.lifecycle", "lifecycle-livedata", lifecycle_version)
    val lifecycle_livedata_ktx = Deps("androidx.lifecycle", "lifecycle-livedata-ktx", lifecycle_version)
    val lifecycle_livedata_core = Deps("androidx.lifecycle", "lifecycle-livedata-core", lifecycle_version)
    val lifecycle_livedata_core_ktx = Deps("androidx.lifecycle", "lifecycle-livedata-core-ktx", lifecycle_version)
    val lifecycle_process = Deps("androidx.lifecycle", "lifecycle-process", lifecycle_version)
    val lifecycle_reactivestreams = Deps("androidx.lifecycle", "lifecycle-reactivestreams", lifecycle_version)
    val lifecycle_reactivestreams_ktx = Deps("androidx.lifecycle", "lifecycle-reactivestreams-ktx", lifecycle_version)
    val lifecycle_runtime = Deps("androidx.lifecycle", "lifecycle-runtime", lifecycle_version)
    val lifecycle_runtime_ktx = Deps("androidx.lifecycle", "lifecycle-runtime-ktx", lifecycle_version)
    val lifecycle_runtime_testing = Deps("androidx.lifecycle", "lifecycle-runtime-testing", lifecycle_version)
    val lifecycle_service = Deps("androidx.lifecycle", "lifecycle-service", lifecycle_version)
    val lifecycle_viewmodel = Deps("androidx.lifecycle", "lifecycle-viewmodel", lifecycle_version)
    val lifecycle_viewmodel_ktx = Deps("androidx.lifecycle", "lifecycle-viewmodel-ktx", lifecycle_version)
    val lifecycle_viewmodel_savedstate = Deps("androidx.lifecycle", "lifecycle-viewmodel-savedstate", lifecycle_version)

    val paging_common = Deps("androidx.paging", "paging-common", paging_version)
    val paging_common_ktx = Deps("androidx.paging", "paging-common-ktx", paging_version)
    val paging_runtime = Deps("androidx.paging", "paging-runtime", paging_version)
    val paging_runtime_ktx = Deps("androidx.paging", "paging-runtime-ktx", paging_version)
    val paging_rxjava2 = Deps("androidx.paging", "paging-rxjava2", paging_version)
    val paging_rxjava2_ktx = Deps("androidx.paging", "paging-rxjava2-ktx", paging_version)

    val room_common = Deps("androidx.room", "room-common", room_version)
    val room_compiler = Deps("androidx.room", "room-compiler", room_version)
    val room_guava = Deps("androidx.room", "room-guava", room_version)
    val room_migration = Deps("androidx.room", "room-migration", room_version)
    val room_runtime = Deps("androidx.room", "room-runtime", room_version)
    val room_rxjava2 = Deps("androidx.room", "room-rxjava2", room_version)
    val room_ktx = Deps("androidx.room", "room-ktx", room_version)
    val room_testing = Deps("androidx.room", "room-testing", room_version)

    val sqlite = Deps("androidx.sqlite", "sqlite", sqlite_version)
    val sqlite_ktx = Deps("androidx.sqlite", "sqlite-ktx", sqlite_version)
    val sqlite_framework = Deps("androidx.sqlite", "sqlite-framework", sqlite_version)

    val navigation_common = Deps("androidx.navigation", "navigation-common", navigation_version)
    val navigation_common_ktx = Deps("androidx.navigation", "navigation-common-ktx", navigation_version)
    val navigation_fragment = Deps("androidx.navigation", "navigation-fragment", navigation_version)
    val navigation_fragment_ktx = Deps("androidx.navigation", "navigation-fragment-ktx", navigation_version)
    val navigation_runtime = Deps("androidx.navigation", "navigation-runtime", navigation_version)
    val navigation_runtime_ktx = Deps("androidx.navigation", "navigation-runtime-ktx", navigation_version)
    val navigation_ui = Deps("androidx.navigation", "navigation-ui", navigation_version)
    val navigation_ui_ktx = Deps("androidx.navigation", "navigation-ui-ktx", navigation_version)
    val navigation_testing = Deps("androidx.navigation", "navigation-testing", navigation_version)

    val appcompat = Deps("androidx.appcompat", "appcompat", appcompat_version)
    val appcompat_resources = Deps("androidx.appcompat", "appcompat-resources", appcompat_version)

    val asynclayoutinflater = Deps("androidx.asynclayoutinflater", "asynclayoutinflater", asynclayoutinflater_version)

    val car = Deps("androidx.car", "car", car_version)

    val cardview = Deps("androidx.cardview", "cardview", cardview_version)

    val collection = Deps("androidx.collection", "collection", collection_version)
    val collection_ktx = Deps("androidx.collection", "collection-ktx", collection_version)

    val coordinatorlayout = Deps("androidx.coordinatorlayout", "coordinatorlayout", coordinatorlayout_version)

    val cursoradapter = Deps("androidx.cursoradapter", "cursoradapter", cursoradapter_version)

    val browser = Deps("androidx.browser", "browser", browser_version)

    val customview = Deps("androidx.customview", "customview", customview_version)

    val material = Deps("androidx.compose.materia", "material", material_version)

    val documentfile = Deps("androidx.documentfile", "documentfile", documentfile_version)

    val drawerlayout = Deps("androidx.drawerlayout", "drawerlayout", drawerlayout_version)

    val exifinterface = Deps("androidx.exifinterface", "exifinterface", exifinterface_version)

    val gridlayout = Deps("androidx.gridlayout", "gridlayout", gridlayout_version)

    val heifwriter = Deps("androidx.heifwriter", "heifwriter", heifwriter_version)

    val interpolator = Deps("androidx.interpolator", "interpolator", interpolator_version)

    val leanback = Deps("androidx.leanback", "leanback", leanback_version)
    val leanback_preference = Deps("androidx.leanback", "leanback-preference", leanback_version)

    val loader = Deps("androidx.loader", "loader", loader_version)

    val localbroadcastmanager = Deps("androidx.localbroadcastmanager", "localbroadcastmanager", localbroadcastmanager_version)

    val media = Deps("androidx.media", "media", media_version)

    val media2_common = Deps("androidx.media2", "media2-common", media2_version)
    val media2_exoplayer = Deps("androidx.media2", "media2-exoplayer", media2_version)
    val media2_player = Deps("androidx.media2", "media2-player", media2_version)
    val media2_session = Deps("androidx.media2", "media2-session", media2_version)
    val media2_widget = Deps("androidx.media2", "media2-widget", media2_version)

    val mediarouter = Deps("androidx.mediarouter", "mediarouter", mediarouter_version)

    val multidex = Deps("androidx.multidex", "multidex", multidex_version)
    val multidex_instrumentation = Deps("androidx.multidex", "multidex-instrumentation", multidex_version)

    val palette = Deps("androidx.palette", "palette", palette_version)
    val palette_ktx = Deps("androidx.palette", "palette-ktx", palette_version)

    val percentlayout = Deps("androidx.percentlayout", "percentlayout", percentlayout_version)

    val legacy_support_v4 = Deps("androidx.legacy", "legacy-support-v4", legacy_version)
    val legacy_support_v13 = Deps("androidx.legacy", "legacy-support-v13", legacy_version)
    val legacy_preference_v14 = Deps("androidx.legacy", "legacy-preference-v14", legacy_version)
    val legacy_support_core_ui = Deps("androidx.legacy", "legacy-support-core-ui", legacy_version)
    val legacy_support_core_utils = Deps("androidx.legacy", "legacy-support-core-utils", legacy_version)

    val preference = Deps("androidx.preference", "preference", preference_version)
    val preference_ktx = Deps("androidx.preference", "preference-ktx", preference_version)

    val print = Deps("androidx.print", "print", print_version)

    val recyclerview = Deps("androidx.recyclerview", "recyclerview", recyclerview_version)
    val recyclerview_selection = Deps("androidx.recyclerview", "recyclerview-selection", recyclerview_version)

    val annotation = Deps("androidx.annotation", "annotation", annotation_version)

    val core = Deps("androidx.core", "core", core_version)
    val core_ktx = Deps("androidx.core", "core-ktx", core_version)

    val emoji = Deps("androidx.emoji", "emoji", emoji_version)
    val emoji_appcompat = Deps("androidx.emoji", "emoji-appcompat", emoji_version)
    val emoji_bundled = Deps("androidx.emoji", "emoji-bundled", emoji_version)

    val swiperefreshlayout = Deps("androidx.swiperefreshlayout", "swiperefreshlayout", swiperefreshlayout_version)

    val transition = Deps("androidx.transition", "transition", transition_version)

    val viewpager = Deps("androidx.viewpager", "viewpager", viewpager_version)

    val viewpager2 = Deps("androidx.viewpager2", "viewpager2", viewpager2_version)

    val wear = Deps("androidx.wear", "wear", wear_version)

    val webkit = Deps("androidx.webkit", "webkit", webkit_version)

    val vectordrawable = Deps("androidx.vectordrawable", "vectordrawable", vectordrawable_version)
    val vectordrawable_animated = Deps("androidx.vectordrawable", "vectordrawable-animated", vectordrawable_version)

    val constraint_layout = Deps("androidx.constraintlayout", "constraintlayout", constraint_layout_version)
    val constraint_layout_solvert = Deps("androidx.constraintlayout", "constraintlayout-solvert", constraint_layout_version)

    val test_core = Deps("androidx.test", "core", test_version)
    val test_core_ktx = Deps("androidx.test", "core-ktx", test_version)
    val test_monitor = Deps("androidx.test", "monitor", test_version)
    val test_orchestrator = Deps("androidx.test", "orchestrator", test_version)
    val test_rules = Deps("androidx.test", "rules", test_version)
    val test_runner = Deps("androidx.test", "runner", test_version)

    val test_espresso_core = Deps("androidx.test.espresso", "espresso-core", test_espresso_version)

    val android_material = Deps("com.google.android.material", "material", android_material_version)
}