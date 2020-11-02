package com.example.kotlinvsjava_1

import kotlin.math.absoluteValue

class Car {
    //Primary Constructor
    init {
        //Pasti akan dipanggil dahulu
        var nomor: Int = 6
        println("Dipanggil duluan: ${nomor}")
    }
    constructor(x: Int, y: Int? ){
        println("Hello Bos " + y?.toDouble()) //Tampilkan y -> JIKA TIAK NULL (sebagai pengaman)
    }
    constructor(nama: String){
        println("Hello nama: " + nama)
    }

}