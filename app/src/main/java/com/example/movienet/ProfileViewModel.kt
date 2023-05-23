package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ProfileViewModel: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)

        var back_button: ImageButton = findViewById(R.id.back_button)

        back_button.setOnClickListener {
            val intent = Intent(this, SettingsViewModel::class.java)
            startActivity(intent)
        }
    }
}