package com.example.memory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sub1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sub1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val l1 = findViewById<Button>(R.id.lesson1)
        val l2 = findViewById<Button>(R.id.lesson2)

        l1.setOnClickListener{
            val Page1 = Intent(this, sub1_lesson1::class.java)
            startActivity(Page1)
        }

        l2.setOnClickListener{
            val Page2 = Intent(this, sub1_lesson2::class.java)
            startActivity(Page2)
        }
    }
}