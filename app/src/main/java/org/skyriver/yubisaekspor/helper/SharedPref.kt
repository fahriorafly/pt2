package org.skyriver.yubisaekspor.helper

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class SharedPref(activity: Activity) {

    val statusSignin = "SIGNIN"

    val myPref = "MAIN_PREF"
    val sp: SharedPreferences

    init {
        sp = activity.getSharedPreferences(myPref, Context.MODE_PRIVATE)
    }

    fun setStatusSignin(status: Boolean){
        sp.edit().putBoolean(statusSignin, status).apply()
    }

    fun getStatusSignin():Boolean{
        return sp.getBoolean(statusSignin, false)
    }
}