package com.example.iddirapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*  // Correct import for Material3 components
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun VerificationScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Text component from Material3
        Text("Verification", style = MaterialTheme.typography.bodyLarge)

        Text("Enter the code admin sent you through: +251900000000")
        Row {
            repeat(6) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.width(40.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
            }
        }

        Text("Resend the code?")

        Button(onClick = { /* handle submit */ }) {
            Text("Submit")
        }
    }
}



