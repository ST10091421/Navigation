package com.example.navigationdrawer.nav_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navigationdrawer.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Accessing TextViews from the inflated layout
        val policeEmergencyNumber: TextView = view.findViewById(R.id.police_emergency_number)
        val crimeStop: TextView = view.findViewById(R.id.crime_stop)
        val policeComplaints: TextView = view.findViewById(R.id.police_complaints)
        val ambulance: TextView = view.findViewById(R.id.ambulance)

        // Set text for each TextView
        policeEmergencyNumber.text = "Primary Police emergency number: 10111"
        crimeStop.text =
            "Crime Stop: Report crimes as well as provide anonymous tip-offs. Call 0860 010 111"
        policeComplaints.text =
            "Police service complaints center: Report any issues with the police on 0800 333 177"
        ambulance.text = "Ambulance: 10177"

        return view
    }
}
