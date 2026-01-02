package com.example.malawi_culture.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Celebration
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Handyman
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.malawi_culture.data.model.CultureItem
import com.example.malawi_culture.data.model.CultureType
import com.example.malawi_culture.ui.theme.Purple50

@Composable
fun CultureCard(
    cultureItem: CultureItem,
    modifier: Modifier = Modifier
) {
    var isHovered by remember { mutableStateOf(false) }
    val scale by animateFloatAsState(
        targetValue = if (isHovered) 1.01f else 1f,
        animationSpec = tween(durationMillis = 200),
        label = "cultureCardScale"
    )

    Card(
        modifier = modifier
            .fillMaxWidth()
            .scale(scale),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = if (isHovered) 6.dp else 3.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Title with icon
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Icon based on type (exhaustive)
                val icon = when (cultureItem.type) {
                    CultureType.FOOD -> Icons.Default.Fastfood
                    CultureType.DANCE -> Icons.Default.MusicNote
                    CultureType.CEREMONY -> Icons.Default.Celebration
                    CultureType.ATTIRE -> Icons.Default.Celebration // replace with appropriate icon
                    CultureType.CRAFT -> Icons.Default.Handyman // replace with appropriate icon
                }

                val iconColor = when (cultureItem.type) {
                    CultureType.FOOD -> Color(0xFF4CAF50)
                    CultureType.DANCE -> Color(0xFF2196F3)
                    CultureType.CEREMONY -> Purple50
                    CultureType.ATTIRE -> Color(0xFFFF9800) // example color
                    CultureType.CRAFT -> Color(0xFF9C27B0)  // example color
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(iconColor.copy(alpha = 0.1f))
                        .padding(10.dp)
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = cultureItem.type.toString(),
                        tint = iconColor,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Text(
                    text = cultureItem.title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Description
            Text(
                text = cultureItem.description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f),
                lineHeight = MaterialTheme.typography.bodyMedium.lineHeight * 1.2
            )
        }
    }
}
