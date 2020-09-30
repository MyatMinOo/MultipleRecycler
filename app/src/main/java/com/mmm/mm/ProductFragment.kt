package com.mmm.mm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmm.mm.adapter.Product_Adapter
import com.mmm.mm.model.Product_Model
import kotlinx.android.synthetic.main.fragment_product.*

class ProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var productArray =ArrayList<Product_Model>()
        productArray.add(Product_Model("30% off",R.drawable.iphone8,"Iphone 8 Plus","Apple",4,"980000 KS"))
        productArray.add(Product_Model("34% off",R.drawable.ghost_bed,"Ghost Bed 11 Inch Cooling \n Gel Memory Foam...","GhostBed",4,"325000 KS"))
        productArray.add(Product_Model("30% off",R.drawable.nintendo,"Nintendo Switch - Neon Blue \n And Red Joy-Con","Nintendo",5,"359000 KS"))
        productArray.add(Product_Model("30% off",R.drawable.women_dress,"BELAROI Womens Comfy \n Swing Tunic Short..","Belaroi",4,"18990 KS"))

        var productAdapter=Product_Adapter(productArray)
        product_recycler.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        product_recycler.adapter=productAdapter
    }

}