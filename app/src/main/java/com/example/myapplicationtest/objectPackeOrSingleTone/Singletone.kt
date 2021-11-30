package com.example.myapplicationtest.objectPackeOrSingleTone

import android.util.Log

object  Singletone  {
    private var count:Int = 0

    fun count(){
        count++
        Log.d("TAG","Main function "+ count)
    }

}