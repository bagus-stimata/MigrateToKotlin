package com.example.kotlinvsjava_1

class SingletonLazyInit private constructor(){
    private object HOLDER {
        val INSTANCE = SingletonLazyInit()
    }

    companion object {
        val instance: SingletonLazyInit by lazy { HOLDER.INSTANCE }
    }

    fun doSomeThing(){
    }

    /**
     * Tapi kode diatas bisa diganti dengan hanya satu kelas object Singleton
     * yaitu
     *  object SingletonLazyInit
     *  ya cuma begitu saja
     */
}