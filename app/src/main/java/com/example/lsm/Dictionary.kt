package com.example.lsm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lsm.databinding.FragmentDictionaryBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Dictionary : Fragment() {
    private var _binding: FragmentDictionaryBinding? = null
    private val binding get()  = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDictionaryBinding.inflate(inflater, container, false)
        binding.searchViewDictionary.setOnClickListener(View.OnClickListener { binding.searchViewDictionary.isIconified = false })
        // Inflate the layout for this fragment
        return binding.root
    }


}