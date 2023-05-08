package com.example.movienet
import android.content.Context
import android.content.Intent
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

//class ItemAdapter(
//    private val context: Context,
//    private val dataset: List<Affirmation>
//): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
//
//    // Provide a reference to the views for each data item
//    // Complex data items may need more than one view per item, and
//    // you provide access to all the views for a data item in a view holder.
//    // Each data item is just an Affirmation object.
//    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
//        val textView: TextView = view.findViewById(R.id.item_title1)
//        val imageView: ImageView = view.findViewById(R.id.item_image1)
//    }
//
//    /**
//     * Create new views (invoked by the layout manager)
//     */
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        // create a new view
//        val adapterLayout = LayoutInflater.from(parent.context)
//            .inflate(R.layout.list_item, parent, false)
//
//        return ItemViewHolder(adapterLayout)
//    }
//
//    /**
//     * Replace the contents of a view (invoked by the layout manager)
//     */
//    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        val item = dataset[position]
//        holder.textView.text = context.resources.getString(item.stringResourceId)
//        holder.imageView.setImageResource(item.imageResourceId)
//    }
//
//    /**
//     * Return the size of your dataset (invoked by the layout manager)
//     */
//    override fun getItemCount() = dataset.size
//}
//class Datasource() {
//
//    fun loadAffirmations(): List<Affirmation> {
//        return listOf<Affirmation>(
//            Affirmation(R.string.affirmation1, R.drawable.placehorder),
//            Affirmation(R.string.affirmation2, R.drawable.placehorder),
//            Affirmation(R.string.affirmation3, R.drawable.placehorder),
//            Affirmation(R.string.affirmation4, R.drawable.placehorder),
//            Affirmation(R.string.affirmation5, R.drawable.placehorder),
//            Affirmation(R.string.affirmation6, R.drawable.placehorder),
//            Affirmation(R.string.affirmation7, R.drawable.placehorder),
//            Affirmation(R.string.affirmation8, R.drawable.placehorder),
//            Affirmation(R.string.affirmation9, R.drawable.placehorder),
//            Affirmation(R.string.affirmation10, R.drawable.placehorder))
//    }
//}
//
//data class Affirmation(
//    @StringRes val stringResourceId: Int,
//    @DrawableRes val imageResourceId: Int
//)

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

        var films_textview:TextView=findViewById(R.id.FilmListID);
        var explore_textview:TextView=findViewById(R.id.ExploreID);
        var mylist_textview:TextView=findViewById(R.id.MYListID);

        films_textview.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        explore_textview.setOnClickListener {
            val intent = Intent(this, ExploreViewModel::class.java)
            startActivity(intent)
        }
        mylist_textview.setOnClickListener {
            val intent = Intent(this, MyListViewModel::class.java)
            startActivity(intent)
        }

        ib1.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib2.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib3.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib4.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib5.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib6.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib7.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib8.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }
        ib9.setOnClickListener{
//            val intent = Intent(this, GyroscopeViewModel::class.java)
//            startActivity(intent)
        }




//        // Initialize data.
//        val myDataset = Datasource().loadAffirmations()
//
//        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//        recyclerView.adapter = ItemAdapter(this, myDataset)
//
//        // Use this setting to improve performance if you know that changes
//        // in content do not change the layout size of the RecyclerView
//        recyclerView.setHasFixedSize(true)
    }
}