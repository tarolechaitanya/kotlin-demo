package com.iss247.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate called")
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.txtView)
        textView.setText("Hello Sumit Tarole !!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy called")
    }
}
