package com.example.kotlinvsjava_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var textView1: TextView? = null
    var button1: Button? = null
    var button2: Button? = null

//    var textView1: TextView? = null
//    val textView1 = findViewById(R.id.textView1) as TextView
//    val button1 = findViewById(R.id.buttonJava) as Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1 = findViewById(R.id.textView1) as TextView
        button1 = findViewById(R.id.buttonJava) as Button
        button2 = findViewById(R.id.buttonKotlin) as Button

        textView1 = findViewById(R.id.textView1)
        button1 = findViewById(R.id.buttonJava)
        button2 = findViewById(R.id.buttonKotlin)

        textView1?.text = "Oke isinya jangan lupa ada tanda tanya ya"

        button1?.setOnClickListener {
            textView1?.setText("Ganti Bos")
        }
        button2?.setOnClickListener {
            textView1?.text = "Hello Java (Kotlin)"
        }


        var nilai:String = textView1?.text.toString()

        SingletonEarlyInit.getInstance(this).doSomeThing()
        SingletonClass.doSomeThing()
        SingletonLazyInit.instance.doSomeThing()

        var honda: Honda = Honda()
    }

    fun test(){
//        textView1.text = "Hello World"
    }


}