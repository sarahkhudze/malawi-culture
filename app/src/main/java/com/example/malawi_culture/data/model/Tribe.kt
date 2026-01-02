package com.example.malawi_culture.data.model


import androidx.compose.ui.graphics.painter.Painter

data class Tribe(
    val id: Int,
    val name: String,
    val description: String,
    val region: String,
    val population: String,
    val traditionalFoods: List<String>,
    val dances: List<String>,
    val culturalPractices: List<String>,
    val imageUrl: String,
    val videoUrl: String = ""
)

data class CultureItem(
    val id: Int,
    val title: String,
    val description: String,
    val type: CultureType,
    val imageUrl: String,
    val tribeId: Int
)

enum class CultureType {
    FOOD, DANCE, CEREMONY, ATTIRE, CRAFT
}