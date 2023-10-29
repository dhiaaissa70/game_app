package tn.esprit.gamerapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface StoreDao {

    @Insert
    fun insertItem (items: StoreData)
    @Delete
    fun deteleItem(items: StoreData)

    @Update
    fun updateItem (items: StoreData)

    @Query("select * from storedata")
    fun getALLitems(): MutableList<StoreData>

    @Query("select * from storedata where id = :id")
    fun getItemById(id:Int): StoreData?
}