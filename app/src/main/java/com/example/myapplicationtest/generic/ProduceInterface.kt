package com.example.myapplicationtest.generic

interface ProduceInterface<out T> {
    fun proddue():T
}