package com.ypp.assigment_rc_home.adaptor

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ypp.assigment_rc_home.R
import com.ypp.assigment_rc_home.model.Country
import kotlinx.android.synthetic.main.country_item.view.*

class CountryAdaptor(var countryArrayList: ArrayList<Country>):RecyclerView.Adapter<CountryAdaptor.CountryViewHolder>() {
    class CountryViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindCountry(country: Country){
            itemView.countryname.text=country.countryName
            itemView.countryImage.setImageResource(country.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryArrayList.size

    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bindCountry(countryArrayList[position])
    }
}


