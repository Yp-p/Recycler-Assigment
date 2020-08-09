package com.ypp.assigment_rc_home.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.assigment_rc_home.R
import com.ypp.assigment_rc_home.model.Latest
import kotlinx.android.synthetic.main.latest_item.view.*

class LatestAdaptor(var latestArrayList: ArrayList<Latest>):RecyclerView.Adapter<LatestAdaptor.HomeViewHolder>() {
    class HomeViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindLatest(latest: Latest){
            itemView.t1.text=latest.type
            itemView.t2.text=latest.model
            itemView.t3.text=latest.brand
            itemView.latestPrice.text=latest.price.toString()
            itemView.image.setImageResource(latest.image)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.latest_item,parent,false)
        return HomeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestArrayList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bindLatest(latestArrayList[position])
    }
}