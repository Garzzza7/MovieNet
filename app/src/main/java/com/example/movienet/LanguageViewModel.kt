package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LanguageViewModel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.language_layout)

        // to do languages
        var back_button: ImageButton = findViewById(R.id.back_button)

        back_button.setOnClickListener {
            val intent = Intent(this, SettingsViewModel::class.java)
            startActivity(intent)
        }
    }
}