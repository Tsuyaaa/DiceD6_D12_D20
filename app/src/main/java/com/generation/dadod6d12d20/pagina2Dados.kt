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

        val reRoll = intent.getIntExtra("LADOS", 0)

        val dado = intent.getStringExtra("Titulo Resultado")

        val textResultado = findViewById<TextView>(R.id.resultado)

        val buttonVoltar = findViewById<Button>(R.id.retorno)

        val textResult = findViewById<TextView>(R.id.tituloResult)

        val buttonReroll = findViewById<Button>(R.id.reRoll)

        textResult.text = dado.toString()
        textResultado.text = valor.toString()

        buttonReroll.setOnClickListener{
            val valor = RolarDados(reRoll)
        }

        buttonVoltar.setOnClickListener{
            finish()
        }



    }

    private fun RolarDados(lados: Int) {
        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.resultado)
        textResultado.text = valor.toString()
       }
}