package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*Componha uma atividade com dois campos de texto (nome e sobrenome) e um
        botão (exibir). Ao clicar no botão, exiba uma mensagem de diálogo com título
        “Bem-vindo” e a mensagem “Olá, nome + sobrenome!”.*/
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnex1.setOnClickListener {
            alert("Bem Vindo","Olá, ${binding.editNome1.text} ${binding.editSobrenome1.text}!",this)
        }


    }
}