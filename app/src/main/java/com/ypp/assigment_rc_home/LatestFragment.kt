package com.ypp.assigment_rc_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ypp.assigment_rc_home.adaptor.LatestAdaptor
import com.ypp.assigment_rc_home.model.Latest
import kotlinx.android.synthetic.main.fragment_latest.*


class LatestFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_latest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var lateArrayList=ArrayList<Latest>()
        lateArrayList.add(Latest("Hyde Park","N41015","LOUIS VUITTON",9999999,R.drawable.hydepark))
        lateArrayList.add(Latest("HORNS PINK LONG","SLEEVE T SHIRT","Lady Gaga",150000,R.drawable.shirt))
        lateArrayList.add(Latest("Iphone 8 Plus","Iphone","Apple",300000,R.drawable.iphone))
        lateArrayList.add(Latest("Android","Redmi7","Mi",150000,R.drawable.shopbag))


        latestRecyler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=LatestAdaptor(lateArrayList)
        }

    }

}