package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RatingViewModel: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ratingview)
        var back_button:ImageView = findViewById(R.id.back_button)

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

        if(anime_name=="BMF"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_fusion)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Beyblade Metal Fusion"
        }
        else if(anime_name=="BMM"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_masters)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Beyblade Metal Masters"
        }
        else if(anime_name=="BMFU"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_fury)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Beyblade Metal Fury"
        }
        else if(anime_name=="CP"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.cyberpunk_edging)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Cyberpunk: Edgerunners"
        }
        else if(anime_name=="BL"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.bleach)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Bleach"
        }
        else if(anime_name=="EVA"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.evangelion)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Evangelion"
        }
        else if(anime_name=="GC"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.guilty_crown)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Guilty Crown"
        }
        else if(anime_name=="KIZ"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.kiznaiver)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Kiznaiver"
        }
        else if(anime_name=="NAR"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.naruto)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Naruto"
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
            var bundle1 = Bundle()
            bundle1.putString("Key",profileName)
            bundle1.putFloat("Rating",bar.rating)
            intent1.putExtras(bundle1)
            startActivity(intent1)
        }
    }
}