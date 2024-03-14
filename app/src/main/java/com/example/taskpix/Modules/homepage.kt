package com.example.taskpix.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskpix.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        val skpNavigate: LinearLayout = findViewById(R.id.protskbtn)
        skpNavigate.setOnClickListener {
            val intent = Intent(this, priortyTask::class.java)
            startActivity(intent)

        }


        val textView = findViewById<TextView>(R.id.textView)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val linearLayout : LinearLayout = findViewById(R.id.linearLayout)

        val bottom_navigation : BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    true
                }
                R.id.page_2 -> {
                    val intent = Intent(this, calanderPriorty::class.java)
                    startActivity(intent)
                    true
                }
                R.id.page_3 -> {
                    val intent = Intent(this, profile::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            } }

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textView.setTextColor(ContextCompat.getColor(this, R.color.checked_text_color))
                linearLayout.background =
                    ContextCompat.getDrawable(this, R.drawable.input_filed_border)

            } else {
                textView.setTextColor(ContextCompat.getColor(this, R.color.unchecked_text_color))
                linearLayout.background =
                    ContextCompat.getDrawable(this, R.drawable.input_filed_border_unselected)
            }
        }
    }
}