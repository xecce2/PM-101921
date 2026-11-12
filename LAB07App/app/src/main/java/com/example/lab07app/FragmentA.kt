package com.example.lab07app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class FragmentA : Fragment(R.layout.fragment_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Logika inicjalizacji Fragmentu A
    }
}