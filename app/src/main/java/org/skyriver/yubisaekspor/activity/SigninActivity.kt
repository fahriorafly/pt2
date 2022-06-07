package org.skyriver.yubisaekspor.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_signin.*
import org.skyriver.yubisaekspor.R
import org.skyriver.yubisaekspor.helper.SharedPref

class SigninActivity : AppCompatActivity() {

    lateinit var sp:SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        sp = SharedPref(this)

        btnSignin.setOnClickListener{
            sp.setStatusSignin(true)
            startActivity(Intent(this, HomeActivity::class.java))
        }

        btnSigninToSignup.setOnClickListener{
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}