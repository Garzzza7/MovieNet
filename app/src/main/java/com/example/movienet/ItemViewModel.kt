package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemViewModel : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_layout)
        val profileName = intent.getStringExtra("ID")
        var back_button:ImageView = findViewById(R.id.back_button)
        var add_button:Button = findViewById(R.id.add_button)

        if(profileName=="guardians"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.guardians)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: James Gunn                                          Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Guardians of the Galaxy Vol. 3"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "Still reeling from the loss of Gamora, Peter Quill rallies his team to defend the universe and one of their own - a mission that could mean the end of the Guardians if not successful."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 5F
        }
        else if(profileName=="john"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.john)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Chad Stahelski                                      Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "John Wick: Chapter 4"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 4F
        }
        else if(profileName=="barbie"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.barbie)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Greta Gerwig                                        Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Barbie"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "To live in Barbie Land is to be a perfect being in a perfect place. Unless you have a full-on existential crisis. Or you're a Ken."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 4F
        }
        else if(profileName=="mario"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.mario)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Aaron Horvath                                       Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Super Mario Bros: Film"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "The story of The Super Mario Bros. on their journey through the Mushroom Kingdom."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 3F
        }
        else if(profileName=="fastx"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.fastx)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Louis Leterrier                                     Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Fast X"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "Dom Toretto and his family are targeted by the vengeful son of drug kingpin Hernan Reyes."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 4F
        }
        else if(profileName=="asterix"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.asterix)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Guillaume Canet                                     Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Asterix & Obelix: The Middle Empire"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "The only daughter of the Chinese emperor Han Xuandi, escapes from a strict prince and seeks help from the Gauls and the two brave warriors Asterix and Obelix."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 2F
        }
        else if(profileName=="spiderman"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.spiderman)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Joaquim Dos Santos                                  Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Spider-Man: Across the Spider-Verse"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "Miles Morales catapults across the Multiverse, where he encounters a team of Spider-People charged with protecting its very existence. When the heroes clash on how to handle a new threat, Miles must redefine what it means to be a hero."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 5F
        }
        else if(profileName=="scream"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.scream)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Matt Bettinelli-Olpin                               Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "Scream VI"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "In the next installment, the survivors of the Ghostface killings leave Woodsboro behind and start a fresh chapter in New York City."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 3F
        }
        else if(profileName=="syrenka"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.syrenka)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: Rob Marshall                                        Release: 2023"
            var title: TextView = findViewById(R.id.title)
            title.text = "The Little Mermaid"
            var movie_info_exp: TextView = findViewById(R.id.movie_info_expanded)
            movie_info_exp.text = "A young mermaid makes a deal with a sea witch to trade her beautiful voice for human legs so she can discover the world above water and impress a prince."
            var stars: RatingBar = findViewById(R.id.ScoreBar)
            stars.rating = 4F
        }
        back_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        add_button.setOnClickListener {
            val intent = Intent(this, MyListViewModel::class.java)
            intent.putExtra("Anime_Name",profileName);
            startActivity(intent)
        }
    }
}