package com.example.taskpix.Modules

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskpix.R

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)

        val backnavigate: ImageView = findViewById(R.id.backse)
        backnavigate.setOnClickListener {
            finish()

        }

        val Navigate: LinearLayout = findViewById(R.id.updtpw)
        Navigate.setOnClickListener {
            val intent = Intent(this, updatepassword::class.java)
            startActivity(intent)

        }

    }
}