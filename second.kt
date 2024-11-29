package com.example.yen

import android.os.Bundle



// import android.widget.ActionMenuView
// import android.content.Intent
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.xsecond)


        val myButton = findViewById<Button>(R.id.myButton)



        myButton.setOnClickListener {
            Toast.makeText(this, "uygulamanın sonu", Toast.LENGTH_SHORT).show()

        }

    }
}