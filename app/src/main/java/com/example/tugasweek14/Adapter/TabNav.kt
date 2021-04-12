package com.example.tugasweek14.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tugasweek14.R
import com.example.tugasweek14.fragmenttab.FragmentLive
import com.example.tugasweek14.fragmenttab.FragmentPanggilan
import com.example.tugasweek14.fragmenttab.FragmentStatus

class TabNav(supp : FragmentManager) : FragmentPagerAdapter(supp,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> FragmentLive()
            1 -> FragmentStatus()
            else -> FragmentPanggilan()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Chat"
            1 -> "Status"
            else -> "Panggilan"
        }
    }

}