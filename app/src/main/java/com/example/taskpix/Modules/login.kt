package com.example.taskpix.Modules

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.taskpix.R

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnNavigate: TextView = findViewById(R.id.btnsignin)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val logbtnNavigate: Button = findViewById(R.id.btnlogin)
        logbtnNavigate.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)

        }
    }
}