package com.example.kotlinvsjava_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
//    var textView1: TextView? = null
//    var button1: Button? = null
//    var button2: Button? = null
    val textView1 = findViewById(R.id.textView1) as TextView
    val button1 = findViewById(R.id.buttonJava) as Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        textView1 = findViewById(R.id.textView1)
//        button1 = findViewById(R.id.buttonJava)
//        button2 = findViewById(R.id.buttonKotlin)

        textView1.text = getString(R.string.app_name)
        button1?.setOnClickListener {
            textView1.setText("Hello Java")
            textView1.text = "Hello Java (Kotlin)"
        }


//        var nilai:String = textView1.text.toString()

    }

    fun test(){
        textView1.text = "Hello World"
    }


}