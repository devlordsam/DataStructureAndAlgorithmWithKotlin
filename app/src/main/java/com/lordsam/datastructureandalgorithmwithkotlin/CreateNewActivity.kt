package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CreateNewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new)
        val username = findViewById<EditText>(R.id.editTextUserNameCreateNewAct)
        val email = findViewById<EditText>(R.id.editTextEmailCreateNew)
        val phone = findViewById<EditText>(R.id.editTextPhoneCreateNew)
        val pass = findViewById<EditText>(R.id.editTextPass1CreateNew)
        val repass = findViewById<EditText>(R.id.editTextPass2CreateNew)
        val spin = findViewById<Spinner>(R.id.spinnerQuestionCreateNew)
        val answer = findViewById<EditText>(R.id.editTextAnswerCreateNew)
        val submit_btn = findViewById<Button>(R.id.buttonSubmitCreateNew)

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