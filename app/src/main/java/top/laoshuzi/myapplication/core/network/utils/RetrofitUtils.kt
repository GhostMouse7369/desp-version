package top.laoshuzi.myapplication.core.network.utils

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import top.laoshuzi.myapplication.core.network.config.RetrofitConfig
import top.laoshuzi.myapplication.core.network.ApiGsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by mouse on 2018/2/1.
 */

object RetrofitUtils {

    fun retrofit(): Retrofit {

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(RetrofitConfig.HTTP_LOGGING_INTERCEPTOR.setLevel(Okhttp3Utils.HttpLoggingInterceptor.Level.BODY))
            .addInterceptor(RetrofitConfig.TOKEN_INTERCEPTOR)
            .connectTimeout(RetrofitConfig.CONNECT_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(RetrofitConfig.READ_TIMEOUT, TimeUnit.SECONDS)
            .build()

        val gsonConverter = ApiGsonConverterFactory.create(GsonBuilder().create())

        val rx2CallAdapter = RxJava2CallAdapterFactory.create()

        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(RetrofitConfig.REST_BASE_URL)
            .addConverterFactory(gsonConverter)
            .addCallAdapterFactory(rx2CallAdapter)
            .build()
    }

}


