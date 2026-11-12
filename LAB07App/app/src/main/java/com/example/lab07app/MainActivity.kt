package com.example.lab07app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private var isFragmentA = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSwitch = findViewById<Button>(R.id.btnSwitchFragment)

        // Domyślne załadowanie Fragmentu A przy pierwszym uruchomieniu
        if (savedInstanceState == null) {
            replaceFragment(FragmentA())
        }

        btnSwitch.setOnClickListener {
            if (isFragmentA) {
                replaceFragment(FragmentB())
                btnSwitch.text = "Przełącz na Fragment A"
            } else {
                replaceFragment(FragmentA())
                btnSwitch.text = "Przełącz na Fragment B"
            }
            isFragmentA = !isFragmentA
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}