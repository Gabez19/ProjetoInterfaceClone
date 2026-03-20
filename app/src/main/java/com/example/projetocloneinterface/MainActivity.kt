package com.example.projetocloneinterface

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.projetocloneinterface.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewErro.visibility = View.GONE

        binding.buttonEntrar.setOnClickListener {
            val usuario = binding.editTextUsuario.text.toString()
            val senha = binding.editTextSenha.text.toString()

            if (usuario.isEmpty() || senha.isEmpty()) {
                binding.textViewErro.visibility = View.VISIBLE
                binding.textViewErro.text = "Preencha todos os campos"
            } else if (usuario == "admin" && senha == "123") {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("USUARIO", usuario)
                startActivity(intent)
            } else {
                binding.textViewErro.visibility = View.VISIBLE
                binding.textViewErro.text = "Usuário ou senha inválidos"
            }

        }

        binding.buttonCadastrar.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        binding.textViewEsqueceuSenha.setOnClickListener {
            val intent = Intent(this, RecuperarSenhaActivity::class.java)
            startActivity(intent)
        }
    }
}