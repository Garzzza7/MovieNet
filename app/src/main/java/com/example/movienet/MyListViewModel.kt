package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MyListViewModel: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mylist_layout)

        var  ib1: ImageButton = findViewById(R.id.imageButton1);
        var  ib2: ImageButton = findViewById(R.id.imageButton2);
        var  ib3: ImageButton = findViewById(R.id.imageButton3);
        ib1.setImageResource(R.drawable.geas)
        ib2.setImageResource(R.drawable.jojo)
        ib3.setImageResource(R.drawable.jojovento)


        var films_textview:TextView=findViewById(R.id.FilmListID);
        var explore_textview:TextView=findViewById(R.id.ExploreID);


        films_textview.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        explore_textview.setOnClickListener {
            val intent = Intent(this, ExploreViewModel::class.java)
            startActivity(intent)
        }



        ib1.setOnClickListener{
            val intent = Intent(this, RatingViewModel::class.java)
            intent.putExtra("MovieID","geas")
            startActivity(intent)
        }
        ib2.setOnClickListener{
            val intent = Intent(this, RatingViewModel::class.java)
            intent.putExtra("MovieID","jojo1")
            startActivity(intent)
        }
        ib3.setOnClickListener{
            val intent = Intent(this, RatingViewModel::class.java)
            intent.putExtra("MovieID","jojo5")
            startActivity(intent)
        }


    }
}