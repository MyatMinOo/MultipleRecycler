package com.mmm.mm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmm.mm.R
import com.mmm.mm.model.Shop_Model
import kotlinx.android.synthetic.main.shop_item.view.*

class Shop_Adapter(var array_shop : ArrayList<Shop_Model>) : RecyclerView.Adapter<Shop_Adapter.Shop_ViewHolder>()
{
    class Shop_ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(shop : Shop_Model)
        {
            itemView.item_image.setImageResource(shop.item_image)
            itemView.item_name.text=shop.item_name
            itemView.item_kg.text=shop.item_kg
            itemView.price_number.text = shop.item_price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Shop_ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.shop_item,parent,false)
        return Shop_ViewHolder(view)
    }

    override fun getItemCount(): Int =array_shop.size

    override fun onBindViewHolder(holder: Shop_ViewHolder, position: Int) {
        holder.bind(array_shop[position])
    }
}