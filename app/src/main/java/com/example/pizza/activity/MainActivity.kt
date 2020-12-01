package com.example.pizza.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pizza.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(view: View) {
        /*if(editTextTextPersonName.text.toString().equals("") || editTextPhone.text.toString().equals("") ||
            editTextTextPersonAddress.text.toString().equals("")) Toast.makeText(this,"Не все данные введены", Toast.LENGTH_LONG).show()
        else {*/
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)
        //}
    }
}