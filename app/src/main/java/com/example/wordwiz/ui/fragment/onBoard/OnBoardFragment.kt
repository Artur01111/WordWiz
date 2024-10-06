package com.example.wordwiz.ui.fragment.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.wordwiz.R
import com.example.wordwiz.databinding.FragmentOnBoardBinding
import com.example.wordwiz.ui.adapter.OnBoardViewPagerAdapter
import com.example.wordwiz.utils.PreferenceHelper

class OnBoardFragment : Fragment() {

    private lateinit var binding : FragmentOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListeners()
    }

    private fun initialize() {
        binding.viewPager2.adapter = OnBoardViewPagerAdapter(this)
    }

    private fun setupListeners() = with(binding.viewPager2) {
        binding.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 2){
                    binding.txSkip.visibility = View.INVISIBLE
                    binding.btnStart.visibility = View.VISIBLE
                }else{
                    binding.btnStart.visibility = View.INVISIBLE
                    binding.txSkip.visibility = View.VISIBLE
                }
            }
        })
        binding.txSkip.setOnClickListener {
            if (currentItem < 3){
                setCurrentItem(currentItem + 2, true)
            }
        }
        binding.btnStart.setOnClickListener {
            val sharedPreferences = PreferenceHelper()
            sharedPreferences.unit(requireContext())
            sharedPreferences.isOnBoardShown = true
            findNavController().navigate(R.id.action_onBoardFragment_to_mainFragment)
        }
    }
}