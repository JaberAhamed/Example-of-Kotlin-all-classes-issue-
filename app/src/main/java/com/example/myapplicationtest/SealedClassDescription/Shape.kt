package com.example.myapplicationtest.SealedClassDescription

sealed class Shape {
    data class Circle(val radius:Double):Shape()
    data class Squre(val length:Double):Shape()
    data class Rentangle(val length: Double, val breth:Double):Shape()
}
