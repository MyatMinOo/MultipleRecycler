package com.mmm.mm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mmm.mm.R
import com.mmm.mm.model.Product_Model
import kotlinx.android.synthetic.main.products.view.*

class Product_Adapter(var product_array : ArrayList<Product_Model>) : RecyclerView.Adapter<Product_Adapter.ProductViewHolder>()
{
    class ProductViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(product : Product_Model)
        {
            itemView.off_button.text=product.Off_Button
            itemView.product_images.setImageResource(product.Product_Image)
            itemView.product_title.text=product.Product_Title
            itemView.product_title_style.text=product.Product_Title_Style
            itemView.product_price.text=product.Product_Price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.fragment_product,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int =product_array.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
       holder.bind(product_array[position])
    }
}