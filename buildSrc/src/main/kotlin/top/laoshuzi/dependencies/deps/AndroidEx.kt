package top.laoshuzi.dependencies.deps

object AndroidEx {

    val android_auto_size_version = "v1.2.1"
    val arouter_api_version = "1.5.2"
    val arouter_compiler_version = "1.5.2"
    val arouter_register_version = "1.0.2"
    val background_libraryx_version = "1.7.3"
    val consecutive_scroller_version = "4.6.3"
    val fragmentationx_version = "1.0.3"
    val fragmentationx_xuexuan_version = "1.0.6"
    val glide_version = "4.9.0"
    val live_event_busx_version = "1.8.0"
    val recycler_view_base_adapter_version = "3.0.7"
    val retrofit_version = "2.9.0"
    val smart_refresh_layout_version = "2.9.0"
    val utilcodex_version = "1.31.0"
    val xpopup_version = "2.8.3"


    val android_auto_size = Deps("com.github.JessYanCoding", "AndroidAutoSize", android_auto_size_version)

    val arouter_api = Deps("com.alibaba", "arouter-api", arouter_api_version)
    val arouter_compiler = Deps("com.alibaba", "arouter-compiler", arouter_compiler_version)
    val arouter_register = Deps("com.alibaba", "arouter-register", arouter_register_version)

    val background_libraryx = Deps("com.github.JavaNoober.BackgroundLibrary", "libraryx", background_libraryx_version)

    val consecutive_scroller = Deps("com.github.donkingliang", "ConsecutiveScroller", consecutive_scroller_version)

    val recycler_view_base_adapter = Deps("com.github.CymChad", "BaseRecyclerViewAdapterHelper", recycler_view_base_adapter_version)

    val smart_refresh_layout = Deps("com.scwang.smartrefresh", "SmartRefreshLayout", smart_refresh_layout_version)
    val smart_refresh_layout_header = Deps("com.scwang.smartrefresh", "SmartRefreshHeader", smart_refresh_layout_version)

    val fragmentationx = Deps("top.laoshuzi.android", "fragmentation", fragmentationx_version)
    val fragmentationx_core = Deps("top.laoshuzi.android", "fragmentation-core", fragmentationx_version)
    val fragmentationx_swipeback = Deps("top.laoshuzi.android", "fragmentation-swipeback", fragmentationx_version)
    val fragmentationx_xuexuan = Deps("me.xuexuan", "fragmentationx", fragmentationx_xuexuan_version)
    val fragmentationx_xuexuan_core = Deps("me.xuexuan", "fragmentationx-core", fragmentationx_xuexuan_version)
    val fragmentationx_xuexuan_swipeback = Deps("me.xuexuan", "fragmentationx-swipeback", fragmentationx_xuexuan_version)

    val glide = Deps("com.github.bumptech.glide", "glide", glide_version)
    val glide_compiler = Deps("com.github.bumptech.glide", "compiler", glide_version)

    val live_event_busx = Deps("io.github.jeremyliao", "live-event-bus-x", live_event_busx_version)

    val retrofit = Deps("com.squareup.retrofit2", "retrofit", retrofit_version)
    val retrofit_adapter_rxjava = Deps("com.squareup.retrofit2", "adapter-rxjava", retrofit_version)
    val retrofit_adapter_rxjava2 = Deps("com.squareup.retrofit2", "adapter-rxjava2", retrofit_version)
    val retrofit_adapter_rxjava3 = Deps("com.squareup.retrofit2", "adapter-rxjava3", retrofit_version)
    val retrofit_adapter_java8 = Deps("com.squareup.retrofit2", "adapter-java8", retrofit_version)
    val retrofit_adapter_guava = Deps("com.squareup.retrofit2", "adapter-guava", retrofit_version)
    val retrofit_adapter_scala = Deps("com.squareup.retrofit2", "adapter-scala", retrofit_version)
    val retrofit_converter_gson = Deps("com.squareup.retrofit2", "converter-gson", retrofit_version)
    val retrofit_converter_jackson = Deps("com.squareup.retrofit2", "converter-jackson", retrofit_version)
    val retrofit_converter_protobuf = Deps("com.squareup.retrofit2", "converter-protobuf", retrofit_version)
    val retrofit_converter_guava = Deps("com.squareup.retrofit2", "converter-guava", retrofit_version)
    val retrofit_converter_moshi = Deps("com.squareup.retrofit2", "converter-moshi", retrofit_version)
    val retrofit_converter_jaxb = Deps("com.squareup.retrofit2", "converter-jaxb", retrofit_version)
    val retrofit_converter_wire = Deps("com.squareup.retrofit2", "converter-wire", retrofit_version)
    val retrofit_converter_scalars = Deps("com.squareup.retrofit2", "converter-scalars", retrofit_version)
    val retrofit_converter_simplexml = Deps("com.squareup.retrofit2", "converter-simplexml", retrofit_version)
    val retrofit_mock = Deps("com.squareup.retrofit2", "retrofit-mock", retrofit_version)

    val utilcodex = Deps("com.blankj", "utilcodex", utilcodex_version)
    val xpopup = Deps("com.github.li-xiaojun", "XPopup", xpopup_version)

}