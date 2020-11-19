package top.laoshuzi.myapplication.core.network

import com.google.gson.Gson
import com.google.gson.JsonParseException
import com.google.gson.reflect.TypeToken
import okhttp3.ResponseBody
import retrofit2.Converter
import top.laoshuzi.myapplication.core.network.bean.ResponseResult
import top.laoshuzi.myapplication.core.network.exception.BizException
import java.lang.reflect.Type

class ApiGsonResponseBodyConverter<T>(private val gson: Gson, private val type: Type) : Converter<ResponseBody, T> {

    override fun convert(value: ResponseBody): T {

        value.use {
            val responseStr = it.string()
            val jsonType = TypeToken.getParameterized(ResponseResult::class.java, type).type

            val responseResult = gson.fromJson<ResponseResult<T>>(responseStr, jsonType)
                ?: throw JsonParseException("ResponseResult is null!")

            if (!responseResult.isSuccess) {
                throw BizException(
                    responseResult.error
                        ?: throw JsonParseException("ResponseError is null!")
                )
            }

            return responseResult.result!!
        }
    }


}
