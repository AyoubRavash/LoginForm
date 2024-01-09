package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginMessageActivity : AppCompatActivity() {

    private lateinit var messageTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_message)

        messageTextView = findViewById(R.id.text_view_message)

        val message = intent.getStringExtra("Message")

        messageTextView.text = message
    }
}