package com.example.myapplicationtest

import android.content.Context
import android.util.Log

class CustomInterface(context: Context): Employee() {

    interface Callll {
        fun clikkk()
    }

    fun getCall(customInter: Callll) {
        Log.d("TAG","first  function=== ")
        customInter.clikkk()
    }



}
