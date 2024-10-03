package com.example.application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityRegistarBinding

class Registar : AppCompatActivity() {


    private lateinit var binding: ActivityRegistarBinding

    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistarBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.linktologin.setOnClickListener {
    startActivity(Intent(this,login::class.java))
            finish()
        }

        binding.regokbtn.setOnClickListener {

            val fullname = binding.regfullname.text.toString()
            val username = binding.Regusername.text.toString()
            val password = binding.regpassword.text.toString()
            val confirmpassword = binding.regconfirmpassword.text.toString()


            if (fullname.isNotEmpty() && username.isNotEmpty() && password.isNotEmpty() && confirmpassword.isNotEmpty()) {

                if (password == confirmpassword) {
                    val datastorage = datastorage()
                    datastorage.saveToSharedPreferences(
                        baseContext,
                        datastorage.FULL_NAME_KEY,
                        fullname
                    )


                    datastorage.saveToSharedPreferences(
                        baseContext,
                        datastorage.USERNAME_KEY,
                        username
                    )


                    datastorage.saveToSharedPreferences(
                        baseContext,
                        datastorage.PASSWORD_KEY,
                        password
                    )
                    Toast.makeText(this, "Succesfull confirm", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainregistarActivity::class.java))
                    finish()
                } else {

                    Toast.makeText(this, "Confirm in Correct", Toast.LENGTH_SHORT).show()
                }
            } else {

                Toast.makeText(this, "Complate the space", Toast.LENGTH_SHORT).show()

            }
        }
        }

    }
