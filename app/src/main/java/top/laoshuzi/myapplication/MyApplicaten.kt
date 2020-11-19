package top.laoshuzi.myapplication

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.blankj.utilcode.util.AppUtils
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import top.laoshuzi.myapplication.core.localModule
import top.laoshuzi.myapplication.core.remoteModule
import top.laoshuzi.myapplication.core.resposityModule
import top.laoshuzi.myapplication.core.viewModelModule
import io.reactivex.plugins.RxJavaPlugins
import com.blankj.utilcode.util.Utils


class MyApplicaten : Application() {

    override fun onCreate() {
        super.onCreate()

        // UtilCode
        Utils.init(applicationContext)

        // ARouter
        if (AppUtils.isAppDebug()) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)

        // Koin
        startKoin {
            androidContext(this@MyApplicaten)
            modules(
                listOf(
                    viewModelModule,
                    resposityModule,
                    remoteModule,
                    localModule
                )
            )
        }

        // RxJava
        RxJavaPlugins.setErrorHandler { e ->
            e.printStackTrace()
        }

    }
}