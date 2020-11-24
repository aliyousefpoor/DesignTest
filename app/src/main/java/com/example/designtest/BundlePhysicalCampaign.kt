package com.example.designtest

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class BundlePhysicalCampaign : Fragment() {
    private lateinit var cardView: CardView
    private lateinit var obj3: ImageView
    private lateinit var recyclerView: RecyclerView
    private lateinit var productList: ArrayList<ProductModel>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bundle_physical_campaign, container, false)
    }

    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list = fillProduct()
        obj3 = view.findViewById(R.id.obj3)
        cardView = view.findViewById(R.id.bundleCardView)
        recyclerView = view.findViewById(R.id.recyclerView)

        obj3.setOnClickListener {
            Toast.makeText(requireContext(), "heyyy ...", Toast.LENGTH_SHORT).show()
        }
        val adapter = BundleProductAdapter(list, requireContext())
        val layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
    }

    private fun fillProduct(): ArrayList<ProductModel> {
        productList = ArrayList()

        productList.add(
            ProductModel(
                R.drawable.product1,
                "Nivea women deo clear spray invisible for black and white"
            )
        )
        productList.add(
            ProductModel(
                R.drawable.product2,
                "Extra Whitening Roll-On Whitening Deodorant"
            )
        )
        productList.add(
            ProductModel(
                R.drawable.product_image2,
                "NIVEA Double Effect Eye Make-Up Remover"
            )
        )
        productList.add(
            ProductModel(
                R.drawable.product1,
                "Nivea women deo clear spray invisible for black and white"
            )
        )
        productList.add(
            ProductModel(
                R.drawable.product2,
                "Extra Whitening Roll-On Whitening Deodorant"
            )
        )
        productList.add(
            ProductModel(
                R.drawable.product_image2,
                "NIVEA Double Effect Eye Make-Up Remover"
            )
        )

        return productList
    }

}