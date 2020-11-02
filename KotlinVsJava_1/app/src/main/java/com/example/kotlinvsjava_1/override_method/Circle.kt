package com.example.kotlinvsjava_1.override_method

class Circle: Shape() {
    override fun draw() {
        super.draw()
        println("This is draw from Circle")
    }

}