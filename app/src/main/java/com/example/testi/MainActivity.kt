package com.example.testi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageButton_ice1 = findViewById<ImageButton>(R.id.imageButton_ice1)
        val imageButton_ice4 = findViewById<ImageButton>(R.id.imageButton_ice4)
        val imageButton_ice3 = findViewById<ImageButton>(R.id.imageButton_ice3)
        val imageButton_rzw = findViewById<ImageButton>(R.id.imageButton_rzw)

        imageButton_ice4.setOnClickListener {

            val intent = Intent(this, ActivityIce4::class.java)
            startActivity(intent)
        }
        imageButton_ice3.setOnClickListener {

            val intent = Intent(this, ActivityIce3::class.java)
            startActivity(intent)
        }
        imageButton_ice1.setOnClickListener {

            val intent = Intent(this, ActivityIce1::class.java)
            startActivity(intent)
        }
        imageButton_rzw.setOnClickListener {

            val intent = Intent(this, ActivityIcity::class.java)
            startActivity(intent)
        }



        }



}
