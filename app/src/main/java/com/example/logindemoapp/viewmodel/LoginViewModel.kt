package com.example.logindemoapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf


class LoginViewModel : ViewModel() {
    var email = mutableStateOf("")
    var password = mutableStateOf("")
    var loginSuccess = mutableStateOf(false)
    var errorMessage = mutableStateOf("")

    fun onLoginClick() {
        if (email.value.isEmpty() || password.value.isEmpty()) {
            errorMessage.value = "Email and password cannot be empty"
        } else if (email.value == "test@example.com" && password.value == "1234") {
            loginSuccess.value = true
            errorMessage.value = ""
        } else {
            errorMessage.value = "Invalid credentials"
        }
    }
}