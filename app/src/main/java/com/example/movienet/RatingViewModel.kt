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

        var intent:Intent=getIntent()
        var bundle: Bundle? =intent.extras
        var profileName = bundle?.getString("MovieID")
        var profileScore = bundle?.getFloat("Stars")
        if (profileScore != null) {
            bar.rating=profileScore
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