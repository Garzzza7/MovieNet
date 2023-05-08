package com.example.movienet
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.Image
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  ib1:ImageButton = findViewById(R.id.imageButton1);
        var  ib2:ImageButton = findViewById(R.id.imageButton2);
        var  ib3:ImageButton = findViewById(R.id.imageButton3);
        var  ib4:ImageButton = findViewById(R.id.imageButton4);
        var  ib5:ImageButton = findViewById(R.id.imageButton5);
        var  ib6:ImageButton = findViewById(R.id.imageButton6);
        var  ib7:ImageButton = findViewById(R.id.imageButton7);
        var  ib8:ImageButton = findViewById(R.id.imageButton8);
        var  ib9:ImageButton = findViewById(R.id.imageButton9);

        ib1.setImageResource(R.drawable.beyblade_metal_fury)
        ib2.setImageResource(R.drawable.beyblade_metal_fusion)
        ib3.setImageResource(R.drawable.beyblade_metal_masters)
        ib4.setImageResource(R.drawable.cyberpunk_edging)
        ib5.setImageResource(R.drawable.bleach)
        ib6.setImageResource(R.drawable.evangelion)
        ib7.setImageResource(R.drawable.guilty_crown)
        ib8.setImageResource(R.drawable.kiznaiver)
        ib9.setImageResource(R.drawable.naruto)

        var explore_textview:TextView=findViewById(R.id.ExploreID);
        var mylist_textview:TextView=findViewById(R.id.MYListID);

        explore_textview.setOnClickListener {
            val intent = Intent(this, ExploreViewModel::class.java)
            startActivity(intent)
        }
        mylist_textview.setOnClickListener {
            val intent = Intent(this, MyListViewModel::class.java)
            startActivity(intent)
        }

        ib1.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","BMF")
            startActivity(intent)
        }
        ib2.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","BMM")
            startActivity(intent)
        }
        ib3.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","BMFU")
            startActivity(intent)
        }
        ib4.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","CP")
            startActivity(intent)
        }
        ib5.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","BL")
            startActivity(intent)
        }
        ib6.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","EVA")
            startActivity(intent)
        }
        ib7.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","GC")
            startActivity(intent)
        }
        ib8.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","KIZ")
            startActivity(intent)
        }
        ib9.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","NAR")
            startActivity(intent)
        }
    }
}