package top.laoshuzi.dependencies.deps

/**
 * Created by laoshuzi on 2023/4/4.
 */
object JavaEx {

    val ijpay_version = "2.9.10-17"


    val ijpay_all = Deps("com.github.javen205", "IJPay-All", ijpay_version)
    val ijpay_alipay = Deps("com.github.javen205", "IJPay-AliPay", ijpay_version)
    val ijpay_wxpay = Deps("com.github.javen205", "IJPay-WxPay", ijpay_version)
    val ijpay_qq = Deps("com.github.javen205", "IJPay-QQ", ijpay_version)
    val ijpay_jdpay = Deps("com.github.javen205", "IJPay-JDPay", ijpay_version)
    val ijpay_unionpay = Deps("com.github.javen205", "IJPay-UnionPay", ijpay_version)
    val ijpay_paypal = Deps("com.github.javen205", "IJPay-PayPal", ijpay_version)

}