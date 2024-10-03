package com.example.application

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityGridimageBinding

class gridimage : AppCompatActivity() {
    private lateinit var binding: ActivityGridimageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridimageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val position = intent.getIntExtra("position", R.drawable.olma)
        when (position) {


            0 -> binding.imagegrid.setImageResource(R.drawable.olma)
            1 -> binding.imagegrid.setImageResource(R.drawable.gilos)
            2 -> binding.imagegrid.setImageResource(R.drawable.nok)
            3 -> binding.imagegrid.setImageResource(R.drawable.banan)
            4 -> binding.imagegrid.setImageResource(R.drawable.uzum)
            5 -> binding.imagegrid.setImageResource(R.drawable.olma)
            6 -> binding.imagegrid.setImageResource(R.drawable.gilos)
            7 -> binding.imagegrid.setImageResource(R.drawable.nok)
            8 -> binding.imagegrid.setImageResource(R.drawable.banan)
            9 -> binding.imagegrid.setImageResource(R.drawable.uzum)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()

        return super.onOptionsItemSelected(item)
    }
}