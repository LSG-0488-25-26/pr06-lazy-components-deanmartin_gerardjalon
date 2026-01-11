package com.example.lazycomponents.views
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                // Per si de cas el nom del pokémon és buit, li passarem una cadena de caràcters buida al cridar la view
                backStackEntry.arguments?.getString("pokemonName").orEmpty(),
                modifier
            )
        }
    }
}