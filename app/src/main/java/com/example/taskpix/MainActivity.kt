package com.example.taskpix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.taskpix.Modules.onboardScreen1

private val handler = Handler(Looper.getMainLooper())

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler.postDelayed({
            startActivity(Intent(this, onboardScreen1::class.java))
            finish()
        }, 2500L)
    }
}