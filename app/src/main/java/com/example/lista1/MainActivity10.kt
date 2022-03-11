package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain10Binding
/*Monte uma atividade que permita que o usuário tente adivinhar um
determinado número, de 1 a 10, gerado aleatoriamente. O programa deve falar
se o número chutado é maior ou menor que o número sorteado a cada palpite e
dizer quantos palpites foram necessários para acertar. Os palpites devem ser
feitos via caixa de texto (EditText) e botão. As mensagens com o usuário devem
ser exibidas via diálogo.*/
class MainActivity10 : AppCompatActivity() {
    lateinit var binding : ActivityMain10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain10Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var random = (1..10).random()
        var vezes = 0


    }
}