package org.skyriver.yubisaekspor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.skyriver.yubisaekspor.activity.AdminActivity
import org.skyriver.yubisaekspor.activity.HomeActivity
import org.skyriver.yubisaekspor.activity.SigninActivity
import org.skyriver.yubisaekspor.fragment.pengguna.HomeFragment
import org.skyriver.yubisaekspor.fragment.pengguna.UserFragment
import org.skyriver.yubisaekspor.helper.SharedPref

class MainActivity : AppCompatActivity() {

    private var statusSignin = false

    private lateinit var sp:SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sp = SharedPref(this)

        if (sp.getStatusSignin() == false){
            startActivity(Intent(this, SigninActivity::class.java))
        } else {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}