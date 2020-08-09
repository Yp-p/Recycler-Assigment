package com.ypp.assigment_rc_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ypp.assigment_rc_home.adaptor.PopularAdaptor
import com.ypp.assigment_rc_home.model.Popular
import kotlinx.android.synthetic.main.fragment_popular.*

class PopularFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var popularArrayList=ArrayList<Popular>()
        popularArrayList.add(Popular("new","30% off","Iphone 8 Plus", "Apple","980000 Ks","111000 Ks",R.drawable.iphone))
        popularArrayList.add(Popular("new","30% off","GhostBed 11 Inch Cooling Get Memory Foam ..", "GhostBed","325000 Ks","111000 Ks",R.drawable.ghostbed))
        popularArrayList.add(Popular(null,"","Nintendo Swithch- Neon Blue and Red Joy Con", "Nintendo","359000 Ks","111000 Ks",R.drawable.swit))
        popularArrayList.add(Popular("new","","BELAROI Womens Comfy Swing Tunic Short", "Belaroi","189900 Ks","111000 Ks",R.drawable.womentshort))
        popularRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter=PopularAdaptor(popularArrayList)
        }

    }

}