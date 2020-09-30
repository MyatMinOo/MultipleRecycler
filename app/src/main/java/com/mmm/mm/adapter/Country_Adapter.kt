package com.mmm.mm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmm.mm.R
import com.mmm.mm.model.Country_Model
import kotlinx.android.synthetic.main.country.view.*

class Country_Adapter(var country_array : ArrayList<Country_Model>) : RecyclerView.Adapter<Country_Adapter.Country_ViewHolders>()
{
    class Country_ViewHolders(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
       fun bind(country : Country_Model)
       {
           itemView.bg_country.setImageResource(country.Country_Image)
           itemView.txt_country.text=country.Country_Name
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Country_ViewHolders {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.fragment_country,parent,false)
        return Country_ViewHolders(view)
    }

    override fun getItemCount(): Int =country_array.size

    override fun onBindViewHolder(holder: Country_ViewHolders, position: Int) {
        holder.bind(country_array[position])
    }
}