package com.hfad.assignment1_christina_preciosa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade)

        val score = intent.getDoubleExtra("score", 0.0)

        val letter = Gradecalc().calcGarce(score)

        val gradeTV = findViewById<TextView>(R.id.Grade)
        gradeTV.text= "Your Letter Grade Is:  $letter"
    }
}