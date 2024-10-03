package com.example.application

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class About: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)

        supportActionBar?.title=resources.getString(R.string.about1)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        if (item.itemId==android.R.id.home)
            super.onBackPressed()
        return true

    }
}
