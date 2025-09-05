package com.example.myapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela02 : AppCompatActivity() {
    private lateinit var btnVoltar: Button
    private lateinit var btnProximaTela: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela01)


        btnVoltar = findViewById(R.id.btnVoltar)

        /*Esse Código aqui deve ser colocado nos eventos dos botões cuja intenção é retornar ao menu principal, do layout associado a MainActivity. */
        btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        @SuppressLint("MissingInflatedId")
        btnProximaTela = findViewById(R.id.btnProximaTela) // Make sure this ID exists in your layout
        btnProximaTela.setOnClickListener {
            val intent = Intent(this, Tela02::class.java) // Replace Tela02 with your actual next activity
            startActivity(intent)
        }
    }
}