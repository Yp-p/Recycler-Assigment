package com.ypp.assigment_rc_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ypp.assigment_rc_home.adaptor.P2TrendAdaptor
import com.ypp.assigment_rc_home.model.Item
import kotlinx.android.synthetic.main.fragment_trand.*


class TrandFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trand, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var trendArr=ArrayList<Item>()
     //   trendArr.add(P2_Trend(1,"IPHONE","$2020"))
        trendArr.add(Item(R.drawable.chair,"Ivonne Chair Green","$2020"))
        trendArr.add(Item(R.drawable.chair,"SnakeSkin Pattern","$3055"))
        trendArr.add(Item(R.drawable.chair,"Armchair Konna Green","$2020"))


        trandRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter=P2TrendAdaptor(trendArr)
        }
    }


}