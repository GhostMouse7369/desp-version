package top.laoshuzi.myapplication.core.network.config

import com.blankj.utilcode.util.LogUtils
import top.laoshuzi.myapplication.core.network.utils.Okhttp3Utils
import top.laoshuzi.myapplication.core.network.utils.TokenUtils

object RetrofitConfig {

    const val REST_BASE_URL = "http://39.98.74.211:10008/"

    const val CONNECT_TIMEOUT: Long = 30 //连接超时

    const val READ_TIMEOUT: Long = 30 //读取超时

    val HTTP_LOGGING_INTERCEPTOR = Okhttp3Utils.HttpLoggingInterceptor(
        Okhttp3Utils.HttpLoggingInterceptor.Logger { message ->
            LogUtils.d(message)
        })

    val TOKEN_INTERCEPTOR = TokenUtils.TokenInterceptor(
        object : TokenUtils.TokenGetter {
            override fun getTokenType(): String {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun getToken(): String {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    )

}