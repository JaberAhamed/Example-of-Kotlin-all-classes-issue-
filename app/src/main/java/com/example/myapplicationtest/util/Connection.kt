package com.example.myapplicationtest.util

import android.util.Log
// example of class lavel extension fuction
class Connection(val host: Host,val port:Int) {
    // this class function
    fun print(){
        Log.d("TAG","print port ")
    }

    // extension fuciton
    fun Host.printConnection(){
        var rate = getHome()
        Log.d("TAG",": " + rate.toString())
        print()
    }

    // this class function
    fun connection(){
        host.printConnection()
    }

}