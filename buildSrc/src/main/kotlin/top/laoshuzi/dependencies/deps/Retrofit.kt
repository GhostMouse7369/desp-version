package top.laoshuzi.dependencies.deps

object Retrofit {

    val retrofit_version = "2.3.0"

    val retrofit = Deps("com.squareup.retrofit2", "retrofit", retrofit_version)
    val adapter_rxjava2 = Deps("com.squareup.retrofit2", "adapter-rxjava2", retrofit_version)
    val converter_gson = Deps("com.squareup.retrofit2", "converter-gson", retrofit_version)
    val converter_scalars = Deps("com.squareup.retrofit2", "converter-scalars", retrofit_version)

}
