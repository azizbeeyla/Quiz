package com.example.application

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityFruitsBinding
import com.example.application.databinding.ActivityFruitsactivityBinding

class fruitsactivity : AppCompatActivity() {
    private val fruits= arrayListOf("Olma","Gilos","Nok","Banan","Uzum")
    private lateinit var binding:ActivityFruitsactivityBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding=ActivityFruitsactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val position=intent.getIntExtra("position",0)
        supportActionBar?.title=fruits[position]
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        when(position){

            0->{
                binding.imgfruit1.setImageResource(R.drawable.olma)
                binding.textviewdata.text="Olma"
            }
            1->{
                binding.imgfruit1.setImageResource(R.drawable.gilos)
                binding.textviewdata.text="Gilos"
            }
            2->{
                binding.imgfruit1.setImageResource(R.drawable.nok)
                binding.textviewdata.text="Nok"
            }
            3->{
                binding.imgfruit1.setImageResource(R.drawable.banan)
                binding.textviewdata.text="Banan"

            }
            4->{
                binding.imgfruit1.setImageResource(R.drawable.uzum)
                binding.textviewdata.text=resources.getString(R.string.uzum)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
}