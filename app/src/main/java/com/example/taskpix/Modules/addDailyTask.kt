package com.example.taskpix.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.taskpix.R

class addDailyTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_daily_task)

        val Navigate: Button = findViewById(R.id.navi3)
        Navigate.setOnClickListener {
            val intent = Intent(this, addTask::class.java)
            startActivity(intent)

        }

        val backnavigate: ImageView = findViewById(R.id.back12)
        backnavigate.setOnClickListener {
            finish()

        }

        val Navigate2: Button = findViewById(R.id.navi4)
        Navigate2.setOnClickListener {
            val intent = Intent(this, calenderDaily::class.java)
            startActivity(intent)

        }
    }
}