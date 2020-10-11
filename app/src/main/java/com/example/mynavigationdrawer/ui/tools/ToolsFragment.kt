package com.example.mynavigationdrawer.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mynavigationdrawer.R

class ToolsFragment : Fragment() {

    private lateinit var galleryViewModel: ShareViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProviders.of(this).get(ShareViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tools, container, false)
        val textView: TextView = root.findViewById(R.id.nav_tools)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}