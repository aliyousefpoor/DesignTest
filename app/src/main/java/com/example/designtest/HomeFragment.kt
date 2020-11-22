package com.example.designtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class HomeFragment : Fragment() {
    private lateinit var normal: Button
    private lateinit var loading: Button
    private lateinit var bundle: Button
    private lateinit var giftCard: Button
    private lateinit var androidOne: Button
    private lateinit var starbucks: Button

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        normal = view.findViewById(R.id.normal)
        loading = view.findViewById(R.id.loading)
        bundle = view.findViewById(R.id.bundle)
        giftCard = view.findViewById(R.id.giftCard)
        androidOne = view.findViewById(R.id.android1)
        starbucks = view.findViewById(R.id.starbucks)


        navController = Navigation.findNavController(view)


        normal.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_normalPhysicalCampaign)
        }

        loading.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_loadingPhysicalCampaign)
        }

        bundle.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_bundlePhysicalCampaign)
        }

        giftCard.setOnClickListener {
//            navController.navigate(R.id.action_homeFragment2_to_turnPageFragment2)
        }

        androidOne.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_androidOne)
        }

        starbucks.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_starbucksGiftCard)
        }
    }
}