package com.example.application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.application.databinding.ActivityViewPagerBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var binding:ActivityViewPagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding=ActivityViewPagerBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val viewpager=binding.viewpager2
        val tabLayout=binding.tablayout
        val adapter=ViewpagerCustom(this)
        viewpager.adapter=adapter

        TabLayoutMediator(tabLayout,viewpager){

            tab,position->
            when (position){

                0->{

                    tab.text="Home"
                    tab.icon=getDrawable(R.drawable.baseline_home_24)
                }
                1-> {

                    tab.text="Profile"
                    tab.icon=getDrawable(R.drawable.profile)

                }
                2->{

                    tab.text="Settings"
                    tab.icon=getDrawable(R.drawable.baseline_settings_applications_24)
                }
            }
        } .attach()

    }}