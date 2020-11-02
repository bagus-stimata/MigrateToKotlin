package com.example.kotlinvsjava_1

import android.view.View

open class Car {
    var name: String = ""
    var engine: Engine? = null
    lateinit var wheel: Wheel

    init {
        println("init from Car")
    }
    constructor(){
    }
    constructor(engine: Engine)


}