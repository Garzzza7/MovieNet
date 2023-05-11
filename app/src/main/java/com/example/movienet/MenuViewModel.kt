package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuViewModel : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_layout)

        //var logout_view : TextView = findViewById(R.id.SettingsID)
        var settings_view : TextView = findViewById(R.id.SettingsID)
        var back_button: ImageButton = findViewById(R.id.back_button)


        /*logout_view.setOnClickListener {
            val intent = Intent(this, LoginViewModel::class.java)
            startActivity(intent)
        }*/
        settings_view.setOnClickListener {
            val intent = Intent(this, SettingsViewModel::class.java)
            startActivity(intent)
        }

        back_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}