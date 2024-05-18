package com.enriselle.labo4.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.enriselle.labo4.screens.ChampionsViewModel
import com.enriselle.labo4.screens.DetailScreen
import com.enriselle.labo4.screens.MainScreen
import com.enriselle.labo4.ui.theme.Labo4Theme

sealed class GRAPH(val graph: String) {
    data object MAIN: GRAPH(graph = "MAIN")
}

sealed class MainScreens(val route: String) {
    data object MainScreen: MainScreens(route = "main_screen")
    data object DetailsScreen: MainScreens(route = "details_screen")
}

@Composable
fun RootNavigation(
    viewModel: ChampionsViewModel
) {
    val navController = rememberNavController()
    Labo4Theme {
        NavHost(
            navController = navController,
            route = GRAPH.MAIN.graph,
            startDestination = MainScreens.MainScreen.route
        ) {
            composable(MainScreens.MainScreen.route) {
                MainScreen(
                    viewModel = viewModel,
                    onClick = { navController.navigate(MainScreens.DetailsScreen.route) }
                )
            }

            composable(MainScreens.DetailsScreen.route) {
                DetailScreen(
                    viewModel = viewModel
                )
            }
        }
    }
}