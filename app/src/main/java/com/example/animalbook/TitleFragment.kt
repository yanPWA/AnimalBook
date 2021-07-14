package com.example.animalbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.animalbook.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {
    private var _binding: FragmentTitleBinding? = null
    private val binding get() = _binding!!

    /* inflater：フラグメント内のビュ-を生成するためのLayoutInflaterが渡される
     * container：親のビューグループが渡される
     * savedInstanceState：フラグメントの状態を保持するBundleオブジェクトが渡される
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTitleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun setTitle(title: String) {
        binding.titleText.text = title
    }




}