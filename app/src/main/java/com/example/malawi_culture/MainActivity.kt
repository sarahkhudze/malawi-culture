package com.example.malawi_culture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.example.malawi_culture.ui.navigation.appNavigation
import com.example.malawi_culture.ui.theme.MalawiCultureTheme
import com.example.malawi_culture.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MalawiCultureApp()
        }
    }
}

@Composable
fun MalawiCultureApp() {
    MalawiCultureTheme {
        val systemUiController = rememberSystemUiController()
        val useDarkIcons = !isSystemInDarkTheme() // or use MaterialTheme.colorScheme.isLight

        LaunchedEffect(systemUiController, useDarkIcons) {
            systemUiController.setSystemBarsColor(
                color = Purple40.copy(alpha = 0.9f),
                darkIcons = useDarkIcons
            )
        }

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "home"
            ) {
                appNavigation(navController)
            }
        }
    }
}