package com.mmm.mm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmm.mm.R
import com.mmm.mm.model.Ultilities_Model
import kotlinx.android.synthetic.main.ulti_items.view.*

class Ultilities_Adapter(var array_ulti : ArrayList<Ultilities_Model>) :RecyclerView.Adapter<Ultilities_Adapter.Ultilities_ViewHolder>()
{
    class Ultilities_ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(ulti :Ultilities_Model)
        {
            itemView.ulti_images.setImageResource(ulti.image)
            itemView.ulti_texts.text=ulti.text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Ultilities_ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.ulti_items,parent,false)
        return Ultilities_ViewHolder(view)
    }
    override fun getItemCount(): Int =array_ulti.size

    override fun onBindViewHolder(holder: Ultilities_ViewHolder, position: Int) {
        holder.bind(array_ulti[position])
    }
}