package com.gamrom.gamrom_test1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var nextButton : Button? = null
    var firstEdit : EditText? = null
    var inputData : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.main_next_button) as Button
        firstEdit = findViewById(R.id.main_first) as EditText

        nextButton!!.setOnClickListener {
            inputData = firstEdit!!.text.toString()

            val intent = Intent(applicationContext, Main2Activity::class.java)
            intent.putExtra("firstData", inputData)

            startActivity(intent)
        }


    }
}
