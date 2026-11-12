package com.example.lab08app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<FloatingActionButton>(R.id.fabAction)
        fab.setOnClickListener {
            Toast.makeText(this, "Kliknięto FAB - Wysyłanie wiadomości profilowej", Toast.LENGTH_SHORT).show()
        }
    }
}
