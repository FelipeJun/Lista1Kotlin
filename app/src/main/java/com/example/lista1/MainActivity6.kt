package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain6Binding
/*Elabore uma atividade capaz de realizar a conversão de graus Fahrenheit para
Kelvin. A atividade deve conter todos os campos de entrada de informação
necessários (usando EditTexts) e um botão que, quando clicado, exibirá o
resultado numa TextView na página.*/
class MainActivity6 : AppCompatActivity() {
    lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnex6.setOnClickListener{
            var fahre = binding.editFahre.text.toString().toFloat()
            var kelvin = (fahre + 459.67) * 0.55
            binding.textViewKelvin.text = kelvin.toString()
        }
    }
}