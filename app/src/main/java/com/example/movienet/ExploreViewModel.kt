package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExploreViewModel: AppCompatActivity() {

    var reviewRepository = MovieDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explore_layout)

        var ib1: ImageButton = findViewById(R.id.imageButton1);
        var ib2: ImageButton = findViewById(R.id.imageButton2);
        var ib3: ImageButton = findViewById(R.id.imageButton3);
        ib1.setImageResource(R.drawable.cyberpunk_edging)
        ib2.setImageResource(R.drawable.naruto)
        ib3.setImageResource(R.drawable.my_little_pony)

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

        var intent: Intent = getIntent()
        var bundle: Bundle? = intent.extras
        var profileName = bundle?.getString("Key")
        var profileScore = bundle?.getFloat("Rating")
        if (profileName != null) {
            if (profileScore != null) {
                reviewRepository.update(profileName, profileScore)
            }
        }

        ib1.setOnClickListener {
            val intent = Intent(this, RatingFromReviewViewModel::class.java)
            var bundle = Bundle()
            bundle.putString("MovieID", "cyberpunk")
            reviewRepository.get_value("cyberpunk")?.let { it1 -> bundle.putFloat("Stars", it1) }
            intent.putExtras(bundle)
            startActivity(intent)
        }
        ib2.setOnClickListener {
            val intent = Intent(this, RatingFromReviewViewModel::class.java)
            var bundle = Bundle()
            bundle.putString("MovieID", "naruto")
            reviewRepository.get_value("naruto")?.let { it1 -> bundle.putFloat("Stars", it1) }
            intent.putExtras(bundle)
            startActivity(intent)
        }
        ib3.setOnClickListener {
            val intent = Intent(this, RatingFromReviewViewModel::class.java)
            var bundle = Bundle()
            bundle.putString("MovieID", "mylittlepony")
            reviewRepository.get_value("mylittlepony")?.let { it1 -> bundle.putFloat("Stars", it1) }
            intent.putExtras(bundle)
            startActivity(intent)
        }
        menu_imageview.setOnClickListener{
            val intent = Intent(this, MenuViewModel::class.java)
            startActivity(intent)
        }
    }
}