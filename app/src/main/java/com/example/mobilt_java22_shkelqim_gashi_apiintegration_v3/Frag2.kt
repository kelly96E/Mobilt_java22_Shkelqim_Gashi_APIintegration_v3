package com.example.mobilt_java22_shkelqim_gashi_apiintegration_v3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class Frag2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frag2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonNavigate = view.findViewById<Button>(R.id.button_navigate_to_frag3)
        buttonNavigate.setOnClickListener {
            findNavController().navigate(R.id.action_frag2_to_frag3)
        }

    }
}