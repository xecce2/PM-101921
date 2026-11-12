package com.example.lab05app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etStudentId = findViewById<EditText>(R.id.etStudentId)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("USER_NAME", etName.text.toString())
                putExtra("STUDENT_ID", etStudentId.text.toString())
            }
            startActivity(intent)
        }
    }
}