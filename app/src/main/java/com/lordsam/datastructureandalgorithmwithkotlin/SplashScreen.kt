package com.lordsam.datastructureandalgorithmwithkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    private val SPLASH_SCREEN_TIME_OUT: Long = 300
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            startActivity(Intent(this, CreateNewActivity::class.java))
            finish()
        }, SPLASH_SCREEN_TIME_OUT)
    }
}
