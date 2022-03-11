package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain6Binding
import com.example.lista1.databinding.ActivityMain7Binding
/*Componha uma atividade capaz de coletar do usuário nome, telefone, email e
link do instagram. A atividade deve utilizar as caixas de texto nos formatos
corretos para cada campo, de acordo com o tipo do dado em questão. Também
deve haver um botão que, quando clicado, exiba os dados coletados num
diálogo.*/
class MainActivity7 : AppCompatActivity() {
    lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}