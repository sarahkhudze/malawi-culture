package com.example.malawi_culture.ui.theme



import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = Purple60,
    tertiary = Purple40,
    background = DarkBackground,
    surface = Purple10,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onTertiary = Color.Black,
    onBackground = Purple90,
    onSurface = Purple90
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = Purple30,
    tertiary = Purple20,
    background = LightBackground,
    surface = Purple95,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Purple10,
    onSurface = Purple10
)

@Composable
fun MalawiCultureTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}