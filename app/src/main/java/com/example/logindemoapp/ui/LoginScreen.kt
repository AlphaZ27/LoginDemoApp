package com.example.logindemoapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.logindemoapp.viewmodel.LoginViewModel

@Composable
fun LoginScreen(viewModel: LoginViewModel = viewModel()) {

    val email by viewModel.email
    val password by viewModel.password
    val error by viewModel.errorMessage
    val success by viewModel.loginSuccess

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally)
        {

            Spacer(modifier = Modifier.height(64.dp))

            TextField(
                value = email,
                onValueChange = { viewModel.email.value = it },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = password,
                onValueChange = { viewModel.password.value = it },
                label = { Text(text = "Password") },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
            )

            Button(onClick = { viewModel.onLoginClick() },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Login")
            }

            if(error.isNotEmpty()) {
                Text(error, color = MaterialTheme.colorScheme.error)
            }

            if(success) {
                Text("Login Successful", color = MaterialTheme.colorScheme.primary)
            }
        }
    }
}