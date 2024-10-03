package com.example.application

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.application.databinding.GaleryBinding

class galleryadapter(context: Context, val images: ArrayList<Int>) :
    ArrayAdapter<Int>(context, R.layout.galery, images) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding:GaleryBinding

        if(convertView==null){


            binding=GaleryBinding.inflate(LayoutInflater.from(context),parent,false)
        } else{


            binding=GaleryBinding.bind(convertView)
        }
        binding.imagewiev.setImageResource(images[position])
        return binding.root
    }
}