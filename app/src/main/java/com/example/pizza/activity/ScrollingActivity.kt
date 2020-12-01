package com.example.pizza.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pizza.R
import com.example.pizza.adapter.RecyclerViewAdapter
import com.example.pizza.model.PizzaItem
import kotlinx.android.synthetic.main.content_scrolling.*

class ScrollingActivity : AppCompatActivity(), RecyclerViewAdapter.OnItemClickedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Свяжитесь с нами", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val pizzaList = listOf(
            PizzaItem(R.drawable.super_pizza, "Supper Pizza", 250,resources.getString( R.string.supperPizza)),
            PizzaItem(R.drawable.cheese, "10 Сыров", 250, resources.getString(R.string.cheese)),
            PizzaItem(R.drawable.italian, "Итальянская с моцареллой и пепперони", 250, resources.getString(R.string.italian)),
            PizzaItem(R.drawable.pork_in_sweet_and_sour, "Свинина в кисло-сладком соусе", 250, resources.getString(R.string.pork)),
            PizzaItem(R.drawable.barbecue_chicken, "Цыпленок Барбекю", 250, resources.getString(R.string.barbecue_chicken)),
            PizzaItem(R.drawable.pepperoni, "Пепперони", 250, resources.getString(R.string.pepperoni)),
            PizzaItem(R.drawable.margarita, "Маргарита", 250, resources.getString(R.string.margarita))
        )
        val adapter = RecyclerViewAdapter(pizzaList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter



    }

    override fun onItemClicked(item: PizzaItem, position: Int) {
        intent = Intent(this, DescriptionActivity::class.java)
        intent.putExtra("title", item.titlePizza )
        intent.putExtra("description", item.descriptionPizza)
        intent.putExtra("image", item.imagePizza)
        intent.putExtra("cost", item.costPizza)
        startActivity(intent)
    }
}