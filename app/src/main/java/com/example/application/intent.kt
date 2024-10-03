package com.example.application

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.application.databinding.ActivityIntentBinding
import com.example.application.databinding.ActivitySecondBinding

class intent : AppCompatActivity() {
    private lateinit var binding: ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.summitbtn.setOnClickListener {

            val name = binding.editname.text.toString()
            val email = binding.editemail.text.toString()
        val intent = Intent(this, second::class.java).apply {
            this.putExtra("name", name)
            this.putExtra("email", email)
            startActivity(this)
}
        }
    }
}
