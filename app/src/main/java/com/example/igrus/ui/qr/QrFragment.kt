package com.example.igrus.ui.qr

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.igrus.R
import com.example.igrus.databinding.FragmentQrBinding
import com.hoc081098.viewbindingdelegate.viewBinding

class QrFragment : Fragment() {

    companion object {
        fun newInstance() = QrFragment()
    }

    private val viewmodel by lazy{
        ViewModelProvider(this).get(QrViewModel::class.java)
    }

    private val binding by viewBinding(FragmentQrBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}