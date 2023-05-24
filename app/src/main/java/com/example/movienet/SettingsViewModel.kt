package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SettingsViewModel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_layout)

        // to do profile and privacy
        var language_button: TextView = findViewById(R.id.LanguageID)
        var back_button: ImageButton = findViewById(R.id.back_button)

        language_button.setOnClickListener {
            val intent = Intent(this, LanguageViewModel::class.java)
            startActivity(intent)
        }
        back_button.setOnClickListener {
            val intent = Intent(this, MenuViewModel::class.java)
            startActivity(intent)
        }

    }

}