package com.example.application

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivitySecondBinding

class second : AppCompatActivity() {

        private lateinit var binding: ActivitySecondBinding

        @SuppressLint("SetTextI18n")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)


            binding=ActivitySecondBinding.inflate(layoutInflater)
            setContentView(binding.root)

            val name=intent.getStringExtra("name")
            val email=intent.getStringExtra("email")

            binding.textname.text="Name:${name.toString()}"
            binding.textemail.text="Email:${email.toString()}"

        }}