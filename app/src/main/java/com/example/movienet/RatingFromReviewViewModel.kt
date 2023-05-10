package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RatingFromReviewViewModel: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rating_from_review_layout)
        var back_button:ImageView = findViewById(R.id.back_button)

        var bar:RatingBar=findViewById(R.id.ratingBar)

        var intent:Intent=getIntent()
        var bundle: Bundle? =intent.extras
        var profileName = bundle?.getString("MovieID")
        // val profileName = intent.getStringExtra("MovieID")
        if(profileName=="cyberpunk") {
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.cyberpunk_edging)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Cyberpunk"
        }else if(profileName=="naruto"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.naruto)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "Naruto"
        }else if(profileName=="mylittlepony"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.my_little_pony)
            var movie_info: TextView =findViewById(R.id.movie_info)
            movie_info.text = " Director: XYZ                                                         Release: 2137"
            var title: TextView = findViewById(R.id.title)
            title.text = "My Little Pony"
        }else{

        }
        back_button.setOnClickListener {
            val intent1 = Intent(this, ExploreViewModel::class.java)
            var bundle1 = Bundle()
            bundle1.putString("Key",profileName)
            bundle1.putFloat("Rating",bar.rating)
            intent1.putExtras(bundle1)
            startActivity(intent1)
        }
    }
}