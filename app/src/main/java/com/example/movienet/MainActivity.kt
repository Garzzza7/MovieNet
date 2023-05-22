package com.example.movienet
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

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

        ib1.setImageResource(R.drawable.guardians)
        ib2.setImageResource(R.drawable.john)
        ib3.setImageResource(R.drawable.barbie)
        ib4.setImageResource(R.drawable.mario)
        ib5.setImageResource(R.drawable.fastx)
        ib6.setImageResource(R.drawable.asterix)
        ib7.setImageResource(R.drawable.spiderman)
        ib8.setImageResource(R.drawable.scream)
        ib9.setImageResource(R.drawable.syrenka)

        var explore_textview:TextView=findViewById(R.id.ExploreID);
        var mylist_textview:TextView=findViewById(R.id.MYListID);
        var menu_imageview:ImageView=findViewById(R.id.MenuID);

        var films_indicator:TextView=findViewById(R.id.films_indicator);
        var explore_indicator:TextView=findViewById(R.id.explore_indicator);
        var mylist_indicator:TextView=findViewById(R.id.mylist_indicator);

        films_indicator.setBackgroundColor(getColor(R.color.white));
        explore_indicator.setBackgroundColor(getColor(R.color.red));
        mylist_indicator.setBackgroundColor(getColor(R.color.red));

        explore_textview.setOnClickListener {
            val intent = Intent(this, ExploreViewModel::class.java)

            startActivity(intent)
        }
        mylist_textview.setOnClickListener {
            val intent = Intent(this, MyListViewModel::class.java)
            startActivity(intent)
        }

        menu_imageview.setOnClickListener{
            val intent = Intent(this, MenuViewModel::class.java)
            startActivity(intent)
        }

        ib1.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","guardians")
            startActivity(intent)
        }
        ib2.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","john")
            startActivity(intent)
        }
        ib3.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","barbie")
            startActivity(intent)
        }
        ib4.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","mario")
            startActivity(intent)
        }
        ib5.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","fastx")
            startActivity(intent)
        }
        ib6.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","asterix")
            startActivity(intent)
        }
        ib7.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","spiderman")
            startActivity(intent)
        }
        ib8.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","scream")
            startActivity(intent)
        }
        ib9.setOnClickListener{
            val intent = Intent(this, ItemViewModel::class.java)
            intent.putExtra("ID","syrenka")
            startActivity(intent)
        }
    }
}