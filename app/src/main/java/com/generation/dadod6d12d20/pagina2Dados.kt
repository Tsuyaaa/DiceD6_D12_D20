package com.generation.dadod6d12d20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class pagina2Dados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2_dados)

        val valor = intent.getIntExtra("Resultado", 0)

        val textResultado = findViewById<TextView>(R.id.resultado)

        val buttonVoltar = findViewById<Button>(R.id.retorno)

        textResultado.text = valor.toString()

        buttonVoltar.setOnClickListener{
            finish()
        }



    }
}