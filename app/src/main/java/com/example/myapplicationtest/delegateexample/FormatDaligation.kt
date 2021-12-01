package com.example.myapplicationtest.delegateexample

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FormatDaligation : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""
    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
       formattedString = value.lowercase().uppercase()
    }
}