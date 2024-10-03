package com.example.application

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityMalumotBinding
import com.example.application.databinding.ActivitySpinnerBinding

class Spinner : AppCompatActivity() {

    private lateinit var binding: ActivitySpinnerBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   binding=ActivitySpinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.namedata.text="Name:${intent.getStringExtra("name")}"
        binding.genderdata.text="Gender:${intent.getStringExtra("gender")}"
        binding.countrydata.text="Country:${intent.getStringExtra("country")}"
        binding.datadata.text="Data:${intent.getStringExtra("Data")}"


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId==android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}