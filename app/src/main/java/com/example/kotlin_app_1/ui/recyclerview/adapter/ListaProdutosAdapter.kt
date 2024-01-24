package com.example.kotlin_app_1.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_app_1.R
import com.example.kotlin_app_1.model.Produtos


class ListaProdutosAdapter(
    private val context:  Context,
    private val produtos: List<Produtos>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produtos) {
            val cesta = itemView.findViewById<TextView>(R.id.cesta)
            cesta.text = produto.cesta
            val frutas = itemView.findViewById<TextView>(R.id.frutas)
            frutas.text = produto.frutas
            val peso = itemView.findViewById<TextView>(R.id.peso)
            peso.text = produto.peso
            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    override fun getItemCount(): Int = produtos.size




}
