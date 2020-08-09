package com.ypp.assigment_rc_home.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.assigment_rc_home.R
import com.ypp.assigment_rc_home.model.Item
import kotlinx.android.synthetic.main.p2_trand_item.view.*

class P2TrendAdaptor(var trendArrayList: ArrayList<Item>):RecyclerView.Adapter<P2TrendAdaptor.P2TrendViewHolder>() {
    class P2TrendViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindTrend(item: Item){
        itemView.itemName.text=item.trendName
            itemView.itemPrice.text=item.trendPrice
            itemView.trendImage.setImageResource(item.trendImange)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): P2TrendViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.p2_trand_item,parent,false)
        return P2TrendViewHolder(view)
    }

    override fun getItemCount(): Int {
        return trendArrayList.size
    }

    override fun onBindViewHolder(holder: P2TrendViewHolder, position: Int) {
        holder.bindTrend(trendArrayList[position])
    }
}