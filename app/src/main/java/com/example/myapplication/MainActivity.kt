package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_signin).setOnClickListener{btn_signin() }

    }



    private fun btn_signin() {


        val intent = Intent (this, MainActivity2::class.java )
        startActivity(intent)
    }
}
