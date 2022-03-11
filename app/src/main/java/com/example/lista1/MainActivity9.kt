package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain9Binding
/*Construa uma atividade que permita que o usuário informe um email, um
assunto e uma mensagem. Também deve haver um botão que, quando clicado,
valide se o email contém um @ e se o assunto e a mensagem contêm valores.
Caso exista algum problema, informar ao usuário por meio de diálogos. Caso
tudo esteja correto, exibir “A mensagem foi enviada”*/
class MainActivity9 : AppCompatActivity() {
    lateinit var binding : ActivityMain9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain9Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}