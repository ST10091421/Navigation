package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.navigationdrawer.nav_fragment.*
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            onBackPressedMethod()
        }
    }

    private fun onBackPressedMethod() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)

        }else{
            finish()
        }

    }

    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onBackPressedDispatcher.addCallback(this,onBackPressedCallback)

        val toolbar= findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawerLayout)

        val navigationView = findViewById<NavigationView>(R.id.navigationView)
        val header = navigationView.getHeaderView(0)
        val userNameTxT= header.findViewById<TextView>(R.id.userNameTxt)
        val profileImg = header.findViewById<ImageView>(R.id.profileImg)


        navigationView.setNavigationItemSelectedListener (this)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        ///Default Navigation bar Tab Selected
        replaceFragment(HomeFragment())
        navigationView.setCheckedItem(R.id.nav_home)

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.navFragment,fragment)
            .commit()

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home -> {
                replaceFragment(HomeFragment())
            }
            R.id.nav_map-> {
                replaceFragment(CrimeAlertMapFragment())
                title="Crime Alert Map"
            }
            R.id.nav_Safety -> {
                replaceFragment(SafetyGuideLinesFragment())
                title="Safety GuideLines"
            }
            R.id.nav_report-> {
                replaceFragment(ReportIncidentFragment())
               title="Report Incident"
            }
            R.id.nav_trends-> {
                replaceFragment(CrimeTrendsFragment())
                title="Crime Trends"}

            R.id.nav_comments-> {
                replaceFragment(CrimeTrendsFragment())
                title="Incident Comments"}




        }
        drawerLayout.closeDrawer((GravityCompat.START))
        return true

    }
}




