package com.example.taskpix.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskpix.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class calenderDaily : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calender_daily)

        val Navigate33: Button = findViewById(R.id.adddily)
        Navigate33.setOnClickListener {
            val intent = Intent(this, addDailyTask::class.java)
            startActivity(intent)
        }
        val Navigate2: TextView = findViewById(R.id.pritsk)
        Navigate2.setOnClickListener {
            val intent = Intent(this, calanderPriorty::class.java)
            startActivity(intent)
        }

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottom_navigation.selectedItemId = R.id.page_2

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    val intent = Intent(this, homepage::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_2 -> {
                    true
                }
                R.id.page_3 -> {
                    val intent = Intent(this, profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            } }




    }

}