package com.example.moneydexter3

import androidx.room.*

@Dao
interface ItemDao {

    @Insert
    fun saveItem(item: ItemEntity)

    @Update
    fun update(item: ItemEntity)

    @Delete
    fun deleteItem(item: ItemEntity)

    @Query("SELECT * FROM items")
    fun selectAllItems(name: String): List<ItemEntity>

}