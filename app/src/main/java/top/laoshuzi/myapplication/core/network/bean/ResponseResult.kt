package top.laoshuzi.myapplication.core.network.bean

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(value = JsonInclude.Include.NON_NULL)
class ResponseResult<T> {
    var isSuccess: Boolean = false
    var error: ResponseError? = null
    var result: T? = null
}

