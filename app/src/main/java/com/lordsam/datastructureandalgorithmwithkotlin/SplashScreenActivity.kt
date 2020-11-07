package com.lordsam.datastructureandalgorithmwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var bg: ImageView
    private lateinit var txtAppName: TextView
    private lateinit var lottieAnimationView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        animate()
    }

    private fun animate() {

        bg = findViewById(R.id.imageViewBackground)
        txtAppName = findViewById(R.id.textViewSSTitle)
        lottieAnimationView = findViewById(R.id.lottie)

        bg.animate().translationY(-1600F).setDuration(1000).startDelay = 4000
        txtAppName.animate().translationY(1600F).setDuration(1000).startDelay = 4000
        lottieAnimationView.animate().translationY(1600F).setDuration(1000).startDelay = 4000
    }
}