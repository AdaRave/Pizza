package com.example.pizza.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pizza.R
import com.example.pizza.model.PizzaItem

class RecyclerViewAdapter (var items: List<PizzaItem>,
                           var clickListener: OnItemClickedListener)
    : RecyclerView.Adapter<RecyclerViewAdapter.PizzaViewHolder>() {

    inner class PizzaViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        private val image = itemView.findViewById<ImageView>(R.id.imagePizza)
        private val title = itemView.findViewById<TextView>(R.id.textViewTitle)
        private val cost = itemView.findViewById<TextView>(R.id.textViewCost)

        fun bind(item :PizzaItem, action: OnItemClickedListener){
            title.text = item.titlePizza
            cost.text = item.costPizza.toString()
            image.setImageResource(item.imagePizza)

            itemView.setOnClickListener { action.onItemClicked(item, adapterPosition) }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder =
       PizzaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent,false))


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        holder.bind(items[position], clickListener)
    }

    interface OnItemClickedListener{
        fun onItemClicked(item: PizzaItem, position: Int)
    }


}