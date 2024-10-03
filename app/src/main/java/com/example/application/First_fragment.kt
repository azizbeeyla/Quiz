package com.example.application

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.application.databinding.FragmentfirstBinding

class First_fragment : Fragment() {
    private lateinit var _binding: FragmentfirstBinding
    private val binding get()=_binding!!
    private lateinit var interface1 :Firstfragmentinterface

    override fun onAttach(context: Context) {
        interface1 =activity as Firstfragmentinterface
        super.onAttach(context)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentfirstBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnsent.setOnClickListener {
            val text =binding.textfragment.text.toString()
            interface1.onClickButton(text)
        }
    }

}