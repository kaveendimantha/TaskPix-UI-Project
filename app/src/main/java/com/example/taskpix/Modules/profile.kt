package com.example.taskpix.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.taskpix.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.math.log10

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val Navigatenew: LinearLayout = findViewById(R.id.mypro1)
        Navigatenew.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }

        val Navigate3: LinearLayout = findViewById(R.id.statbt)
        Navigate3.setOnClickListener {
            val intent = Intent(this, statistic::class.java)
            startActivity(intent)

        }

        val Navigate4: LinearLayout = findViewById(R.id.loc1)
        Navigate4.setOnClickListener {
            val intent = Intent(this, location::class.java)
            startActivity(intent)

        }

        val Navigate5: LinearLayout = findViewById(R.id.setbtn)
        Navigate5.setOnClickListener {
            val intent = Intent(this, settings::class.java)
            startActivity(intent)

        }

        val Navigatepro: LinearLayout = findViewById(R.id.logout3)
        Navigatepro.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottom_navigation.selectedItemId = R.id.page_3

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    val intent = Intent(this, homepage::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_2 -> {
                    val intent = Intent(this, calanderPriorty::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_3 -> {
                    true
                }
                else -> false
            } }

    }
}