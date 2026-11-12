package com.example.lab06app

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Otwieranie przeglądarki internetowej
        findViewById<Button>(R.id.btnBrowser).setOnClickListener {
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.merito.pl/wroclaw/"))
            safeStartActivity(webIntent, "Brak przeglądarki internetowej")
        }

        // 2. Przygotowanie wiadomości E-mail
        findViewById<Button>(R.id.btnEmail).setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // Zapewnia otwarcie tylko aplikacji pocztowych
                putExtra(Intent.EXTRA_EMAIL, arrayOf("wrx94852@student.wroclaw.merito.pl"))
                putExtra(Intent.EXTRA_SUBJECT, "Pytanie z Laboratorium 06")
            }
            safeStartActivity(emailIntent, "Brak aplikacji pocztowej")
        }

        // 3. Otwieranie lokalizacji na mapie
        findViewById<Button>(R.id.btnMap).setOnClickListener {
            // Współrzędne przykładowe (np. centrum miasta/uczelnia)
            val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:51.107885,17.038538?z=15"))
            safeStartActivity(mapIntent, "Brak aplikacji z mapami")
        }
    }

    // Funkcja pomocnicza chroniąca przed awarią w przypadku braku aplikacji
    private fun safeStartActivity(intent: Intent, errorMessage: String) {
        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
        }
    }
}