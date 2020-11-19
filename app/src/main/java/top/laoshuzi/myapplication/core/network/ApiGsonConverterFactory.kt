package top.laoshuzi.myapplication.core.network

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import java.lang.reflect.Type

class ApiGsonConverterFactory constructor(private val gson: Gson) : Converter.Factory() {

    companion object {
        fun create(gson: Gson? = Gson()): ApiGsonConverterFactory {
            return ApiGsonConverterFactory(
                gson ?: throw NullPointerException("gson == null")
            )
        }
    }

    override fun responseBodyConverter(
        type: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit
    ): Converter<ResponseBody, *> {
        return ApiGsonResponseBodyConverter<Any>(gson, type)
    }

    override fun requestBodyConverter(
        type: Type,
        parameterAnnotations: Array<Annotation>,
        methodAnnotations: Array<Annotation>,
        retrofit: Retrofit
    ): Converter<*, RequestBody> {
        val adapter = gson.getAdapter(TypeToken.get(type))
        return ApiGsonRequestBodyConverter(gson, adapter)
    }

}
