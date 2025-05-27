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

class ConfirmarInformacoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmar_informacoes)
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
        }
        return true
    }

    fun btnComprarDeVerdade(view: View){
        val intent = Intent(this, ComprarVerdadeiro::class.java)
        startActivity(intent)
    }
}