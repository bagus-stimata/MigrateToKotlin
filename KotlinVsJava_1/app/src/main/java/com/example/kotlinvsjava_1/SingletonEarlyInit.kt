package com.example.kotlinvsjava_1

import android.content.Context

class SingletonEarlyInit private constructor(context: Context){
    init {

    }
    companion object: SingletonEarlyHolder<SingletonEarlyInit, Context>(::SingletonEarlyInit)

    fun doSomeThing(){
    }

    /**
     * Cara panggilnya lihat pada Main Activity
     */
}