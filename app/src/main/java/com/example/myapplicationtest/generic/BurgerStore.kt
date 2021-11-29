package com.example.myapplicationtest.generic

class BurgerStore:ProduceInterface<Burger> {
    override fun proddue(): Burger {
        return Burger()
    }
}