package com.lordsam.datastructureandalgorithmwithkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {

    private lateinit var btnDS: ImageView
    private lateinit var btnAlgo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnDS = findViewById(R.id.buttonHomeDataStructure)
        btnAlgo = findViewById(R.id.buttonHomeAlgorithms)

        btnDS.setOnClickListener {
            startActivity(Intent(this, DataStructureActivity::class.java))
        }

        btnAlgo.setOnClickListener {
            startActivity(Intent(this, AlgorithmActivity::class.java))
        }
    }
}