package com.tests.bonapp

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class ReserveSeats : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve_seats)


        val numSeats = findViewById<EditText>(R.id.seats) as EditText
        val veg = findViewById<CheckBox>(R.id.checkVeg) as CheckBox
        val card = findViewById<Switch>(R.id.card) as Switch
        val cash = findViewById<Switch>(R.id.cash) as Switch
        var seats = "0"
        var ifV = ""
        var payment = "Please select one payment method"
        var message = ""
        val reservedFor = getString(R.string.reservedFor)
        val ppl = getString(R.string.people)
        val notVeg = getString(R.string.notV)
        val vegYes = getString(R.string.vegan)
        val payCrd = getString(R.string.payCard)
        val payCsh = getString(R.string.payCash)
        val onePay = getString(R.string.oneP)

        veg.setOnClickListener{
            if(veg.isChecked){
                ifV = vegYes
            }
            else{
                ifV = notVeg
            }
        }

        var checkCash = 0
        var checkCard = 0

        card.setOnCheckedChangeListener{ _, isChecked ->
            if(!cash.isChecked){
                payment = payCrd
            }
            else{
                payment =onePay
            }
        }
        cash.setOnCheckedChangeListener{_, isChecked ->
            if(!card.isChecked) {
                payment = payCsh
            }
            else{
                payment = onePay
            }
        }





        val button = findViewById<Button>(R.id.buttonB)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(androidx.appcompat.R.anim.abc_slide_in_top, androidx.appcompat.R.anim.abc_slide_out_top)
        }

        val buttonR = findViewById<Button>(R.id.buttonReserve)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //message to display with reservation details
        val builder = AlertDialog.Builder(this)
        buttonR.setOnClickListener{
            builder.apply{
                setTitle("Reservation Details")
                seats = numSeats.text.toString()
                setMessage("$reservedFor $seats $ppl" + "\n" + "$payment" + "\n" + "$ifV")
                setCancelable(true)

                builder.setPositiveButton("Got it!") { po, p1 ->
                }
                val dialog = builder.create()
                dialog.show()
            }
        }
    }
}