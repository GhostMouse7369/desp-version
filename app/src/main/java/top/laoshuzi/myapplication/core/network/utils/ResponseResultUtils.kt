package top.laoshuzi.myapplication.core.network.utils

import top.laoshuzi.myapplication.core.network.bean.ResponseError
import top.laoshuzi.myapplication.core.network.bean.ResponseResult
import top.laoshuzi.myapplication.core.network.exception.BizException

object ResponseResultUtils {

    fun <T> successed(t: T): ResponseResult<T> {
        val result = ResponseResult<T>()
        result.isSuccess = true
        result.result = t
        return result
    }

    fun failed(error: ResponseError): ResponseResult<*> {
        val result = ResponseResult<Any>()
        result.isSuccess = false
        result.error = error
        return result
    }

    fun failed(exception: BizException): ResponseResult<*> {
        return failed(ResponseError(exception.code, exception.message))
    }

}


