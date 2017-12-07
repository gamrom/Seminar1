package com.gamrom.gamrom_test1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    var getText : TextView? = null
    var secondString : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        secondString = getIntent().getStringExtra("firstData" )

        getText = findViewById(R.id.main_get_text) as TextView
        getText!!.text = secondString
    }
}
