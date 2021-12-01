package com.example.myapplicationtest.delegateexample

class Person(name:String,lastName:String) {
   var name:String by FormatDaligation()
   var lastName:String by FormatDaligation()
}