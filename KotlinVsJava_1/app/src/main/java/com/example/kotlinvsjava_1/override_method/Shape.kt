package com.example.kotlinvsjava_1.override_method

//Inherit ready because you put modifier "open"
open class Shape{
    //Can't be override becase you put modifier "open"
    open fun draw(){
        println("This is Draw from Shape")
    }

    //it's means final
    fun fill(){
    }

}