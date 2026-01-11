package com.example.lazycomponents.nav

import com.example.lazycomponents.model.Monster

sealed class Routes(val route: String) {
    object ListView : Routes("ListView")

    object DetailsView : Routes("DetailsScreen/{monsterId}") {
        fun createRoute(monsterIndex: String) = "DetailsScreen/$monsterIndex"
    }
}