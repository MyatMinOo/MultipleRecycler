package com.mmm.mm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmm.mm.adapter.Shop_Adapter
import com.mmm.mm.adapter.Ultilities_Adapter
import com.mmm.mm.model.Shop_Model
import com.mmm.mm.model.Ultilities_Model
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array_ulti=ArrayList<Ultilities_Model>()
        array_ulti.add(Ultilities_Model(R.drawable.note,"My Wishlist"))
        array_ulti.add(Ultilities_Model(R.drawable.book,"My Followed Sellers"))
        array_ulti.add(Ultilities_Model(R.drawable.purchased,"My Purchased item"))
        array_ulti.add(Ultilities_Model(R.drawable.coupon,"My Coupons"))
        array_ulti.add(Ultilities_Model(R.drawable.book,"My Cards Wallet"))
        array_ulti.add(Ultilities_Model(R.drawable.coupon,"Exp Points"))
        array_ulti.add(Ultilities_Model(R.drawable.note,"My Given Feedbacks"))
        array_ulti.add(Ultilities_Model(R.drawable.history,"Searched History"))
        array_ulti.add(Ultilities_Model(R.drawable.note,"Events & Calender"))
        var ulti_adapter=Ultilities_Adapter(array_ulti)
        ultilities_recycler.layoutManager=GridLayoutManager(this,3)
        ultilities_recycler.adapter=ulti_adapter
    }
}