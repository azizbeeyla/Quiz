package com.example.application

import android.icu.text.CaseMap.Title
import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.application.databinding.FlagitemBinding

class CustomFlagAdapter(val list:List<Flagmodel>):
RecyclerView.Adapter<CustomFlagAdapter.Mywievholder>()
{
    inner class Mywievholder(val binding:FlagitemBinding):RecyclerView.ViewHolder(binding.root){

fun bind(image: Flagmodel,title: Flagmodel,population:Flagmodel) {

    binding.imgflag.setImageResource(image.image)
    binding.titletext.text=title.title
    binding.population.text=population.population.toString()
}

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Mywievholder {
return Mywievholder(FlagitemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
return list.size
    }

    override fun onBindViewHolder(holder: Mywievholder, position: Int) {
        val image=list[position]
        val title=list[position]
        val population=list[position]
        holder.bind(image,title,population)
    }
}