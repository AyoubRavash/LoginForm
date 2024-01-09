package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var emailEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var loginButton: Button
    private lateinit var newAccButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViews()

        loginButton.setOnClickListener {
            setupLoginButton()
        }

        newAccButton.setOnClickListener {
            setupNewAccButton()
        }
    }

    private fun findViews() {
        emailEditText = findViewById(R.id.edit_text_email)
        passwordEditText = findViewById(R.id.edit_text_password)
        loginButton = findViewById(R.id.button_login)
        newAccButton = findViewById(R.id.button_new_acc)
    }

    private fun setupLoginButton() {

        val message = getString(R.string.welcome_back)

        val loginIntent = Intent(this, LoginMessageActivity::class.java)
        loginIntent.putExtra("Message", message)
        startActivity(loginIntent)
    }

    private fun setupNewAccButton() {
        val newAccIntent = Intent(this, NewAccountActivity::class.java)
        startActivity(newAccIntent)
    }
}