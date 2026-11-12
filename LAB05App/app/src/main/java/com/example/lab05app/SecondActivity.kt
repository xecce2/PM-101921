package com.example.lab05app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvWelcomeMessage = findViewById<TextView>(R.id.tvWelcomeMessage)

        val userName = intent.getStringExtra("USER_NAME") ?: "Nieznajomy"
        val studentId = intent.getStringExtra("STUDENT_ID") ?: "Brak ID"

        tvWelcomeMessage.text = "Witaj, $userName!\nTwój numer studenta: $studentId"
    }
}