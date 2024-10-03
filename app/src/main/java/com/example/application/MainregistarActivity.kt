package com.example.application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.application.databinding.ActivityLoginBinding
import com.example.application.databinding.ActivityRegistarBinding
import com.example.application.databinding.MainregisterBinding

class MainregistarActivity : AppCompatActivity() {
    lateinit var binding: MainregisterBinding

    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=MainregisterBinding.inflate(layoutInflater)
        val dataStorage = datastorage()
        if (dataStorage.readToSharedPreferences(baseContext, dataStorage.LOGIN_KEY).isEmpty()) {
            startActivity(Intent(this, login::class.java))
            finish()

        }
        setContentView(binding.root)
        binding.MainregFullname.text = getString(
                R.string.fullname,
                dataStorage.readToSharedPreferences(baseContext, dataStorage.FULL_NAME_KEY)
            )
        binding.mainregUsername.text =
            dataStorage.readToSharedPreferences(baseContext, dataStorage.USERNAME_KEY)
        binding.mainregpassword.text =
            dataStorage.readToSharedPreferences(baseContext, dataStorage.PASSWORD_KEY)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.logout) {

            val dataStorage = datastorage()
            dataStorage.saveToSharedPreferences(baseContext, dataStorage.FULL_NAME_KEY, "")
            dataStorage.saveToSharedPreferences(baseContext, dataStorage.USERNAME_KEY, "")
            dataStorage.saveToSharedPreferences(baseContext, dataStorage.PASSWORD_KEY, "")
            startActivity(Intent(this, login::class.java))

        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.logout, menu)
        return true
    }
}