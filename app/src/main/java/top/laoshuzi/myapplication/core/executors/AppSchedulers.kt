package top.laoshuzi.myapplication.core.executors

import android.os.Handler
import android.os.Looper
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Executor
import java.util.concurrent.Executors

enum class AppSchedulers(val scheduler: Scheduler) {

    DISK_IO(Schedulers.from(Executors.newSingleThreadExecutor())),

    NETWORK(Schedulers.from(Executors.newFixedThreadPool(3))),

    MAIN_THREAD(Schedulers.from(MainThreadExecutor()));

    internal class MainThreadExecutor : Executor {
        private val mainThreadHandler = Handler(Looper.getMainLooper())

        override fun execute(command: Runnable) {
            mainThreadHandler.post(command)
        }
    }

}

//class AppSchedulers {
//
//    var diskIO: Executor? = null
//        private set
//
//    var networkIO: Executor? = null
//        private set
//
//    var mainThread: Executor? = null
//        private set
//
//    constructor() {
//        this.diskIO = Executors.newSingleThreadExecutor()
//        this.networkIO = Executors.newFixedThreadPool(3)
//        this.mainThread = MainThreadExecutor()
//    }
//
//    constructor(diskIO: Executor?, networkIO: Executor?, mainThread: Executor?) {
//        this.diskIO = diskIO
//        this.networkIO = networkIO
//        this.mainThread = mainThread
//    }
//
//    internal class MainThreadExecutor : Executor {
//        private val mainThreadHandler = Handler(Looper.getMainLooper())
//
//        override fun execute(command: Runnable) {
//            mainThreadHandler.post(command)
//        }
//    }
//}