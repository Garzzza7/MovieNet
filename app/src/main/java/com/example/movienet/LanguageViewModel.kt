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
        var polish_view : TextView = findViewById(R.id.PolishID)
        var english_view : TextView = findViewById(R.id.EnglishID)
        var portuguese_view : TextView = findViewById(R.id.PortugueseID)
        var back_button: ImageButton = findViewById(R.id.back_button)

        back_button.setOnClickListener {
            val intent = Intent(this, SettingsViewModel::class.java)
            startActivity(intent)
        }
        polish_view.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        english_view.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        portuguese_view.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}