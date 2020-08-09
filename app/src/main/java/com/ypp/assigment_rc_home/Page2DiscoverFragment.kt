package com.ypp.assigment_rc_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ypp.assigment_rc_home.adaptor.P2_DiscoverAdaptor
import com.ypp.assigment_rc_home.model.P2_Discover
import kotlinx.android.synthetic.main.fragment_page2_discover.*

class Page2DiscoverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2_discover, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       var discoverArr=ArrayList<P2_Discover>()
        discoverArr.add(P2_Discover(R.drawable.chair,"Chair","1126 items"))
        discoverArr.add(P2_Discover(R.drawable.table,"Table","1150 items"))
        discoverArr.add(P2_Discover(R.drawable.hydepark,"Hydine","2426 items"))
        discoverRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=P2_DiscoverAdaptor(discoverArr)
        }
    }

}