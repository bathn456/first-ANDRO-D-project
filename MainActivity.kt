package com.example.yen

import android.os.Bundle




import android.content.Intent
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myButton = findViewById<Button>(R.id.myButton)


        myButton.setOnClickListener {
            Toast.makeText(this, "başlıyor", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, secondActivity::class.java)
            startActivity(intent)
        }

    }
}
