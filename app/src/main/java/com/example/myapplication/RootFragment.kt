package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class RootFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_root, container, false)
        val btn = view.findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key",1)
            findNavController().navigate(R.id.action_rootFragment_to_resultFragment, bundle)
        }
        return view
    }


}