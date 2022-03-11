package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain2Binding
import com.example.lista1.databinding.ActivityMain3Binding

/*Monte uma atividade com os campos de texto “valor1”, “valor2” e “resultado”
e os botões “somar”, “subtrair”, “multiplicar” e “dividir”. Implemente as
operações de cada um dos botões efetuando a operação respectiva com os
valores em “valor1” e “valor2” e exiba o resultado na caixa “resultado”.
*/
class MainActivity3 : AppCompatActivity() {
    lateinit var binding : ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsomar.setOnClickListener{
            var valor1 = binding.editValor1ex3.text.toString().toInt()
            var valor2 = binding.editValor2ex3.text.toString().toInt()
            var soma = valor1 + valor2
            binding.editResultadoex3.setText(soma.toString())
        }
        binding.btnsubtrair.setOnClickListener{
            var valor1 = binding.editValor1ex3.text.toString().toInt()
            var valor2 = binding.editValor2ex3.text.toString().toInt()
            var sub = valor1 - valor2
            binding.editResultadoex3.setText(sub.toString())
        }
        binding.btndividir.setOnClickListener{
            var valor1 = binding.editValor1ex3.text.toString().toInt()
            var valor2 = binding.editValor2ex3.text.toString().toInt()
            var div = valor1 / valor2
            binding.editResultadoex3.setText(div.toString())
        }
        binding.btnmulti.setOnClickListener{
            var valor1 = binding.editValor1ex3.text.toString().toInt()
            var valor2 = binding.editValor2ex3.text.toString().toInt()
            var multi = valor1 * valor2
            binding.editResultadoex3.setText(multi.toString())
        }

    }
}