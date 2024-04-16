package com.example.memory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sub1BTN =findViewById<Button>(R.id.subject1)
        val sub2BTN = findViewById<Button>(R.id.subject2)

        sub1BTN.setOnClickListener{
            val Page1 = Intent(this, sub1::class.java)
            startActivity(Page1)
        }
        sub2BTN.setOnClickListener{
            val Page2 = Intent(this, sub2::class.java)
            startActivity(Page2)
        }
    }
}
