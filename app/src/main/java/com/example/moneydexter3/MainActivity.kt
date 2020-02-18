package com.example.moneydexter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageButton
import androidx.room.Room
import kotlinx.android.synthetic.main.fragment_add_transaction2.*

class MainActivity : AppCompatActivity() {

    val prices = mutableListOf<Double>()

// Declare Add Button from homepage
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Room.databaseBuilder(applicationContext.getApplicationContext(),DatabaseHelper::class.java, "MoneyDexterDB").fallbackToDestructiveMigration().build()

    }

}
