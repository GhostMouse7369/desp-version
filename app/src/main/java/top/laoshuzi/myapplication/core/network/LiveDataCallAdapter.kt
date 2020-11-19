package top.laoshuzi.myapplication.core.network

import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Callback
import retrofit2.Response
import top.laoshuzi.myapplication.core.network.bean.ResponseResult
import java.lang.reflect.Type
import java.util.concurrent.atomic.AtomicBoolean

@Deprecated("experiment")
class LiveDataCallAdapter<R>(private val responseType: Type) : CallAdapter<R, LiveData<ResponseResult<R>>> {

    override fun adapt(call: Call<R>): LiveData<ResponseResult<R>> {
        return object : LiveData<ResponseResult<R>>() {
            private var started = AtomicBoolean(false)
            override fun onActive() {
                super.onActive()
                if (started.compareAndSet(false, true)) {
                    call.enqueue(object : Callback<R> {
                        override fun onResponse(call: Call<R>, response: Response<R>) {
                            postValue(ResponseResult())
                        }

                        override fun onFailure(call: Call<R>, throwable: Throwable) {
                            postValue(ResponseResult())
                        }
                    })
                }
            }
        }
    }

    override fun responseType() = responseType
}