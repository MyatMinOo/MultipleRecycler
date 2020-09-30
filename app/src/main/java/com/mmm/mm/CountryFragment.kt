package com.mmm.mm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.mmm.mm.adapter.Country_Adapter
import com.mmm.mm.model.Country_Model
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
        var countrArray=ArrayList<Country_Model>()
        countrArray.add(Country_Model(R.drawable.japan,"Japan"))
        countrArray.add(Country_Model(R.drawable.china,"China"))
        countrArray.add(Country_Model(R.drawable.korea,"Korea"))
        countrArray.add(Country_Model(R.drawable.international,"International"))

        var countryAdapter=Country_Adapter(countrArray)
        country_recycler.layoutManager=GridLayoutManager(context,2)
        country_recycler.adapter=countryAdapter
    }
}