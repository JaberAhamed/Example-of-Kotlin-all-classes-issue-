package com.example.myapplicationtest.generic

interface Consumer<in T> {
    fun cosume(item:T)
}