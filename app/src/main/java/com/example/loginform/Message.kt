package com.example.loginform

import java.io.Serializable

data class Message(
    val firstName: String,
    val lastName: String,
    val age: String,
    val email: String,
    val password: String
): Serializable {
}