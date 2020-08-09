package com.ypp.assigment_rc_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ypp.assigment_rc_home.adaptor.BestSellAdaptor
import com.ypp.assigment_rc_home.model.Item
import kotlinx.android.synthetic.main.fragment_best_selling.*


class BestSellingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_best_selling, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var bestsellArr=ArrayList<Item>()
        bestsellArr.add(Item(R.drawable.chair,"Redmi","150000 Ks"))
        bestsellArr.add(Item(R.drawable.chair,"Redmi","150000 Ks"))
        bestsellArr.add(Item(R.drawable.chair,"Redmi","150000 Ks"))
        bestsellArr.add(Item(R.drawable.chair,"Redmi","150000 Ks"))
        bestSellRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter=BestSellAdaptor(bestsellArr)
        }
    }


}