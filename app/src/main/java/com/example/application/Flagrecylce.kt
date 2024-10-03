package com.example.application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.application.databinding.ActivityFlagrecylceBinding
import com.example.application.databinding.FlagitemBinding

class Flagrecylce : AppCompatActivity() {
    private lateinit var binding: ActivityFlagrecylceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFlagrecylceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list= listOf<Flagmodel>(

Flagmodel(R.drawable.uzb,"Uzbekistan",37),
Flagmodel(R.drawable.qozoq,"Qozog'iston",20),
Flagmodel(R.drawable.qirgiz,"Qirg'isiton",8),
Flagmodel(R.drawable.amerika,"Amerika",200),
Flagmodel(R.drawable.tokik,"Tojikiston",14),
Flagmodel(R.drawable.angliya,"Angliya",60)


        )
        val myAdapter=CustomFlagAdapter(list)
        val myManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyleflag.apply {
            adapter=myAdapter
            layoutManager=myManager
        }

    }
}