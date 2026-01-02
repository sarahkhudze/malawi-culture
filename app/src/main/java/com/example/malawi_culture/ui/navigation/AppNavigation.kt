package com.example.malawi_culture.ui.navigation



import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.malawi_culture.ui.screens.HomeScreen
import com.example.malawi_culture.ui.screens.TribeDetailScreen
import com.example.malawi_culture.ui.screens.TribesScreen

fun NavGraphBuilder.appNavigation(
    navController: NavController
) {
    composable("home") {
        HomeScreen(navController = navController)
    }

    composable("tribes") {
        TribesScreen(navController = navController)
    }

    composable(
        route = "tribe/{tribeId}",
        arguments = listOf(
            navArgument("tribeId") {
                type = NavType.IntType
            }
        )
    ) { backStackEntry ->
        val tribeId = backStackEntry.arguments?.getInt("tribeId")
        TribeDetailScreen(
            navController = navController,
            tribeId = tribeId
        )
    }
}