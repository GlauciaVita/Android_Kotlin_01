package com.example.kotlin_app_1

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "App iniciado", Toast.LENGTH_SHORT).show()

        //val view = View(this)
        //setContentView(view)

        //val view = TextView(this)
        //view.text = "Hello World"
        //setContentView(view)

        //val view = TextView(this)
        //view.setText("Hello World")
        //setContentView(view)

        // Lista de cesta de frutas

        setContentView(R.layout.activity_lista)



    }
}