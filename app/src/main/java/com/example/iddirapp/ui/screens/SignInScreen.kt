package com.example.iddirapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.* // Use material3 imports
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SignInScreen(navController: NavController) {
    Column(modifier = Modifier.padding(24.dp)) {
        Text("Sign In", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Phone Number") })
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Password") }, visualTransformation = PasswordVisualTransformation())

        Button(onClick = { /* login logic */ }) {
            Text("Login")
        }
    }
}

