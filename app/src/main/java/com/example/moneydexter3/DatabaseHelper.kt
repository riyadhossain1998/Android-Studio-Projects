package com.example.moneydexter3

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

// DataBase file representing Room Database

@Database(entities = arrayOf(ItemEntity::class), version = 2)
abstract class DatabaseHelper : RoomDatabase(){
    abstract fun itemDAO() : ItemDao

    val MIGRATION_1_2: Migration = object : Migration(1,2) {
        override fun migrate(database: SupportSQLiteDatabase) {

        }
    }
}

