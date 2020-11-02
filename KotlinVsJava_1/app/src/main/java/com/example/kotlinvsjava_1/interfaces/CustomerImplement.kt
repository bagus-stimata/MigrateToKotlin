package com.example.kotlinvsjava_1.interfaces

import com.example.kotlinvsjava_1.Car
import com.example.kotlinvsjava_1.Engine

class CustomerImplement: CustomerInterface {
    override fun getAll(): List<Car> {
        var engine: Engine = Engine()

        var car1: Car = Car()
        car1.engine = engine
        car1.name = "Alpart"

        var car2: Car = Car()
        car2.engine = engine
        car2.name = "Honda Brio"

        return listOf(car1, car2)
    }

    override fun getAllEmpty(): List<Car> {
//        return listOf()
//        return mutableListOf()
        return emptyList()
    }

}