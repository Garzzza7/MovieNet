package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginViewModel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_layout)

        var login_button: Button = findViewById(R.id.login_btn)
        var signup_button: Button = findViewById(R.id.signup_login)

        login_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        signup_button.setOnClickListener {
            val intent = Intent(this, RegisterViewModel::class.java)
            startActivity(intent)
        }
    }
}