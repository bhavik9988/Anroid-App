package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random


class MainActivity : AppCompatActivity() {
    val foodlist = arrayListOf("Chinese", "Italian", "North-Indian", "South-Indian")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decidebtn.setOnClickListener {
            val random = Random()
            val randomfood = random.nextInt(foodlist.count())
            selectedFoodTxt.text = foodlist[randomfood]

        }
        addfoodbtn.setOnClickListener {
            val newfood = addtext.text.toString()
            foodlist.add(newfood)
            addtext.text.clear()
            println(foodlist)
        }









    }
}
