package com.example.myapplicationtest.generic

class Foodstore:ProduceInterface<Food> {
    override fun proddue(): Food {
        return Food()
    }
}