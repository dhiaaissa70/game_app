package tn.esprit.gamerapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StoreData(
    @PrimaryKey(autoGenerate = true)
    var id :Int,

    var title:String,

    var category:String,

    var price:Int,

    var img:Int,
)
