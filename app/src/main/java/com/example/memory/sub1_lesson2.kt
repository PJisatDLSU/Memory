package com.example.memory

import android.app.Dialog
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sub1_lesson2 : AppCompatActivity() {
    //adjust question and answers here
    private val table = arrayOf(
        arrayOf(1, "What is the capital of Japan?", "Tokyo"),
        arrayOf(2, "Which planet is known as the Red Planet?", "Mars"),
        arrayOf(3, "What is the tallest mammal?", "Giraffe"),
        arrayOf(4, "How many continents are there on Earth?", "7")
    )

    //add list here
    private val database = mutableListOf("1", "2", "3","4")
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sub1_lesson1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val topicTitle = findViewById<TextView>(R.id.title)
        val selQuestion = findViewById<Button>(R.id.question)
        val selAnswer = findViewById<Button>(R.id.answer)

        topicTitle.text = "Lesson 2" // adjust this

        selAnswer.visibility = View.INVISIBLE
        selAnswer.isEnabled = false

        selQuestion.text = table[database[index].toInt() - 1][1].toString()
        selQuestion.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        selAnswer.text = table[database[index].toInt() - 1][2].toString()
        selAnswer.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)

        selQuestion.setOnClickListener {
            selAnswer.visibility = View.VISIBLE
            selAnswer.isEnabled = true
        }

        selAnswer.setOnClickListener {
            selAnswer.visibility = View.INVISIBLE
            selAnswer.isEnabled = false

            index++
            if (index >= database.size) {
                println("All values have been used. Restarting...")
                database.shuffle()
                index = 0
                showCompleteDialog()
            }
            selQuestion.text = table[database[index].toInt() - 1][1].toString()
            selQuestion.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
            selAnswer.text = table[database[index].toInt() - 1][2].toString()
            selAnswer.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }
    }

    private fun showCompleteDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.complete)
        val width = resources.displayMetrics.widthPixels * 0.8 // 80% of screen width
        dialog.window?.setLayout(width.toInt(), ViewGroup.LayoutParams.WRAP_CONTENT)
        val tryAgainButton = dialog.findViewById<Button>(R.id.tryAgainButton)
        tryAgainButton.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}