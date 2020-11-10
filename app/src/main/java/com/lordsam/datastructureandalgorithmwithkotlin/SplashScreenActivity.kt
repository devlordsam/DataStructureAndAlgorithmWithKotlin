package com.lordsam.datastructureandalgorithmwithkotlin

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var bg: ImageView
    private lateinit var txtAppName: TextView
    private lateinit var lottieAnimationView: LottieAnimationView
    private lateinit var sharedPref: SharedPreferences
    private var firstRun: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        sharedPref = getSharedPreferences("First Run", MODE_PRIVATE)

        isFirstRun()
    }

    private fun animate() {

        bg = findViewById(R.id.imageViewBackground)
        txtAppName = findViewById(R.id.textViewSSTitle)
        lottieAnimationView = findViewById(R.id.lottie)

        bg.animate().translationY(-1600F).setDuration(1000).startDelay = 2000
        txtAppName.animate().translationY(1600F).setDuration(1000).startDelay = 2000
        lottieAnimationView.animate().translationY(1600F).setDuration(1000).startDelay = 2000
    }

    private fun isFirstRun() {

        firstRun = sharedPref.getBoolean("isFirstRun", true)

        if (firstRun!!) {
            sharedPref.edit().putBoolean("isFirstRun", false).apply()
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            animate()
            Handler().postDelayed({
                startActivity(Intent(this, HomeActivity::class.java))
            }, 3200)
        }

    }
}