package com.example.moneydexter3

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity(tableName = "items")
data class ItemEntity(var id: Int, var iname: String, var p: Double, var ncity: Int){

    @PrimaryKey (autoGenerate = true)
    @ColumnInfo(name = "ITEM_ID")
    var item_id : Int = 100

    @ColumnInfo (name = "ITEM_NAME")
    var itemName : String = ""

    @ColumnInfo (name = "PRICE")
    var price : Double = 0.0

    @ColumnInfo (name = "NECESSITY")
    var necessity : Int = 0

}