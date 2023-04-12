package com.example.prova

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtMes: EditText = findViewById<EditText?>(R.id.plain_text_input)
        val txtDia: EditText = findViewById<EditText>(R.id.plain_text_input2)

        findViewById<Button>(R.id.btnCalcular).setOnClickListener {
            val signo = calcularSigno(txtDia.text.toString().toInt(), txtMes.text.toString().toInt())
            exibirSigno(signo)
        }

    }
    private fun calcularSigno(dia: Int, mes: Int)  : Int {
        val imageView = when {
            (dia >= 21 && mes == 3) || (dia <= 20 && mes == 4) -> R.drawable.aries
            (dia >= 21 && mes == 4) || (dia <= 20 && mes == 5) -> R.drawable.touro
            (dia >= 21 && mes == 5) || (dia <= 20 && mes == 6) -> R.drawable.gemeos
            (dia >= 21 && mes == 6) || (dia <= 21 && mes == 7) -> R.drawable.cancer
            (dia >= 22 && mes == 7) || (dia <= 22 && mes == 8) -> R.drawable.leao
            (dia >= 23 && mes == 8) || (dia <= 22 && mes == 9) -> R.drawable.virgem
            (dia >= 23 && mes == 9) || (dia <= 22 && mes == 10) -> R.drawable.libra
            (dia >= 23 && mes == 10) || (dia <= 21 && mes == 11) -> R.drawable.escorpiao
            (dia >= 22 && mes == 11) || (dia <= 21 && mes == 12) -> R.drawable.sargitario
            (dia >= 22 && mes == 12) || (dia <= 20 && mes == 1) -> R.drawable.capricornio
            (dia >= 21 && mes == 1) || (dia <= 19 && mes == 2) -> R.drawable.aquario
            else -> R.drawable.peixes
        }
        return (imageView)
    }

    private fun exibirSigno(signo: Int) {
        var imgSigno: ImageView = findViewById(R.id.imgSigno)
        imgSigno.setImageResource(signo)
    }

}


