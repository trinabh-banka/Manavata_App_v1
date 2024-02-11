package com.example.manavata_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.manavata_app.databinding.ActivitySignUpScreenBinding
import com.google.firebase.auth.FirebaseAuth


class SignUpScreen : AppCompatActivity() {
    private lateinit var binding:ActivitySignUpScreenBinding
    private lateinit var auth: FirebaseAuth
    private var signUpEmail
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpScreenBinding.inflate(layoutInflater)
        auth = FirebaseAuth.getInstance()

        binding.registerbuttonSignUpActivity.setOnClickListener(View.OnClickListener {
              = binding.email.getText
        })
        setContentView(binding.root)
    }
}