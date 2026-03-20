package com.example.projetocloneinterface

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projetocloneinterface.databinding.ActivityRecuperarSenhaBinding
class RecuperarSenhaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecuperarSenhaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecuperarSenhaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRedefinirSenha.setOnClickListener {
            val email = binding.editTextEmailRecSen.text.toString()

            if(email.isEmpty()) {
                binding.textInputLayoutEmailRecSen.error = "Digite seu email"
            } else {
                binding.textInputLayoutEmailRecSen.error = null
                Toast.makeText(this, "Email enviado!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textViewVoltar.setOnClickListener {
            finish()
        }
    }
}