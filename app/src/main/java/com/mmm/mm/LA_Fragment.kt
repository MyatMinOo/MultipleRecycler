package com.mmm.mm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mmm.mm.adapter.La_Adapter
import com.mmm.mm.model.La_Model
import kotlinx.android.synthetic.main.fragment_l_a_.*

class LA_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_l_a_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var la_list=ArrayList<La_Model>()
        la_list.add(La_Model(R.drawable.park,"Hyde Park \n N41015","LOUIS VUITTON",4,"999999 KS"))
        la_list.add(La_Model(R.drawable.dress,"HORNS PINK LONG \n SLEEVE T SHIRT","Lady Gaga",5,"72000 KS"))
        la_list.add(La_Model(R.drawable.iphone11pro,"IPhone 11 Pro","Apple",4,"1100000"))

        var ladapter=La_Adapter(la_list)
        la_recycler.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        la_recycler.adapter=ladapter

    }

}