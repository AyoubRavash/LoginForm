package com.example.loginform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AccInfoActivity : AppCompatActivity() {

    private lateinit var messageTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acc_info)

        messageTextView = findViewById(R.id.text_view_message)

        @Suppress("DEPRECATION")
        val message = intent.getSerializableExtra("Message") as Message


        val welcomeMessage = displayMessage(message)

        messageTextView.text = welcomeMessage
    }

    private fun displayMessage(message: Message): String {
        val welcomeMessage = """
                Hello ${message.firstName} ${message.lastName}
                
                Here is your account info :
                
                First name : ${message.firstName}
                Last name : ${message.lastName}
                Age : ${message.age}
                Email Address : ${message.email}
                Password : ${message.password}
                
                See you later...!
            """.trimIndent()

        return welcomeMessage
    }
}