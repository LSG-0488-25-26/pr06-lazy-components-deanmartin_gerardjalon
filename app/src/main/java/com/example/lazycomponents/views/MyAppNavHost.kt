package com.example.lazycomponents.views
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.lazycomponents.nav.Routes

@Composable
fun MyAppNavHost(modifier: Modifier, navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.ListView.route
    ) {
        composable(Routes.ListView.route) {
            ListView(modifier, navController)
        }

        composable(
            Routes.DetailsView.route,
            arguments = listOf(
                navArgument("pokemonName") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            DetailScreen(
                navController,
                backStackEntry.arguments?.getString("pokemonName").orEmpty(),
                modifier
            )
        }
    }
}