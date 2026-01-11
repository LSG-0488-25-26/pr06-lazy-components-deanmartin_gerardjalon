package com.example.lazycomponents.views

import android.widget.ListView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxHeight
import com.example.lazycomponents.viewmodel.getMonsterList
import androidx.compose.foundation.lazy.items
import com.example.lazycomponents.model.Monster
import com.example.lazycomponents.nav.Routes

@Composable
fun ListView (modifier: Modifier, navController: NavController) {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .padding(vertical = 30.dp)
            .fillMaxHeight()
    ) {
        items(getMonsterList()){ Monster ->
            MonsterItem (monster = Monster){
                navController.navigate(Routes.DetailScreen.createRoute(Monster.index))
            }
        }
    }
}