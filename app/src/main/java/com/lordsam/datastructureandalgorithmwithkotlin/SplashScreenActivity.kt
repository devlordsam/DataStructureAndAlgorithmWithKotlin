package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class SplashScreenActivity : AppCompatActivity() {
    lateinit var lottieAnimationView: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val bg = findViewById<ImageView>(R.id.imageViewBackground)
        val txtAppName = findViewById<TextView>(R.id.textViewSSTitle)
        lottieAnimationView = findViewById(R.id.lottie)

        bg.animate().translationY(-1600F).setDuration(1000).startDelay = 4000
        txtAppName.animate().translationY(1600F).setDuration(1000).startDelay = 4000
        lottieAnimationView.animate().translationY(1600F).setDuration(1000).startDelay = 4000


    }
}