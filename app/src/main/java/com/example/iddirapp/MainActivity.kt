package com.example.iddirapp

import com.example.iddirapp.IddirApp // adjust package if needed

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.iddirapp.ui.theme.IddirAppTheme


import androidx.core.view.WindowCompat


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            IddirAppTheme {
                IddirApp() // Your app's composable
            }
        }
    }
}



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
 //       text = "Hello $name!",
  //      modifier = modifier
 //   )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    IddirApp()

//}//