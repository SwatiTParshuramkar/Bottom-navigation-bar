package com.example.android.botton_navigation_bar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.android.botton_navigation_bar.fragment.DashboardFragment
import com.example.android.botton_navigation_bar.fragment.InfoFragment
import com.example.android.botton_navigation_bar.fragment.SettingFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {


    lateinit var dashboardFragment: DashboardFragment
    lateinit var settingFragment: SettingFragment
    lateinit var infoFragment: InfoFragment

    lateinit var bottomNavigation: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.navigationView)

        dashboardFragment = DashboardFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,dashboardFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        bottomNavigation.setNavigationItemSelectedListener { it ->
            when (it.itemId) {
                R.id.ic_dashboard -> {
                    dashboardFragment = DashboardFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container,dashboardFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                }
                R.id.ic_settings -> {
                    settingFragment = SettingFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container,settingFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.ic_info -> {
                    infoFragment = InfoFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container,infoFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                }


            }
            true


        }

//    fun replaceFragment(setFragment: Fragment, bundle: Bundle?) {
//        currentFragment = setFragment
//
//        val fragmentManager = supportFragmentManager
//        if (bundle != null) {
//            setFragment.arguments = bundle
//        }
//        val fragmentTra = fragmentManager.beginTransaction().addToBackStack(null)
//        fragmentTra.replace(R.id.container, setFragment)
//        fragmentTra.commit()
//    }
    }

}






