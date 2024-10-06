package com.example.wordwiz.ui.fragment.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.wordwiz.R
import com.example.wordwiz.databinding.FragmentOnBoardPaggingBinding

class OnBoardPaggingFragment : Fragment() {

    private lateinit var binding : FragmentOnBoardPaggingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardPaggingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {
        when(requireArguments().getInt(ARG_ONBOARD_POSITION)){
            0 -> {
                Glide.with(img).load(R.drawable.onboardimg1).into(img)
                txtTitle.text = "Добро пожаловать"
                desc.text = "Изучайте английские слова легко и эффективно! Просто добавьте слова, которые хотите выучить, а мы поможем вам закрепить их с помощью увлекательных теоретических материалов и практических заданий."
                view1.setBackgroundResource(R.drawable.cruc2)
                view2.setBackgroundResource(R.drawable.cruc)
                view3.setBackgroundResource(R.drawable.cruc)
            }
            1 -> {
                Glide.with(img).load(R.drawable.onboardimg2).into(img)
                view1.setBackgroundResource(R.drawable.cruc)
                view2.setBackgroundResource(R.drawable.cruc2)
                view3.setBackgroundResource(R.drawable.cruc)
                txtTitle.text = "Эффективность"
                desc.text = "\n" +
                        "Создайте свой список слов\n" +
                        "Выполняйте задания и получайте награды\n" +
                        "Отслеживайте свой прогресс и количество выученных слов"
            }
            2 -> {
                Glide.with(img).load(R.drawable.onboardimg3).into(img)
                view1.setBackgroundResource(R.drawable.cruc)
                view2.setBackgroundResource(R.drawable.cruc)
                view3.setBackgroundResource(R.drawable.cruc2)
                txtTitle.text = "Знание"
                desc.text = "Начните свой путь к свободному владению английским уже сегодня!"
            }
        }
    }

    companion object{
        const val ARG_ONBOARD_POSITION = "onBoard"
    }
}