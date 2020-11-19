package top.laoshuzi.myapplication.core.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.blankj.utilcode.util.Utils
import top.laoshuzi.myapplication.core.database.bean.User
import top.laoshuzi.myapplication.core.database.converters.Converters
import top.laoshuzi.myapplication.core.database.dao.UserDao

@Database(
    entities = [
        User::class
    ],
    version = 1
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        fun database(): AppDatabase {
            return Room.databaseBuilder(
                Utils.getApp(),
                AppDatabase::class.java,
                "genghe_db"
            ).build()
        }
    }

    abstract fun userAccountDao(): UserDao

}
