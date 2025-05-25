package com.example.mcdonalds

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var email: EditText
    lateinit var senha: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email)
        senha = findViewById(R.id.senha)

    }

    fun btnEntrarTela01(view: View) {
        val txtEmail = email.text.toString()
        val txtSenha = senha.text.toString()
        val RetornoEmail = intent.getStringExtra("email")
        val RetornoSenha = intent.getStringExtra("senha")

        if (txtEmail == RetornoEmail && txtSenha == RetornoSenha) {
            val intent = Intent(this, Principal::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Email ou Senha Incorretos.", Toast.LENGTH_LONG).show()
        }
    }

    fun btnMostrarSenhaEmail(view: View) {
        val RetornoEmail = intent.getStringExtra("email")
        val RetornoSenha = intent.getStringExtra("senha")
        Toast.makeText(this, "Email: "  + RetornoEmail + "\n" + "Senha: " + RetornoSenha, Toast.LENGTH_LONG).show()

    }

    fun txtCriarConta(view: View) {

        val intent = Intent(this, CriarConta::class.java)
        startActivity(intent)

    }






}