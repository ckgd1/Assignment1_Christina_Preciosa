package com.hfad.assignment1_christina_preciosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val score = findViewById<EditText>(R.id.editTextText)
        val grade = findViewById<Button>(R.id.bGrade)

        grade.setOnClickListener {
            val scoreStr = score.text.toString()
            if (scoreStr.isNotEmpty()) {
                val scor = scoreStr.toDouble()
                val intent = Intent(this, GradeActivity::class.java)
                intent.putExtra("score", scor)
                startActivity(intent)
            }
        }
    }
}

