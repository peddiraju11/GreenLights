package com.example.user.testsample.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.user.testsample.R

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background = object : Thread() {
            override fun run() {
                Thread.sleep((1 * 2000).toLong())
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            }
        }

        background.start()
    }
}
