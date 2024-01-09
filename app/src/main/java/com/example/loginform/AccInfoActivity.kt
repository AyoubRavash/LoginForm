package com.example.loginform

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AccInfoActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var passwordTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acc_info)

        helloTextView = findViewById(R.id.text_view_Hello)
        nameTextView = findViewById(R.id.text_view_acc_name)
        emailTextView = findViewById(R.id.text_view_acc_email)
        passwordTextView = findViewById(R.id.text_view_acc_password)

        @Suppress("DEPRECATION")
        val message = intent.getSerializableExtra("Message") as Message

        displayMessage(message)

        emailTextView.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto: ${message.email}")
            }
            startActivity(intent)
        }
    }

    private fun displayMessage(message: Message) {

        helloTextView.text = """
            Hello ${message.firstName} ${message.lastName}
            Here is your account INFO :
        """.trimIndent()
        nameTextView.text = """
            First name = ${message.firstName}
            Last name : ${message.lastName}
        """.trimIndent()
        emailTextView.text = "Email address : ${message.email}"
        passwordTextView.text = "Password : ${message.password}"

    }
}