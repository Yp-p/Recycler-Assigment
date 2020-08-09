package com.ypp.assigment_rc_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.ypp.assigment_rc_home.adaptor.CountryAdaptor
import com.ypp.assigment_rc_home.model.Country
import kotlinx.android.synthetic.main.fragment_country.*


class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var countryArr=ArrayList<Country>()
        countryArr.add(Country(R.drawable.japan,"Japan"))
        countryArr.add(Country(R.drawable.japan,"Japan"))
        countryArr.add(Country(R.drawable.japan,"Japan"))
        countryArr.add(Country(R.drawable.japan,"Japan"))

        countryRecycler.apply {
            layoutManager=GridLayoutManager(context,2)
            adapter=CountryAdaptor(countryArr)
        }

    }
}