package com.example.kotlinvsjava_1.interfaces

import com.example.kotlinvsjava_1.Car

interface CustomerInterface {
    open fun getAll(): List<Car>
    open fun getAllEmpty(): List<Car>
}