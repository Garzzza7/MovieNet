package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RatingViewModel: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ratingview)
        var back_button:ImageView = findViewById(R.id.back_button)


        val profileName = intent.getStringExtra("MovieID")
        if(profileName=="geas") {
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.geas)
        }else if(profileName=="jojo1"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.jojo)
        }else if(profileName=="jojo5"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.jojovento)
        }
        back_button.setOnClickListener {
            val intent = Intent(this, MyListViewModel::class.java)
            startActivity(intent)
        }
    }
}