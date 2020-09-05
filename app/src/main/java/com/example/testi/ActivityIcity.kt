package com.example.testi

import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class ActivityIcity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rzw)


        val buttonrzw = findViewById<Button>(R.id.buttonrzw)
        buttonrzw.setOnClickListener {
            // get our html content

            // get our html content
            //val htmlAsString = getString(R.string.html) // used by WebView

            //val htmlAsSpanned = Html.fromHtml(htmlAsString) // used by TextView


            // set the html content on a TextView

            // set the html content on a TextView
            //val textView = findViewById<View>(R.id.textView) as TextView
            //textView.text = htmlAsSpanned

            // Html Webview
            //val webView = findViewById<View>(R.id.webView) as WebView
            //webView.loadDataWithBaseURL(null, htmlAsString, "text/html", "utf-8", null)

        }
        val buttonrzw2 = findViewById<Button>(R.id.buttonrzw2)
        buttonrzw2.setOnClickListener {


        }
        val buttonrzw3 = findViewById<Button>(R.id.buttonrzw3)
        buttonrzw3.setOnClickListener {


        }
        val buttonrzw4 = findViewById<Button>(R.id.buttonrzw4)
        buttonrzw4.setOnClickListener {


        }
        val buttonrzw5 = findViewById<Button>(R.id.buttonrzw5)
        buttonrzw5.setOnClickListener {


        }
        val buttonrzw6 = findViewById<Button>(R.id.buttonrzw6)
        buttonrzw6.setOnClickListener {


        }
        val buttonrzw7 = findViewById<Button>(R.id.buttonrzw7)
        buttonrzw7.setOnClickListener {


        }
        val buttonrzw8 = findViewById<Button>(R.id.buttonrzw8)
        buttonrzw8.setOnClickListener {
            
        }
    }
}