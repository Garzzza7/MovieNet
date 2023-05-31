package com.example.movienet

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MyListViewModel: AppCompatActivity() {

    var repository = MovieDao()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mylist_layout)

        var ib1: ImageButton = findViewById(R.id.imageButton1);
        var ib2: ImageButton = findViewById(R.id.imageButton2);
        var ib3: ImageButton = findViewById(R.id.imageButton3);
        var new_image: ImageButton = findViewById(R.id.new_Image);
        ib1.setImageResource(R.drawable.geas)
        ib2.setImageResource(R.drawable.jojo)
        ib3.setImageResource(R.drawable.jojovento)

        var films_indicator:TextView=findViewById(R.id.films_indicator);
        var explore_indicator:TextView=findViewById(R.id.explore_indicator);
        var mylist_indicator:TextView=findViewById(R.id.mylist_indicator);

        films_indicator.setBackgroundColor(getColor(R.color.red));
        explore_indicator.setBackgroundColor(getColor(R.color.red));
        mylist_indicator.setBackgroundColor(getColor(R.color.white));

        var films_textview: TextView = findViewById(R.id.FilmListID);
        var explore_textview: TextView = findViewById(R.id.ExploreID);
        var menu_imageview: ImageView =findViewById(R.id.MenuID);

        var drawer_layout: DrawerLayout = findViewById(R.id.mylist_drawer);
        var navigation_view: NavigationView = findViewById(R.id.nav_view);

        films_textview.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        explore_textview.setOnClickListener {
            val intent = Intent(this, ExploreViewModel::class.java)
            startActivity(intent)
        }
        /*menu_imageview.setOnClickListener{
            val intent = Intent(this, MenuViewModel::class.java)
            startActivity(intent)
        }*/

        // Set a click listener for the MenuID button
        menu_imageview.setOnClickListener {
            // Open the drawer (show the NavigationView)
            drawer_layout.openDrawer(navigation_view)
        }


        var i: Intent = intent
        var b: Bundle? = intent.extras
        var anime_name = b?.getString("Anime_Name")
        if(anime_name=="guardians"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.guardians)

        }
        else if(anime_name=="john"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.john)

        }
        else if(anime_name=="barbie"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.barbie)

        }
        else if(anime_name=="mario"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.mario)

        }
        else if(anime_name=="fastx"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.fastx)

        }
        else if(anime_name=="asterix"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.asterix)

        }
        else if(anime_name=="spiderman"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.spiderman)

        }
        else if(anime_name=="scream"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.scream)

        }
        else if(anime_name=="syrenka"){
            var im: ImageView = findViewById(R.id.new_Image)
            im.setImageResource(R.drawable.syrenka)

        }


        var intent: Intent = getIntent()
        var bundle: Bundle? = intent.extras
        var profileName = bundle?.getString("Key")
        var profileScore = bundle?.getFloat("Rating")
        if (profileName != null) {
            if (profileScore != null) {
                repository.update(profileName, profileScore)
            }
        }

        ib1.setOnClickListener {
            val intent = Intent(this, RatingViewModel::class.java)
            var bundle = Bundle()
            bundle.putString("MovieID", "geas")
            repository.get_value("geas")?.let { it1 -> bundle.putFloat("Stars", it1) }
            intent.putExtras(bundle)
            startActivity(intent)
        }
        ib2.setOnClickListener {
            val intent = Intent(this, RatingViewModel::class.java)
            var bundle = Bundle()
            bundle.putString("MovieID", "jojo1")
            repository.get_value("jojo1")?.let { it1 -> bundle.putFloat("Stars", it1) }
            intent.putExtras(bundle)
            startActivity(intent)
        }
        ib3.setOnClickListener {
            val intent = Intent(this, RatingViewModel::class.java)
            var bundle = Bundle()
            bundle.putString("MovieID", "jojo5")
            repository.get_value("jojo5")?.let { it1 -> bundle.putFloat("Stars", it1) }
            intent.putExtras(bundle)
            startActivity(intent)
        }
        new_image.setOnClickListener{
            val intent = Intent(this, RatingViewModel::class.java)
            intent.putExtra("Anime_Name", anime_name)
            startActivity(intent)
        }
    }

}