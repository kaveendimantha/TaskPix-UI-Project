package com.example.taskpix.Modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.taskpix.R

class onboardScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen1)

        val btnNavigate: Button = findViewById(R.id.btnNavigate1)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, onboardScreen2::class.java)
            startActivity(intent)
        }

        val skpNavigate: TextView = findViewById(R.id.skpNavigate1)
        skpNavigate.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}