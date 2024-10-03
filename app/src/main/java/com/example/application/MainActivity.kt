package com.example.application

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityMainBinding

class MainActivity:AppCompatActivity()    {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = resources.getString(R.string.contextmenu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.search-> Toast.makeText(baseContext, "Search Clicked", Toast.LENGTH_SHORT).show()
            R.id.item1-> Toast.makeText(baseContext, "Item1 Clicked", Toast.LENGTH_SHORT).show()
            R.id.item2-> Toast.makeText(baseContext, "Item2 Clicked", Toast.LENGTH_SHORT).show()
            R.id.share->{
                val intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type= "text/plain"
                }
                intent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.tencent.ig")
                startActivity(intent)
            }
            R.id.contaxtas->{
                val intent = Intent().apply {
                    action = Intent.ACTION_VIEW
                    data= Uri.parse("mailto:mirjalolnacibkhanov81@gmail.com")
                }
                startActivity(intent)
            }
            R.id.about->{
                val intent=Intent(baseContext,About::class.java)
                startActivity(intent)
            }
            R.id.settings->{
                val intent=Intent(baseContext,Settings::class.java)
                startActivity(intent)
            }
        }
        return true
    }
}



