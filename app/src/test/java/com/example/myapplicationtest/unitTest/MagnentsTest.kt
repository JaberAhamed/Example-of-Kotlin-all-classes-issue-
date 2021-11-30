package com.example.myapplicationtest.unitTest

import org.hamcrest.MatcherAssert
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class MagnentsTest{

    @Test
    fun FirstTestCase(){
        var result  = Magnents.noOfGroupsOfMagnents(6, arrayOf("10","10","10",
            "01","01","10",))

        assertThat(result, equalTo(3));
    }

    @Test
    fun SecondTestCase(){
        var result  = Magnents.noOfGroupsOfMagnents(4, arrayOf("10",
            "10","01","01",))

        assertThat(result, equalTo(2));
    }


}