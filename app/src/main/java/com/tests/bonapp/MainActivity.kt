package com.tests.bonapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pizza = findViewById<ImageView>(R.id.pizzaPic) as ImageView
        pizza.setOnClickListener {
            val Intent = Intent(this, pizzadeets::class.java)
            startActivity(Intent)
        }

        val coffee = findViewById<ImageView>(R.id.coffeePic) as ImageView
        coffee.setOnClickListener {
            val intent = Intent(this, coffeedeets::class.java)
            startActivity(intent)
        }

        val soda = findViewById<ImageView>(R.id.sodaPic) as ImageView
        soda.setOnClickListener {
            val intent = Intent(this, sodadeets::class.java)
            startActivity(intent)
        }

        val icecream = findViewById<ImageView>(R.id.icePic) as ImageView
        icecream.setOnClickListener {
            val intent = Intent(this, icecreamdeets::class.java)
            startActivity(intent)
        }

        val reserveseats = findViewById<Button>(R.id.buttonReserve)
        reserveseats.setOnClickListener {
            val intent = Intent(this, ReserveSeats::class.java)
            startActivity(intent)
        }

    }
}