package com.example.mcdonalds

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
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
            R.id.btnPerfil -> {
                val intent = Intent(this, Perfil::class.java)
                startActivity(intent)
            }

        }
        return true
    }


}