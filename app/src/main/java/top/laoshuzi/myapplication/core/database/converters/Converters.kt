package top.laoshuzi.myapplication.core.database.converters

import androidx.room.TypeConverter
import java.util.*


object Converters {

    @TypeConverter
    fun fromTimestamp(value: Long): Date? {
        return Date(value)
    }

    @TypeConverter
    fun dateToTimestamp(date: Date): Long? {
        return date.time
    }

}
