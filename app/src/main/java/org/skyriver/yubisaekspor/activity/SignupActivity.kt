package org.skyriver.yubisaekspor.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.skyriver.yubisaekspor.R

class SignupActivity : AppCompatActivity() {

    private lateinit var btnToSignin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        btnToSignin = findViewById(R.id.btnSignupToSignin)
        btnToSignin.setOnClickListener{
            startActivity(Intent(this, SigninActivity::class.java))
        }
    }
}