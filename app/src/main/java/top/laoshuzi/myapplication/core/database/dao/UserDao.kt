package top.laoshuzi.myapplication.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Update
import io.reactivex.Single
import top.laoshuzi.myapplication.core.database.bean.User

@Dao
interface UserDao {

    @Insert(onConflict = REPLACE)
    fun createOrUpdate(vararg user: User): Single<List<Long>>

    @Update
    fun update(vararg user: User): Single<Int>

    @Delete
    fun delete(vararg user: User): Single<Int>

}
