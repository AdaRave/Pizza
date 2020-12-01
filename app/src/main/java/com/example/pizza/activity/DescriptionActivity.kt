package com.example.pizza.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pizza.R
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.activity_description.view.*

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        val date = intent.extras
        if (date != null) {
            imagePizza.setImageResource(date.get("image").toString().toInt())
            textTitle.text = date.get("title").toString()
            textDescription.text = date.get("description").toString()
            textCost.text = date.get("cost").toString()
        }

    }
}