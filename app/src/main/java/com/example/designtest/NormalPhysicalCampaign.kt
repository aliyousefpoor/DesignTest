package com.example.designtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3
import java.util.ArrayList

class NormalPhysicalCampaign : Fragment() {
    private lateinit var images: MutableList<Int>
    private lateinit var viewPager: ViewPager2
    private lateinit var indicator: CircleIndicator3

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.normal_physical_campaign, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager = view.findViewById(R.id.normalViewPager)
        indicator = view.findViewById(R.id.normalIndicator)

        val list = fillImageList()

        viewPager.adapter = ViewPagerAdapter(list, requireContext())
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        indicator.setViewPager(viewPager)
    }

    private fun fillImageList(): MutableList<Int> {
        images = ArrayList()
        images.add(R.drawable.product_image)
        images.add(R.drawable.product_image2)
        images.add(R.drawable.product_image)
        images.add(R.drawable.product_image2)
        images.add(R.drawable.product_image)

        return images
    }
}