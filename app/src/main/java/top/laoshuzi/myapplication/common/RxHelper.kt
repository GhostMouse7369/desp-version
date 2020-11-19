package top.laoshuzi.myapplication.common

import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


object RxHelper {

    fun completableToMain(): CompletableTransformer {
        return completableToMain(Schedulers.io())
    }

    fun completableToMain(scheduler: Scheduler): CompletableTransformer {
        return CompletableTransformer { upstream ->
            upstream.subscribeOn(scheduler)
                .observeOn(AndroidSchedulers.mainThread())
        }
    }

    fun <T> maybeToMain(): MaybeTransformer<T, T> {
        return maybeToMain(Schedulers.io())
    }

    fun <T> maybeToMain(scheduler: Scheduler): MaybeTransformer<T, T> {
        return MaybeTransformer { upstream ->
            upstream.subscribeOn(scheduler)
                .observeOn(AndroidSchedulers.mainThread())
        }
    }

    fun <T> singleToMain(): SingleTransformer<T, T> {
        return singleToMain(Schedulers.io())
    }

    fun <T> singleToMain(scheduler: Scheduler): SingleTransformer<T, T> {
        return SingleTransformer { upstream ->
            upstream.subscribeOn(scheduler)
                .observeOn(AndroidSchedulers.mainThread())
        }
    }

    fun <T> observableToMain(): ObservableTransformer<T, T> {
        return observableToMain(Schedulers.io())
    }

    fun <T> observableToMain(scheduler: Scheduler): ObservableTransformer<T, T> {
        return ObservableTransformer { upstream ->
            upstream.subscribeOn(scheduler)
                .observeOn(AndroidSchedulers.mainThread())
        }
    }

    fun <T> flowableToMain(): FlowableTransformer<T, T> {
        return flowableToMain(Schedulers.io())
    }

    fun <T> flowableToMain(scheduler: Scheduler): FlowableTransformer<T, T> {
        return FlowableTransformer { upstream ->
            upstream.subscribeOn(scheduler)
                .observeOn(AndroidSchedulers.mainThread())
        }
    }

}