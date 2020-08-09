package com.ypp.assigment_rc_home.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.assigment_rc_home.R
import com.ypp.assigment_rc_home.model.P2_Discover
import kotlinx.android.synthetic.main.page2_discover_item.view.*

class P2_DiscoverAdaptor(var discoverArrayList: ArrayList<P2_Discover>): RecyclerView.Adapter<P2_DiscoverAdaptor.DiscoverViewHolder>(){
    class DiscoverViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindDiscover(discover: P2_Discover){
            itemView.discoverImage.setImageResource(discover.discoverImage)
            itemView.discoverItemName.text=discover.discoverName
            itemView.discoverItem.text=discover.discoverName
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoverViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.page2_discover_item,parent,false)
        return DiscoverViewHolder(view)
    }

    override fun getItemCount(): Int {
        return discoverArrayList.size
    }

    override fun onBindViewHolder(holder: DiscoverViewHolder, position: Int) {
        holder.bindDiscover(discoverArrayList[position])
    }
}

