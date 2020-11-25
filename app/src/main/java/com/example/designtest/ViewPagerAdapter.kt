package com.example.designtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ViewPagerAdapter(private var images: List<Int>, private var context: Context) :
    RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.PagerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.view_pager_adapter, parent, false)
        return PagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.PagerViewHolder, position: Int) {
        val pagerViewHolder: PagerViewHolder = holder as PagerViewHolder
        holder.onBind(context, images[position])
    }

    class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.productImage)

        fun onBind(context: Context, images: Int) {
            Glide.with(context).load(images).into(image)
        }
    }
}