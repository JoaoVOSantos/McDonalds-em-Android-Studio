package com.example.mcdonalds

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Comprar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprar)
        setSupportActionBar(findViewById(R.id.toolbar))

        val arrayAdapter: ArrayAdapter<*>
        val produtos = arrayOf("Mac Lanche Feliz 1x  99,00",
            "Mac Sanduiche Feliz 5x  1000,00",
            "Coca-Cola 500 ml 2x  150,00",
            "Sorvete macFlury 3x  2,00")

        var lista = findViewById<ListView>(R.id.listaProdutos)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,produtos)

        lista.adapter = arrayAdapter

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.btnToolbarConfig -> {
                val intent = Intent(this, Configuracoes::class.java)
                startActivity(intent)
            }
            R.id.btnToolbarPerfil -> {
                val intent = Intent(this, Perfil::class.java)
                startActivity(intent)
            }

            R.id.btnToolbarCarrinho -> {
                val intent = Intent(this, Carrinho::class.java)
                startActivity(intent)
            }
        }
        return true
    }

    fun btnFinalizarCompra(view: View){
        val intent = Intent(this, FinalizarCompra::class.java)
        startActivity(intent)
    }


}