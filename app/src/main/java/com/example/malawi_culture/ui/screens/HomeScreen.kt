package com.example.malawi_culture.ui.screens

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.malawi_culture.ui.components.AnimatedButton
import com.example.malawi_culture.ui.theme.Gold
import com.example.malawi_culture.ui.theme.Purple40
import com.example.malawi_culture.ui.theme.Purple50
import kotlinx.coroutines.delay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    var showWelcome by remember { mutableStateOf(false) }
    var showButton by remember { mutableStateOf(false) }

    val welcomeAlpha by animateFloatAsState(
        targetValue = if (showWelcome) 1f else 0f,
        animationSpec = tween(durationMillis = 1000),
        label = "welcomeAlpha"
    )

    val buttonAlpha by animateFloatAsState(
        targetValue = if (showButton) 1f else 0f,
        animationSpec = tween(durationMillis = 800),
        label = "buttonAlpha"
    )

    LaunchedEffect(Unit) {
        delay(500)
        showWelcome = true
        delay(1000)
        showButton = true
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.background,
                        Purple40.copy(alpha = 0.2f),
                        MaterialTheme.colorScheme.background
                    )
                )
            )
    ) {
        // Decorative circles
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(200.dp)
                .clip(MaterialTheme.shapes.large)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Gold.copy(alpha = 0.15f),
                            Color.Transparent
                        )
                    )
                )
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .size(150.dp)
                .clip(MaterialTheme.shapes.large)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(
                            Purple50.copy(alpha = 0.1f),
                            Color.Transparent
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Welcome Text with Animation
            Box(
                modifier = Modifier
                    .alpha(welcomeAlpha)
                    .fillMaxWidth()
                    .padding(bottom = 40.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Welcome to",
                        style = MaterialTheme.typography.displaySmall,
                        color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "The Warm Heart\nof Africa",
                        style = MaterialTheme.typography.displayLarge,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        lineHeight = 40.sp
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    // Decorative line
                    Box(
                        modifier = Modifier
                            .height(4.dp)
                            .fillMaxWidth(0.5f)
                            .clip(MaterialTheme.shapes.small)
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(Purple50, Gold, Purple50)
                                )
                            )
                    )
                }
            }

            // Decorative circle for flag (placeholder)
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .clip(MaterialTheme.shapes.extraLarge)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Purple40, Purple50)
                        )
                    )
                    .padding(24.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "🇲🇼",
                    style = MaterialTheme.typography.displayLarge,
                    fontSize = 60.sp
                )
            }

            Spacer(modifier = Modifier.height(48.dp))

            // Animated Button
            Box(
                modifier = Modifier
                    .alpha(buttonAlpha)
                    .fillMaxWidth()
            ) {
                AnimatedButton(
                    text = "Explore Malawi's Culture",
                    onClick = {
                        navController.navigate("tribes")
                    },
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Subtitle
            Text(
                text = "Discover the rich heritage of Malawi's diverse tribes\nand their unique traditions",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f),
                textAlign = TextAlign.Center,
                lineHeight = 24.sp,
                modifier = Modifier.alpha(buttonAlpha)
            )
        }
    }
}