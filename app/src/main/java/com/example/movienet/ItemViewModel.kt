package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemViewModel : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_layout)
        val profileName = intent.getStringExtra("ID")
        var back_button:ImageView = findViewById(R.id.back_button)
        var add_button:Button = findViewById(R.id.add_button)

        if(profileName=="BMF"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_fusion)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Beyblade Metal Fusion"
        }
        else if(profileName=="BMM"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_masters)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Beyblade Metal Masters"
        }
        else if(profileName=="BMFU"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_fury)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Beyblade Metal Fury"
        }
        else if(profileName=="CP"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.cyberpunk_edging)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Cyberpunk: Edgerunners"
        }
        else if(profileName=="BL"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.bleach)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Bleach"
        }
        else if(profileName=="EVA"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.evangelion)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Evangelion"
        }
        else if(profileName=="GC"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.guilty_crown)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Guilty Crown"
        }
        else if(profileName=="KIZ"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.kiznaiver)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Kiznaiver"
        }
        else if(profileName=="NAR"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.naruto)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Naruto"
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