package com.example.tugasweek14.fragmentbottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.tugasweek14.Adapter.TabNav
import com.example.tugasweek14.R
import com.google.android.material.tabs.TabLayout


class Fragmentchat : Fragment() {
    private lateinit var viewpage : ViewPager
    private lateinit var tabs : TabLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view : View = inflater.inflate(R.layout.fragment_fragmentchat, container, false)
        viewpage = view.findViewById(R.id.Pagar)
        tabs = view.findViewById(R.id.Tablayout)
        val fragmentadapter = TabNav(childFragmentManager)
        viewpage.adapter = fragmentadapter
        tabs.setupWithViewPager(viewpage)
        return view
    }

}