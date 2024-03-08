package com.example.taskpix.Modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.taskpix.R

class onboardScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen2)

        val btnNavigate: Button = findViewById(R.id.btnNavigate2)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, onboardScreen3::class.java)
            startActivity(intent)
        }
    }
}