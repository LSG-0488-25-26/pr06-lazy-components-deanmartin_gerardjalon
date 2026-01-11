package com.example.lazycomponents.nav

import com.example.lazycomponents.model.Monster

sealed class Routes(val route: String) {
    object ListView : Routes("ListView")

    object DetailsView : Routes("DetailsView/{monsterId}") {
        fun createRoute(monsterIndex: String) = "DetailsView/$monsterIndex"
    }
}