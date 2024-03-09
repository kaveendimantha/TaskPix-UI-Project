package com.example.taskpix.Modules

import android.os.Bundle
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskpix.R

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textView = findViewById<TextView>(R.id.textView)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val linearLayout : LinearLayout = findViewById(R.id.linearLayout)

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