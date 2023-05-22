package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RatingViewModel: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ratingview)
        var back_button:ImageView = findViewById(R.id.back_button)
        var check_button:ImageView = findViewById(R.id.check_button)

        var bar:RatingBar=findViewById(R.id.ratingBar)

        var i: Intent = intent
        var b: Bundle? = intent.extras
        var anime_name = b?.getString("Anime_Name")


        var intent:Intent= intent
        var bundle: Bundle? =intent.extras
        var profileName = bundle?.getString("MovieID")
        var profileScore = bundle?.getFloat("Stars")
        if (profileScore != null) {
            bar.rating=profileScore
        }

        if(anime_name=="guardians"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.guardians)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: James Gunn                                          Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Guardians of the Galaxy Vol. 3"
        }
        else if(anime_name=="john"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.john)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Chad Stahelski                                      Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "John Wick: Chapter 4"
        }
        else if(anime_name=="barbie"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.barbie)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Greta Gerwig                                        Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Barbie"
        }
        else if(anime_name=="mario"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.mario)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Aaron Horvath                                       Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Super Mario Bros: Film"
        }
        else if(anime_name=="fastx"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.fastx)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Louis Leterrier                                     Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Fast X"
        }
        else if(anime_name=="asterix"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.asterix)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Guillaume Canet                                     Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Asterix & Obelix: The Middle Empire"
        }
        else if(anime_name=="spiderman"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.spiderman)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Joaquim Dos Santos                                  Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Spider-Man: Across the Spider-Verse"
        }
        else if(anime_name=="scream"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.scream)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Matt Bettinelli-Olpin                               Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Scream VI"
        }
        else if(anime_name=="syrenka"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.syrenka)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Rob Marshall                                        Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "The Little Mermaid"
        }







       // val profileName = intent.getStringExtra("MovieID")
        if(profileName=="geas") {
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.geas)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Geas"
        }else if(profileName=="jojo1"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.jojo)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "JoJo"
        }else if(profileName=="jojo5"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.jojovento)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Jojo Vento"
        }else{

        }
        back_button.setOnClickListener {
            val intent1 = Intent(this, MyListViewModel::class.java)
//            var bundle1 = Bundle()
//            bundle1.putString("Key",profileName)
//            bundle1.putFloat("Rating",bar.rating)
//            intent1.putExtras(bundle1)
            startActivity(intent1)
        }
        check_button.setOnClickListener{
            val intent1 = Intent(this, MyListViewModel::class.java)
            var bundle1 = Bundle()
            bundle1.putString("Key",profileName)
            bundle1.putFloat("Rating",bar.rating)
            intent1.putExtras(bundle1)
            startActivity(intent1)
        }
    }
}