package com.example.wordwiz.ui.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.wordwiz.ui.fragment.onBoard.OnBoardPaggingFragment.Companion.ARG_ONBOARD_POSITION
import com.example.wordwiz.ui.fragment.onBoard.OnBoardPaggingFragment

class OnBoardViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int) = OnBoardPaggingFragment().apply {
        arguments = Bundle().apply {
            putInt(ARG_ONBOARD_POSITION, position)
        }
    }
}