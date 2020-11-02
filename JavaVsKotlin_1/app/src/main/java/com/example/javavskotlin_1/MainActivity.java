package com.example.javavskotlin_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kotlinvsjava_1.Car;
import com.example.kotlinvsjava_1.KotlinClass;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        button1 = findViewById(R.id.buttonJava);
        button2 = findViewById(R.id.buttonKotlin);

        textView1.setText("Text View yang baru tidak perlu untuk di cash pda Find View by ID.");
        button1.setOnClickListener(e ->{
            textView1.setText("Hello From Java Biasa");

        });
        button2.setOnClickListener(e -> {
            Car car1 = new Car("Mas Bagus Winarno");
            Car car2 = new Car(1, null);
//            Car car3 = new Car(null, 2); //Tidak bisa karena tanda "?" berarti boleh null
            KotlinClass kc = new KotlinClass();

            Toast.makeText(this, kc.setTextFromKotlin_WitMesageReturn(textView1) + " dan ", Toast.LENGTH_LONG).show();
        });

    }


}