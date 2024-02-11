package com.example.manavata_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.manavata_app.databinding.ActivityMainBinding
import com.example.manavata_app.databinding.ActivitySignInScreenBinding

class SignInScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySignInScreenBinding
    //private lateinit var auth: FirebaseAuth
    private lateinit var email: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //auth = FirebaseAuth.getInstance()
        binding.usernameText.setText("testcase")
        binding.emailText.setText("exampleemail@gmail.com")
        binding.passText.setText("testcase123")

    }
}