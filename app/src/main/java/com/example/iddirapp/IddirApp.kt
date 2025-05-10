package com.example.iddirapp

import androidx.compose.foundation.layout.*

import androidx.compose.material3.Scaffold

//import androidx.compose.material.icons.filled.fileupload//
import androidx.compose.ui.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.iddirapp.ui.screens.WelcomeScreen
import com.example.iddirapp.ui.screens.SignUpScreen
import com.example.iddirapp.ui.screens.SignInScreen
import com.example.iddirapp.ui.screens.VerificationScreen
import com.example.iddirapp.ui.theme.IddirAppTheme


@Composable
fun IddirApp() {




                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "welcome") {
                    composable("welcome") { WelcomeScreen(navController) }
                    composable("signup") { SignUpScreen(navController) }
                    composable("signin") { SignInScreen(navController) }
                    composable("verify") { VerificationScreen(navController) }
                }

        }
