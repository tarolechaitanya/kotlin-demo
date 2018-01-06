package com.iss247.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate called")
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.txtView)
        textView.setText("Hello Sumit Tarole !!!")

        button = findViewById(R.id.btn)
        button.setOnClickListener {
            showToast()
        }

    }

    private fun showToast() {
        Toast.makeText(this, "You clicked me bro !!!", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy called")
    }
}
