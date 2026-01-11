package com.example.lazycomponents.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lazycomponents.R
import com.example.lazycomponents.viewmodel.getMonsterList


@Composable
fun ListView (modifier: Modifier, navController: NavController) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.hellfire_club_logo),
            contentDescription = "Logo del juego de DND",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp)
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(getMonsterList()) { monster ->
                MonsterItem(monster = monster, navController = navController)
            }
        }
    }
}