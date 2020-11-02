package com.example.kotlinvsjava_1

/**
 * There is 2 Singleton Type
 * 1. Only One Instance: Semua instan di deklarasikan dan dijalankan di awal. Hal ini akan membuat aplikasi terasa berat
 * 2. Lazy Initiation: Instan hanya akan di load saat digunakan
 *
 * Contoh dibawah ini adalah contoh untuk method 1 (Only One Instance)
 * yang biasa digunakan oleh Java
 */
object SingletonClass {
    /**
     * It's Java Version
     * object SingletonClass is the same with code below
     * are u kidding? No. just this
     */
//    private var INSTANCE: SingletonClass? = null
//    fun getInstance(): SingletonClass? {
//        if (INSTANCE == null) INSTANCE = SingletonClass()
//        return INSTANCE
//    }

    /**
     * and then as additional or optional
     * you can add init and other function
     */
    init {
        println("Singleton Class Invoiked oke!")
    }
    fun createEngine(){
        println("Engine Created")
    }
    fun doSomeThing(){

    }

}
