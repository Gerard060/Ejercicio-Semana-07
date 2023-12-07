package com.example.ejercicio2

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : Fragment(R.layout.activity_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tilUsername: TextInputLayout = view.findViewById(R.id.tilUsername)
        val tilEmail: TextInputLayout = view.findViewById(R.id.tilEmail)
        val tilPassword: TextInputLayout = view.findViewById(R.id.tilPassword)
        val etUsername: TextInputEditText = view.findViewById(R.id.etUsername)
        val etEmail: TextInputEditText = view.findViewById(R.id.etEmail)
        val etPassword: TextInputEditText = view.findViewById(R.id.etPassword)
        val btnRegister: MaterialButton = view.findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val username = etUsername.text.toString()
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (validateInput(username, email, password)) {
                // Realiza acciones de registro aquí
                Toast.makeText(
                    requireContext(),
                    "Usuario registrado:\nUsername: $username\nEmail: $email\nPassword: $password",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun validateInput(username: String, email: String, password: String): Boolean {
        // Agrega tu lógica de validación aquí
        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(requireContext(), "Todos los campos son requeridos", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }
}
