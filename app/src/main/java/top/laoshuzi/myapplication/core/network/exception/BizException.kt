package top.laoshuzi.myapplication.core.network.exception

import top.laoshuzi.myapplication.core.network.bean.ResponseError

open class BizException : RuntimeException {

    var code: String = ""

    constructor(error: ResponseError) : super(error.message) {
        this.code = error.code
    }

    constructor(code: String) {
        this.code = code
    }

    constructor(message: String, code: String) : super(message) {
        this.code = code
    }

    constructor(message: String, cause: Throwable, code: String) : super(message, cause) {
        this.code = code
    }

    constructor(cause: Throwable, code: String) : super(cause) {
        this.code = code
    }

    constructor(
        message: String,
        cause: Throwable,
        enableSuppression: Boolean,
        writableStackTrace: Boolean,
        code: String
    ) : super(message, cause, enableSuppression, writableStackTrace) {
        this.code = code
    }

    fun getError(): ResponseError = ResponseError(code, message)
}
