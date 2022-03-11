package com.example.lista1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lista1.databinding.ActivityMain4Binding
import com.example.lista1.databinding.ActivityMain5Binding

/*. Elabore uma atividade capaz de realizar a conversão de metros para pés. A
atividade deve conter todos os campos de entrada de informação necessários
(usando EditTexts) e um botão que, quando clicado, exibirá o resultado num
diálogo.
*/

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnex5.setOnClickListener{
            var metros = binding.editmetros.text.toString().toFloat()
            var pes = metros * 3.2808
            alert("Metros para pés","${metros} em pés é ${pes}",this)

        }

    }
}