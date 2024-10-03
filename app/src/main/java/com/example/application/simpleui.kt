package com.example.application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.SimpleuiBinding

class simpleui : AppCompatActivity() {
    lateinit var binding:SimpleuiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SimpleuiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ok.setOnClickListener{

            var gender="Gender:"
            var hobbies="hobbies:"
            if (binding.male.isChecked) gender=gender.plus("Male")
            if (binding.female.isChecked) gender=gender.plus("Female")
            binding.gender.text=gender

            if (binding.chekfutbol.isChecked) hobbies=hobbies.plus(binding.chekfutbol.text).plus(", ")
            if (binding.chektenis.isChecked) hobbies=hobbies.plus(binding.chektenis.text).plus(", ")
            if (binding.chekcomputer.isChecked) hobbies=hobbies.plus(binding.chekcomputer.text).plus(", ")
            if (binding.chekpubg.isChecked) hobbies=hobbies.plus(binding.chekpubg.text).plus(", ")
            if (binding.chekswim.isChecked) hobbies=hobbies.plus(binding.chekswim.text).plus(", ")

            if (hobbies[hobbies.lastIndex-1]==',')hobbies=hobbies.substring(0,hobbies.lastIndex-1).plus(".")
  binding.hobbiy.text=hobbies
        }
    }
}