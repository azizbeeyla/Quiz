package com.example.application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityFruitsBinding
import com.example.application.databinding.ActivityListactivityBinding
import com.example.application.databinding.MainregisterBinding

class listactivity : AppCompatActivity() {
    private lateinit var binding: ActivityListactivityBinding
    private val fruits = arrayListOf<Fruitmode>(

        Fruitmode("Olma",R.drawable.olma),
        Fruitmode("Gilos",R.drawable.gilos),
        Fruitmode("Nok",R.drawable.nok),
        Fruitmode("Banan",R.drawable.banan),
        Fruitmode("Uzum",R.drawable.uzum)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = Customadapter(this,fruits )
        binding.listview.adapter = adapter


        binding.listview.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "${fruits[position]}bosildi", Toast.LENGTH_SHORT).show()

            Intent(this, fruitsactivity::class.java).apply {
                this.putExtra("position", position)
                startActivity(this)
            }

        }
    }
}