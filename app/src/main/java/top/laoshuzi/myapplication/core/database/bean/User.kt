package top.laoshuzi.myapplication.core.database.bean

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "user"
)
class User {

    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: Long? = null

    @ColumnInfo(name = "username", index = true)
    var username: String? = null

    @ColumnInfo(name = "phone", index = true)
    var phone: String? = null

    @ColumnInfo(name = "token")
    var token: String? = null

    @ColumnInfo(name = "nick_name")
    var nickName: String? = null

    @ColumnInfo(name = "avatar_url")
    var avatarUrl: String? = null

}