package org.techtown.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var btnHello : Button
        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)
        //btnHello = findViewById(R.id.btnHello)
        btnJava.setOnClickListener {
            //Toast.makeText(this@MainActivity, "Hello Kotlin", Toast.LENGTH_LONG).show()
            startActivity(Intent(this@MainActivity,BmiJavaActivity ::class.java))
        }
        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity,BmiKotlinActivity ::class.java))
        }
    }
}