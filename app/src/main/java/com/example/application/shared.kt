package com.example.application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityIntentBinding
import com.example.application.databinding.ActivitySharedBinding

class shared : AppCompatActivity() {
    private var counter=0
    private lateinit var binding: ActivitySharedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding=ActivitySharedBinding.inflate(layoutInflater)
        val sharedPreferences=getPreferences(MODE_PRIVATE)
        counter=sharedPreferences.getInt("counter",0)
        setContentView(binding.root)
        binding.textcounter.text= counter.toString()
        binding.btnincermat.setOnClickListener {

            counter++
            binding.textcounter.text=counter.toString()
            sharedPreferences.edit().putInt("counter",counter).apply()
        }
        binding.btnclear.setOnClickListener {

            counter=0
            binding.textcounter.text=counter.toString()
            sharedPreferences.edit().putInt("counter",counter).apply()
        }
    }
    }
