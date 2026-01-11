package com.example.lazycomponents.views

import android.widget.ListView
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import com.example.lazycomponents.viewmodel.getMonsterList
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.lazycomponents.R



@Composable
fun ListView (modifier: Modifier, navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.hellfire_club_logo),
        contentDescription = "Logo del juego de DND",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(300.dp)
    )
    LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier
            .padding(vertical = 30.dp)
            .fillMaxHeight()
    ) {
        items(getMonsterList()) { monster ->
            MonsterItem(monster = monster, navController = navController)
        }
    }
}