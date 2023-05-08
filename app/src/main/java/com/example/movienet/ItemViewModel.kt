package com.example.movienet

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ItemViewModel : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_layout)
        val profileName = intent.getStringExtra("ID")
        var back_button:ImageView = findViewById(R.id.back_button)

        if(profileName=="BMF"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_fusion)
        }
        else if(profileName=="BMM"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_masters)
        }
        else if(profileName=="BMFU"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.beyblade_metal_fury)
        }
        else if(profileName=="CP"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.cyberpunk_edging)
        }
        else if(profileName=="BL"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.bleach)
        }
        else if(profileName=="EVA"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.evangelion)
        }
        else if(profileName=="GC"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.guilty_crown)
        }
        else if(profileName=="KIZ"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.kiznaiver)
        }
        else if(profileName=="NAR"){
            var im: ImageView = findViewById(R.id.movie_image)
            im.setImageResource(R.drawable.naruto)
        }
        back_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}