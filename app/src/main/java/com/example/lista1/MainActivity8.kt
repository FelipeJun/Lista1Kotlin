package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain8Binding
/*Elabore uma atividade que permita ao usuário informar nome de usuário e
senha. A atividade deve ter também um botão que, quando clicado, informe ao
usuário caso os dados não estejam preenchidos. Caso os dados estejam
preenchidos, a atividade deve comparar os valores de usuário e senha com
uma predefinição (a sua escolha) e, caso os valores estejam corretos, exibir
uma mensagem de “Login efetuado”. Caso os dados não correspondam, exibir
uma mensagem de acordo. Todas as mensagens devem ser exibidas via
diálogos.*/
class MainActivity8 : AppCompatActivity() {
    lateinit var binding : ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val login = "Teste"
        val senha = "321"
        binding.btnex8.setOnClickListener{
            var loginU = binding.editnomeex8.text.toString()
            var senhaU = binding.editSenhaex8.text.toString()
            if(loginU == login && senhaU == senha){
                alert("Login","Login feito com sucesso!",this)
            }
            else{
                alert("Login","Login invalido!",this)
            }
        }
    }
}