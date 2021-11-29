package com.example.myapplicationtest.inlineClass

// inline class is actually use for type wrapping and type alise
inline  class  Width(val value:Int)
inline  class  Height(val value:Int)

interface ResizeableView {
    fun resize(width:Width,height: Height)

}