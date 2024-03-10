package com.example.taskpix.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskpix.R

class priortyTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_priorty_task)

        val backnavigate: ImageView = findViewById(R.id.bachome)
        backnavigate.setOnClickListener {
            finish()

        }

            val edtbtn: Button = findViewById(R.id.edtaskbtn)
            edtbtn.setOnClickListener {
                val intent = Intent(this, enditpriortytask::class.java)
                startActivity(intent)
            }

        }
    }