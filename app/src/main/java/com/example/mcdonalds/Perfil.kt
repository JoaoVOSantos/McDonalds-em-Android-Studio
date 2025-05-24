package com.example.mcdonalds

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Perfil : AppCompatActivity() {
    lateinit var txtURL: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

    }
    fun CarregarImagem(view: View){
        txtURL = findViewById(R.id.txtURL)
        var url = txtURL.text.toString()
        var imgDinamico = findViewById<ImageView>(R.id.imgDinamico)
        Glide.with(this).load(url).into(imgDinamico)
    }

}