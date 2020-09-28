package com.mmm.mm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmm.mm.adapter.Shop_Adapter
import com.mmm.mm.model.Shop_Model
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array_shop =ArrayList<Shop_Model>()
        array_shop.add(Shop_Model(R.drawable.sugar,"Fine Grain Sugar","20","1 Kg"))
        array_shop.add(Shop_Model(R.drawable.peanut,"Peanuts","20","3 Kg"))
        array_shop.add(Shop_Model(R.drawable.rice,"Dawat Rice","20","2 Kg"))

        var shop_adapter=Shop_Adapter(array_shop)
        shop_recycler.layoutManager=LinearLayoutManager(this)
        shop_recycler.adapter=shop_adapter
    }
}