package com.example.mcdonalds

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Historico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico)
        setSupportActionBar(findViewById(R.id.toolbar))

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
            R.id.btnToolbarHistorico -> {
                val intent = Intent(this, Historico::class.java)
                startActivity(intent)
            }
        }
        return true
    }

    fun btnSobre(view: View){
        val intent = Intent(this, Sobre::class.java)
        startActivity(intent)
    }

}