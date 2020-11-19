package top.laoshuzi.myapplication.core.network.utils

import okhttp3.Interceptor
import okhttp3.Response

object TokenUtils {

    val AUTHORIZATION = "Authorization"

    val DEFAULT: TokenGetter = object : TokenGetter {

        override fun getTokenType(): String {
            return "bearer"
        }

        override fun getToken(): String {
            // base64 (bearer)
            return "YmVhcmVy"
        }
    }


    class TokenInterceptor : Interceptor {

        private lateinit var tokenGetter: TokenGetter

        constructor() {
            (DEFAULT)
        }

        constructor(tokenGetter: TokenGetter) {
            this.tokenGetter = tokenGetter
        }

        override fun intercept(chain: Interceptor.Chain): Response {
            val originalRequest = chain.request()

            val req = tokenGetter.getToken().run {
                if (isBlank()) {
                    originalRequest.newBuilder()
                        .addHeader(AUTHORIZATION, "${tokenGetter.getTokenType()} ${tokenGetter.getToken()}")
                        .build()
                } else {
                    originalRequest
                }
            }

            return chain.proceed(req)
        }

    }

    interface TokenGetter {

        fun getTokenType(): String

        fun getToken(): String

    }

}