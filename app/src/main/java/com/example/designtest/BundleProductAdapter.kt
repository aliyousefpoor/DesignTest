package com.example.designtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BundleProductAdapter(private var context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_adapter, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val productViewHolder: ProductViewHolder = holder as ProductViewHolder
        productViewHolder.onBind(context)
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(context: Context) {

        }
    }
}