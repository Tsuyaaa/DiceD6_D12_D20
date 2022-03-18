package com.generation.dadod6d12d20

import android.content.Intent
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
        val buttonD12 = findViewById<Button>(R.id.buttond12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        val intentDados = Intent(this, pagina2Dados::class.java)

        buttonD6.setOnClickListener{
            buttonRolar.setOnClickListener{
                val valor = RolarDados(lados = 6)
                intentDados.putExtra("Resultado", valor)
                intentDados.putExtra("Titulo Resultado", "D6")

                startActivity(intentDados)
            }
        }

        buttonD12.setOnClickListener{
            buttonRolar.setOnClickListener{
                val valor = RolarDados(lados = 12)
                intentDados.putExtra("Resultado", valor)
                intentDados.putExtra("Titulo Resultado", "D12")

                startActivity(intentDados)
            }
    }

        buttonD20.setOnClickListener{
            buttonRolar.setOnClickListener{
                val valor = RolarDados(lados = 20)
                intentDados.putExtra("Resultado", valor)
                intentDados.putExtra("Titulo Resultado", "D20")

                startActivity(intentDados)
            }
        }

}

    private fun RolarDados(lados: Int): Int {
        val valor = (1..lados).random()

        return valor

    }


}
