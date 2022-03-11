package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain2Binding
import com.example.lista1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*Elabore uma atividade que permita ao usuário informar um número e clicar
        num botão. Quando o botão for clicado, a atividade deverá dizer ao usuário se
        o número é par, ímpar ou zero através de um diálogo.*/

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnex2.setOnClickListener{
            var valor = binding.editnumeroex2.text.toString().toInt()
            if (valor == 0){
            alert("Teste","é Zero",this)
            }
            else if(valor % 2 == 0){
                alert("Teste","é Par",this)
            }
            else{
                alert("Teste","é Impar",this)
            }

        }
    }
}