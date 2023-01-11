package com.example.stevdzasancustomobjects.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.stevdzasancustomobjects.R
import com.example.stevdzasancustomobjects.databinding.FragmentABinding
import com.example.stevdzasancustomobjects.databinding.FragmentBBinding

class fragmentB : Fragment() {

    private lateinit var _binding: FragmentBBinding
    private val binding: FragmentBBinding get() = _binding

    private val args by navArgs<fragmentBArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView1.text = "First Name: ${args.currentUser.firstName} \nLast Name: ${args.currentUser.lastName}"
    }
}