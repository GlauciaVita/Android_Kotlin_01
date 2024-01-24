package com.example.kotlin_app_1.ui.activity

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_app_1.R
import com.example.kotlin_app_1.model.Produtos
import com.example.kotlin_app_1.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

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

        //val cesta = findViewById<TextView>(R.id.cesta)
        //cesta.text = "Cesta de frutas"
        //val frutas = findViewById<TextView>(R.id.frutas)
        //frutas.text = "Morango, banana. uva "
        //val peso = findViewById<TextView>(R.id.peso)
        //peso.text = "3kg "
        //val valor = findViewById<TextView>(R.id.valor)
        //valor.text = "20,00"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produtos(cesta = "teste",
                    frutas = "teste",
                    peso = "teste",
                    valor = BigDecimal("2000")
            ),
            Produtos(cesta = "teste 1",
                frutas = "teste 1",
                peso = "teste 1",
                valor = BigDecimal("2100")
            ),
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}