package com.generation.dadod6d12d20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRolar = findViewById<Button>(R.id.RolarDado)



        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD6.setOnClickListener{
            buttonRolar.setOnClickListener{
                RolarDados(lados = 6)
            }
        }

        val buttonD12 = findViewById<Button>(R.id.buttond12)

        buttonD12.setOnClickListener{
            buttonRolar.setOnClickListener{
                RolarDados(lados = 12)
            }
    }

        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        buttonD20.setOnClickListener{
            buttonRolar.setOnClickListener{
                RolarDados(lados = 20)
            }
        }



}

    private fun RolarDados(lados: Int) {
        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textDado)
        textResultado.text = valor.toString()
    }


}
