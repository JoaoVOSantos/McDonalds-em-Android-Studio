package com.example.mcdonalds

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Perfil : AppCompatActivity() {
    lateinit var TXTURL: EditText
    lateinit var TXTNome: EditText
    lateinit var TXTNumero: EditText
    lateinit var TXTIdade: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
        setSupportActionBar(findViewById(R.id.toolbar))

        TXTURL = findViewById(R.id.txtURL)
        TXTNome = findViewById(R.id.txtNome)
        TXTNumero = findViewById(R.id.txtNumero)
        TXTIdade = findViewById(R.id.txtIdade)

    }

    fun CarregarImagem(view: View){

        var url = TXTURL.text.toString()
        var imgDinamico = findViewById<ImageView>(R.id.imgDinamico)
        Glide.with(this).load(url).into(imgDinamico)
    }

    fun CarregarDados(view: View){
        var txtNome = TXTNome.text.toString()
        var txtNumero = TXTNumero.text.toString()
        var txtIdade = TXTIdade.text.toString()

        val title = AlertDialog.Builder(this)
            .setTitle("Perfil Cadastrado com Sucesso")
            .setMessage("Nome: " + txtNome + "\n" +
                        "Numero: " + txtNumero + "\n" +
                        "Idade: " + txtIdade + "\n" +
                        "Imagem: Adicionada Com sucesso"
            )
            .setPositiveButton("Confirmar"){
                    variavel, opcaoBotao ->

                    val intent = Intent(this, Principal::class.java)
                    startActivity(intent)


            }
            .setNegativeButton("Cancelar"){
                    variavel, opcaoBotao ->

                TXTURL.setText("")
                TXTNome.setText("")
                TXTIdade.setText("")
                TXTNumero.setText("")
            }

            .create()
            .show()
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


}