package com.project.marsrealstate.overview

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.project.marsrealstate.R
import com.project.marsrealstate.databinding.FragmentOverviewBinding

class OverviewFragment : Fragment() {

    private lateinit var viewModel: OverviewViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentOverviewBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_overview, container, false)

        viewModel = ViewModelProvider(this).get(OverviewViewModel::class.java)

        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel



        return binding.root
    }


}