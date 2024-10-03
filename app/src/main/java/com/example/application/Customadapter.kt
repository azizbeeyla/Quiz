package com.example.application

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.application.databinding.CustomerBinding

class Customadapter(context: Context,val fruitslist:ArrayList<Fruitmode>)
    :ArrayAdapter<Fruitmode>(context,R.layout.customer,fruitslist){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: CustomerBinding

        if (convertView==null){

            binding=CustomerBinding.inflate(LayoutInflater.from(context),parent,false)



        }else{
            binding=CustomerBinding.bind(convertView)


        }
        binding.imgfruit1.setImageResource(fruitslist[position].image)
        binding.textwievfruit.text=fruitslist[position].name
        return binding.root
    }


    }




