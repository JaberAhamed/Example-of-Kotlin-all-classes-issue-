package com.example.myapplicationtest.unitTest

object Magnents {
    fun noOfGroupsOfMagnents (n:Int,magnents:Array<String>):Int{
        var result = 0
        for(i in 0..n-2) if (magnents[i]!=magnents[i+1]) result++


        return ++result

    }
}