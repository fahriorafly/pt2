package org.skyriver.yubisaekspor.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.fragment.admin.AdmindetailFragment
import org.skyriver.yubisaekspor.fragment.admin.AdmintkreqFragment

class AdminActivity : AppCompatActivity() {

    private val fragmentAdminDetail: Fragment = AdmindetailFragment()
    private val fragmentAdminTkReq: Fragment = AdmintkreqFragment()
    private val fm: FragmentManager = supportFragmentManager
    private var active: Fragment = fragmentAdminDetail

    private lateinit var menu: Menu
    private lateinit var menuItem: MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        setUpBottomNav()
    }

    fun setUpBottomNav(){
        fm.beginTransaction().add(R.id.container, fragmentAdminDetail).show(fragmentAdminDetail).commit()
        fm.beginTransaction().add(R.id.container, fragmentAdminTkReq).hide(fragmentAdminTkReq).commit()

        bottomNavigationView = findViewById(R.id.nav_view_admin)
        menu = bottomNavigationView.menu
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.navigation_home -> {
                    callFragment(0, fragmentAdminDetail)
                }
                R.id.navigation_user -> {
                    callFragment(1, fragmentAdminTkReq)
                }
            }
            false
        }
    }

    fun callFragment(index: Int, fragment: Fragment){
        menuItem = menu.getItem(index)
        menuItem.isChecked = true
        fm.beginTransaction().hide(active).show(fragment).commit()
        active = fragment
    }
}