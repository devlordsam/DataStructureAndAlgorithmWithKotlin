package com.lordsam.datastructureandalgorithmwithkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlgorithmActivity : AppCompatActivity() {

    private lateinit var btn1 :Button
    private lateinit var btn2 :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algorithm)

        btn1 = findViewById(R.id.buttonAlgo1)
        btn2 = findViewById(R.id.buttonAlgo2)

        btn1.setOnClickListener {
            startActivity(Intent(this, SearchingAlgorithmsActivity::class.java))
        }

        btn2.setOnClickListener {
            startActivity(Intent(this, SortingAlgorithmsActivity::class.java))
        }
    }
}