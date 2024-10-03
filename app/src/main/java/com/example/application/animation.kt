package com.example.application

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.R.layout.activity_animation
import com.example.application.databinding.ActivityAnimationBinding

class animation : AppCompatActivity() {
    lateinit var binding: ActivityAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnalpha.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
            binding.star.startAnimation(animation)


        }
        binding.btntranslate.setOnClickListener {


            val animation = AnimationUtils.loadAnimation(this, R.anim.translate)
            binding.star.startAnimation(animation)
        }
        binding.btnscale.setOnClickListener {


            val animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            binding.star.startAnimation(animation)
        }
        binding.btnrotate.setOnClickListener {


            val animation=AnimationUtils.loadAnimation(this,R.anim.rotate)
            binding.star.startAnimation(animation)
    }
        binding.btnset.setOnClickListener {


            val animation=AnimationUtils.loadAnimation(this,R.anim.set)
            binding.star.startAnimation(animation)
}}}