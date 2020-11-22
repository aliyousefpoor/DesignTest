package com.example.designtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.ArrayList

class BundleProductAdapter(
    private var productList: ArrayList<ProductModel>,
    private var context: Context
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_adapter, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val productViewHolder: ProductViewHolder = holder as ProductViewHolder
        productViewHolder.onBind(productList[position], context)
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.productImages)
        private val title: TextView = itemView.findViewById(R.id.productTitle)


        fun onBind(product: ProductModel, context: Context) {
            title.text = product.title
            Glide.with(context).load(product.image).into(image)

        }
    }
}