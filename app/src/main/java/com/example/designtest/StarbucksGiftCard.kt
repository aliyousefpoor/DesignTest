package com.example.designtest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

class StarbucksGiftCard : Fragment() {
    private lateinit var readMoreLayout: ConstraintLayout
    private lateinit var hideLayout: ConstraintLayout
    private lateinit var moreDescription: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.starbucks_gift_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readMoreLayout = view.findViewById(R.id.readMoreLayout)
        hideLayout = view.findViewById(R.id.hideLayout)
        moreDescription = view.findViewById(R.id.moreDescription)


        hideLayout.visibility = View.GONE

        readMoreLayout.setOnClickListener {
            readMoreLayout.visibility = View.GONE
            moreDescription.setText(R.string.moreDescription)
            hideLayout.visibility = View.VISIBLE
        }

        hideLayout.setOnClickListener {
            hideLayout.visibility = View.GONE
            moreDescription.text = null
            readMoreLayout.visibility = View.VISIBLE

        }
    }
}