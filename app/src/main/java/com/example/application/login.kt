package com.example.application

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityAnimationBinding
import com.example.application.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.lgnregister.setOnClickListener {

            startActivity(Intent(this, Registar::class.java))


            finish()
        }

        val datastorage = datastorage()
        binding.loginbtnok.setOnClickListener {

            if (binding.loginusername.text.toString().isNotEmpty() &&
                binding.loginpassword.text.toString().isNotEmpty()
            ) {


                val sharedUser =
                    datastorage.readToSharedPreferences(baseContext, datastorage.USERNAME_KEY)
                val sharedpassword =
                    datastorage.readToSharedPreferences(baseContext, datastorage.PASSWORD_KEY)
                if (sharedUser.lowercase() == binding.loginusername.text.toString().lowercase() &&
                    sharedpassword.lowercase() == binding.loginpassword.text.toString()
                ) {
                    datastorage.saveToSharedPreferences(baseContext, datastorage.LOGIN_KEY, "YES")
                    startActivity(Intent(this, Registar::class.java))
                    finish()

                } else {
                    Toast.makeText(this, "Login and Password error", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}




