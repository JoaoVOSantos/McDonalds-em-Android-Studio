package com.example.mcdonalds

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Carrinho : AppCompatActivity() {
    lateinit var TXTQUANTIDADE: TextView
    lateinit var TXTPRECO: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrinho)
        setSupportActionBar(findViewById(R.id.toolbar))

        TXTQUANTIDADE = findViewById(R.id.txtQuantidade)
        TXTPRECO = findViewById(R.id.txtPreco)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    fun IvAdicionar(view: View){
        TXTQUANTIDADE.text = "Quantidade: 2"
        TXTPRECO.text = "Preço: 100,00"
    }

    fun IvSubtrair(view: View){
        TXTQUANTIDADE.text = "Quantidade: 1"
        TXTPRECO.text = "Preço: 50,00"
    }

    fun btnComprar(view: View){
        val intent = Intent(this, Comprar::class.java)
        startActivity(intent)
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
}