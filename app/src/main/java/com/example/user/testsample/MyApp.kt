package com.example.user.testsample

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

class MyApp : Application() {

    companion object {
        lateinit var myApp: MyApp
    }

    override fun onCreate() {
        super.onCreate()
        myApp = this;
    }

    fun checkNetwork(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE)
        return if (connectivityManager is ConnectivityManager) {
            val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
            networkInfo?.isConnected ?: false
        } else false
    }
}