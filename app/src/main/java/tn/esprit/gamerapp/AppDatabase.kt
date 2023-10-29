package tn.esprit.gamerapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [StoreData::class], version = 1 , exportSchema = false)
abstract class AppDatabase :RoomDatabase()  {

    abstract  fun storeDao() : StoreDao

    companion object{
        fun getDatabase (context : Context):AppDatabase {
            return Room.databaseBuilder(context,AppDatabase::class.java,"db_games").allowMainThreadQueries().build()
        }
    }
}