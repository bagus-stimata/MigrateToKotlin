package com.example.kotlinvsjava_1

import android.widget.TextView

class KotlinClass {

    fun setTextFromKotlin(x: TextView) {
        val nilai: String = "Ini nilai dari text dari Kontlin"
        x.text = nilai
    }
    fun setTextFromKotlin_WitMesageReturn(x: TextView):String {
        setTextFromKotlin(x)

        val customer = Customer()

        customer.id = 12;

        if (customer?.name.equals("Bagus")) {
        }
        return "Pesan dari Kontlin Class"
    }
    companion object {
        var carName: String? = null
        const val jenis: String = "Ferray"
        fun getInstance(): String {
            if (carName == null) carName = "Honda Brio"
            return "Hello"
        }
    }


}
