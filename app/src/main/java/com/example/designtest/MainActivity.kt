package com.example.designtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    private lateinit var homeNavHost: View
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeNavHost = findViewById(R.id.homeNavHostFragment)
        navController = Navigation.findNavController(this, R.id.homeNavHostFragment)
    }
}