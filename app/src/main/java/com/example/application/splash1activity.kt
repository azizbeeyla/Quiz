package com.example.application

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class splash1activity : AppCompatActivity() {


    private val time: Long = 3000


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Handler().postDelayed(
            {
                val intent = Intent(
                    this, futbol::class.java
                ).apply {
                    startActivity(this)
                }
            }, time
        )
        setContentView(R.layout.activity_splash1activity)
    }
}
