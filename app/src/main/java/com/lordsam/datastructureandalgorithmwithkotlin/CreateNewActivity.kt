package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CreateNewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new)
        val username = findViewById<EditText>(R.id.ETUserNameCNA)
        val email = findViewById<EditText>(R.id.ETEmailCNA)
        val phone = findViewById<EditText>(R.id.ETPhoneCNA)
        val pass = findViewById<EditText>(R.id.ETPass1CNA)
        val repass = findViewById<EditText>(R.id.ETPass2CNA)
        val spin = findViewById<Spinner>(R.id.SSecqurityQusCNA)
        val answer = findViewById<EditText>(R.id.ETSecqurityAnsCNA)
        val submit_btn = findViewById<Button>(R.id.BtnSubmitCNA)

        val Questions = listOf(
            "What is your Pet Name",
            "What is Your School Name",
            "What is your nick name",
            "Who is your love",
            "What is Your Fav Spot"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, Questions)
        spin.adapter = adapter
    }
}