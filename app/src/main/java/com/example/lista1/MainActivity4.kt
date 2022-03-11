package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain3Binding
import com.example.lista1.databinding.ActivityMain4Binding
/*Implemente uma atividade capaz de realizar o cálculo de área de um triangulo
escaleno. A atividade deve conter todos os campos de coleta de informação
necessários (usando EditTexts) e um botão para efetuar o cálculo. O botão
deverá exibir o valor num diálogo.*/

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnex4.setOnClickListener{
            var b = binding.editBase.text.toString().toInt()
            var h = binding.editAltura.text.toString().toInt()

            var area = (b * h)/2
            alert("Calculo da area","${area.toString()}",this
            )
        }


    }
}

