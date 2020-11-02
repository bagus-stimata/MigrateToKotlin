package com.example.kotlinvsjava_1

class Engine {
    private  var fuel: Int = 0
    private  var ignition: String = ""

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Engine

        if (fuel != other.fuel) return false
        if (ignition != other.ignition) return false

        return true
    }

    override fun hashCode(): Int {
        var result = fuel
        result = 31 * result + ignition.hashCode()
        return result
    }


}