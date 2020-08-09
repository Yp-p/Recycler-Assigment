package com.ypp.assigment_rc_home.adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.assigment_rc_home.R
import com.ypp.assigment_rc_home.model.P2_NewArr
import kotlinx.android.synthetic.main.new_arr_item.view.*
import kotlinx.android.synthetic.main.p2_trand_item.view.*

class P2_NewArr_Adaptor(var newArr:ArrayList<P2_NewArr>) : RecyclerView.Adapter<P2_NewArr_Adaptor.P2_NewArr_ViewHolder>() {
    class P2_NewArr_ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindNewArr(p2_NewArr: P2_NewArr){
           itemView.newArrImage.setImageResource(p2_NewArr.Image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): P2_NewArr_ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.new_arr_item,parent,false)
        return P2_NewArr_ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newArr.size
    }

    override fun onBindViewHolder(holder: P2_NewArr_ViewHolder, position: Int) {
        holder.bindNewArr(newArr[position])
    }
}