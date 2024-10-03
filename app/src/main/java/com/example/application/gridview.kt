package com.example.application

import android.content.Intent
import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityGridviewBinding

class gridview : AppCompatActivity() {
    private lateinit var binding: ActivityGridviewBinding
    val imagelist = arrayListOf<Int>(
        R.drawable.olma,
        R.drawable.gilos,
        R.drawable.nok,
        R.drawable.banan,
        R.drawable.uzum,
        R.drawable.olma,
        R.drawable.gilos,
        R.drawable.nok,
        R.drawable.banan,
        R.drawable.uzum

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val galleryAdapter = galleryadapter(this, imagelist)
        binding.gridview.adapter = galleryAdapter
        binding.gridview.setOnItemClickListener() { parent,view,position,id->

            Intent (this,gridimage::class.java).apply {
                putExtra("position",position)
                startActivity(this)
            }
        }
    }
}