package com.ypp.assigment_rc_home.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.assigment_rc_home.R
import com.ypp.assigment_rc_home.model.Item
import kotlinx.android.synthetic.main.p2_trand_item.view.*

class BestSellAdaptor(var bestArr:ArrayList<Item>):RecyclerView.Adapter<BestSellAdaptor.BestSellViewHolder>(){
    class BestSellViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindBestSeller(item: Item){
            itemView.trendImage.setImageResource(item.trendImange)
            itemView.itemName.text=item.trendName
            itemView.itemPrice.text=item.trendPrice
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.p2_trand_item,parent,false)
        return BestSellViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bestArr.size
    }

    override fun onBindViewHolder(holder: BestSellViewHolder, position: Int) {
        holder.bindBestSeller(bestArr[position])
    }
}