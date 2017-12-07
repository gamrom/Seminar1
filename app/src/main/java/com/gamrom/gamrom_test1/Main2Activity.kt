package com.gamrom.gamrom_test1

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView

class Main2Activity : AppCompatActivity() {

    var getImage : ImageView? = null
    var secondString : String? = null

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        getImage = findViewById(R.id.showImage) as ImageView
        secondString = getIntent().getStringExtra("firstData" )
        when(secondString){
            "1" -> {
                getImage?.setImageResource(R.drawable.sample1)

            }

            "2" -> {
                getImage?.setImageResource(R.drawable.sample2)

            }
            "3" -> {
                getImage?.setImageResource(R.drawable.sample3)

            }
            else -> {
                getImage?.setImageResource(R.drawable.basicsample)

            }
        }






    }
}
