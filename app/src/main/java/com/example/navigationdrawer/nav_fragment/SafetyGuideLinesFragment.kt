package com.example.navigationdrawer.nav_fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.navigationdrawer.R

class SafetyGuideLinesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_safety_guide_lines, container, false)

        // Accessing TextView from the inflated layout
        val safetyGuideLinesText: TextView = view.findViewById(R.id.safety_guide_lines)

        // Set the safety guidelines text
        val safetyGuideLines = """
            Safety Guidelines:
            
            Be crime conscious - be aware of crime opportunities at all times!
            - Never walk around alone and don’t talk to strangers. Be on the lookout for strange cars or people.
            - Walk in well-lit busy streets and in a group, if possible.
            - Make sure your home is secure, and become a member of an armed response service. Be sure that you know all the emergency numbers or have them displayed in an accessible area.
            - Always let someone know where you are going and how long you will be gone. But think twice before advertising your impending absence on social media. Criminals also have access to Facebook and Twitter.
            - Know all emergency numbers.
            - Trust your instinct.
            - Avoid going onto a congested street where you cannot even walk properly, that is where you will find criminals pick pocketing.
            - Avoid displaying valuables where criminals can see them.
            HIJACKINGS
            - Avoid being alone in a vehicle when travelling at night.
            - Do not stop around hijacking spots or at any secluded area.
            - Always be alert when driving. If you suspect that you are being followed by a suspicious vehicle, drive to the nearest police station or call the SAPS Emergency number 10111.
            - Do not pick up hitchhikers, particularly when you drive alone.
            - Avoid distractions such as being on your phone, drinking and driving.
            - Increase caution at intersections – always keep a look out for people loitering around your car or for any sudden activity around your car.
            HOUSE ROBBERIES
            - Always be on the lookout for suspicious persons and vehicles.
            - Enhance security through fitting access doors with security gates and install burglar bars on windows.
            - Request neighbours to keep an eye when you go away for an extended period.
            - Do not open gates and doors for strangers.
            - Verify the details of anyone before you employ them and check authenticity of a contractor before you allow access to the premises.
            BUSINESS ROBBERIES
            - Do not keep too much money on the business premises.
            - Be on the lookout for suspicious customers.
            - Do not keep the shop open till late.
            - Avoid being alone, especially at night.
            - Business owners must not open for anyone after the business has closed.
            THE FOLLOWING ARE SAFETY TIPS TO PREVENT CONTACT CRIMES:
            - Do not carry too much money when going to drinking places.
            - Do not carry weapons when you attend social gatherings.
            - Do not share a drink with someone you do not know.
            - Avoid confrontation when under the influence of alcohol.
            - Do not leave your drink unattended.
        """.trimIndent()

        // Set text for TextView
        safetyGuideLinesText.text = safetyGuideLines

        return view
    }
}
