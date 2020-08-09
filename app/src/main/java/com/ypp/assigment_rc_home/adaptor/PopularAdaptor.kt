package com.ypp.assigment_rc_home.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.assigment_rc_home.R
import com.ypp.assigment_rc_home.model.Popular
import kotlinx.android.synthetic.main.popular_item.view.*

class PopularAdaptor(var popularArrayList: ArrayList<Popular>) : RecyclerView.Adapter<PopularAdaptor.PopularViewHolder>(){
    class PopularViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindPopular(popular: Popular){
            itemView.neW.text=popular.neW
            itemView.off.text=popular.off
            itemView.model.text=popular.model
            itemView.brand.text=popular.brand
            itemView.popularPrice.text=popular.prince
            itemView.popularDiscount.text=popular.discoun
            itemView.popularImage.setImageResource(popular.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.popular_item,parent,false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularArrayList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bindPopular(popularArrayList[position])
    }
}