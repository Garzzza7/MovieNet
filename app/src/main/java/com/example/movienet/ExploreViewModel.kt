package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExploreViewModel: AppCompatActivity() {
    @SuppressLint("NewApi", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explore_layout)

        var films_textview:TextView=findViewById(R.id.FilmListID);
        var mylist_textview:TextView=findViewById(R.id.MYListID);
        var menu_imageview:ImageView=findViewById(R.id.MenuID);

        films_textview.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
        mylist_textview.setOnClickListener {
            val intent = Intent(this, MyListViewModel::class.java)
            startActivity(intent)
        }

        menu_imageview.setOnClickListener{
            val intent = Intent(this, MenuViewModel::class.java)
            startActivity(intent)
        }
    }
}