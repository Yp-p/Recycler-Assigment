package com.ypp.assigment_rc_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ypp.assigment_rc_home.adaptor.P2_NewArr_Adaptor
import com.ypp.assigment_rc_home.model.P2_NewArr
import kotlinx.android.synthetic.main.fragment_new_arr.*


class NewArrFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_arr, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var newArr=ArrayList<P2_NewArr>()
        newArr.add(P2_NewArr(R.drawable.sofa))
        newArr.add(P2_NewArr(R.drawable.sofa1))
        newArrRecycler.apply {
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=P2_NewArr_Adaptor(newArr)
        }

    }
}

