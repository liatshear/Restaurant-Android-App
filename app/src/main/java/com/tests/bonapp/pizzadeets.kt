package com.tests.bonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pizzadeets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizzadeets)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener{
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
            overridePendingTransition(androidx.appcompat.R.anim.abc_slide_in_top, androidx.appcompat.R.anim.abc_slide_out_top)
        }
    }
}