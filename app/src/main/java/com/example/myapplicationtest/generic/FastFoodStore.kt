package com.example.myapplicationtest.generic

class FastFoodStore:ProduceInterface<FastFood> {
    override fun proddue(): FastFood {
        return FastFood()
    }
}