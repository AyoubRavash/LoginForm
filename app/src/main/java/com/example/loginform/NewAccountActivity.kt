package com.example.loginform

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.google.android.material.textfield.TextInputEditText

class NewAccountActivity : AppCompatActivity() {

    private lateinit var firstNameEditText: TextInputEditText
    private lateinit var lastNameEditText: TextInputEditText
    private lateinit var ageSpinner: Spinner
    private lateinit var emailEditText: TextInputEditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var newAccButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_account)

        findViews()

        val spinnerArray = arrayOf("Over 25", "18 to 25", "15 to 18", "Under 15")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerArray)
        ageSpinner.adapter = spinnerAdapter

        newAccButton.setOnClickListener {
            setupButton()
        }
    }

    private fun findViews() {
        firstNameEditText = findViewById(R.id.edit_text_first_name)
        lastNameEditText = findViewById(R.id.edit_text_last_name)
        ageSpinner = findViewById(R.id.spinner_age)
        emailEditText = findViewById(R.id.edit_text_email)
        passwordEditText = findViewById(R.id.edit_text_password)
        newAccButton = findViewById(R.id.button_create_new_acc)
    }

    private fun setupButton() {

        val message = Message(
            firstNameEditText.text.toString(),
            lastNameEditText.text.toString(),
            ageSpinner.selectedItem.toString(),
            emailEditText.text.toString(),
            passwordEditText.text.toString()
        )

        val newAccIntent = Intent(this, AccInfoActivity::class.java)
        newAccIntent.putExtra("Message", message)
        startActivity(newAccIntent)
    }

}