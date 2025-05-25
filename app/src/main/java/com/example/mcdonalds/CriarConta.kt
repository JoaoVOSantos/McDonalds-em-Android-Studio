package com.example.mcdonalds

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CriarConta : AppCompatActivity() {
    lateinit var TXTEMAIL : EditText
    lateinit var TXTSENHA : EditText
    lateinit var TXTCONFIRMASENHA : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_conta)

        TXTEMAIL = findViewById(R.id.txtEmail)
        TXTSENHA = findViewById(R.id.txtSenha)
        TXTCONFIRMASENHA = findViewById(R.id.txtConfirmaSenha)


    }

    fun btnEntrar(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    fun btnCriarConta(view: View) {
        var txtEmail = TXTEMAIL.text.toString()
        var txtSenha = TXTSENHA.text.toString()
        var txtConformaSenha = TXTCONFIRMASENHA.text.toString()

        if(txtSenha != txtConformaSenha){
            Toast.makeText(this, "As Senhas não Bate", Toast.LENGTH_LONG).show()
            TXTSENHA.setText("")
            TXTCONFIRMASENHA.setText("")
        }else{

            val title = AlertDialog.Builder(this)
                .setTitle("Conta Cadastrada com Sucesso")
                .setMessage("Email: " + txtEmail + "\n" +
                            "Senha: " + txtSenha
                )
                .setPositiveButton("ENTRAR"){
                        variavel, opcaoBotao ->

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)


                    intent.putExtra("email", TXTEMAIL.text.toString())
                    intent.putExtra("senha", TXTSENHA.text.toString())
                    startActivity(intent)
                }
                .create()
                .show()


        }



    }
}