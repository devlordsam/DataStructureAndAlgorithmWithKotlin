package com.lordsam.datastructureandalgorithmwithkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.buttonMainGetStarted)

        btn.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}