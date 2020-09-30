package com.mmm.mm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmm.mm.R
import com.mmm.mm.model.La_Model
import kotlinx.android.synthetic.main.latest_arrival.view.*

class La_Adapter(var la_array : ArrayList<La_Model>) : RecyclerView.Adapter<La_Adapter.La_ViewHolder>()
{
    class La_ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(la: La_Model)
        {
            itemView.la_images.setImageResource(la.La_Image)
            itemView.la_titles.text=la.La_Title
            itemView.la_rate.numStars=la.La_rating
            itemView.la_text_style.text=la.La_Title_Style
            itemView.la_prices.text=la.La_Price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): La_ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.fragment_l_a_,parent,false)
        return La_ViewHolder(view)
    }

    override fun getItemCount(): Int = la_array.size

    override fun onBindViewHolder(holder: La_ViewHolder, position: Int) {
        holder.bind(la_array[position])
    }
}