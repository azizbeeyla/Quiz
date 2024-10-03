package com.example.application

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.application.databinding.ActivityFruitsBinding

class Fruits : AppCompatActivity() {
    private val fruits = arrayListOf("Olma", "Gilos", "Nok", "Banan", "Uzum")
    private lateinit var binding: ActivityFruitsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val position = intent.getIntExtra("position", 0)

        supportActionBar?.title = fruits[position]
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        when (position) {
            0 -> binding.imgfruit.setImageResource(R.drawable.olma)
            1 -> binding.imgfruit.setImageResource(R.drawable.gilos)
            2 -> binding.imgfruit.setImageResource(R.drawable.nok)
            3 -> binding.imgfruit.setImageResource(R.drawable.banan)
            4 -> binding.imgfruit.setImageResource(R.drawable.uzum)

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}