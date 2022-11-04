package com.example.tokopedia.util

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class Prefs(activity: Activity) {

    private var sp : SharedPreferences? = null
    private val isLogin = "Login"

    init {
        sp = activity.getSharedPreferences("MYPREFS", Context.MODE_PRIVATE)
    }

    fun setIsLogin(value: Boolean){
        sp!!.edit().putBoolean(isLogin, value).apply()
    }

    fun getIsLogin() : Boolean{
        return sp!!.getBoolean(isLogin, false)
    }
}