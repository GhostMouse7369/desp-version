package top.laoshuzi.myapplication.core.network.bean

class ResponseError {
    var code: String = ""
    var message: String? = null

    constructor()

    constructor(code: String, message: String?) {
        this.code = code
        this.message = message
    }


}
