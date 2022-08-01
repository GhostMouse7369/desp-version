package top.laoshuzi.myapplication.core

import org.koin.dsl.module
import top.laoshuzi.myapplication.core.database.AppDatabase
import top.laoshuzi.myapplication.core.network.utils.RetrofitUtils

val viewModelModule = module {
//    viewModel { SigninViewModel(get()) }
}

val resposityModule = module {
//    factory { SigninResposity(get()) }
}

val remoteModule = module {
    single { RetrofitUtils.retrofit() }
//    single<PaoService> { get<Retrofit>().create(PaoService::class.java) }
}

val localModule = module {

    single { AppDatabase.database("app_db") }

//    single { get<AppDatabase>().userAccountDao() }
}

