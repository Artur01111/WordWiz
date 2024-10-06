package com.example.wordwiz.ui.fragment.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.wordwiz.R
import com.example.wordwiz.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() = with(binding) {
        btnExc.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_mainExercisesFragment)
        }
        btnShop.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_shopFragment)
        }
        btnSeting.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_mainSetingFragment)
        }
    }
}