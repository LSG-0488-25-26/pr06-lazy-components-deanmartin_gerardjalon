package com.example.lazycomponents.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import com.example.lazycomponents.model.Monster
import androidx.compose.ui.Modifier
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lazycomponents.nav.Routes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color


@Composable
fun MonsterItem (monster: Monster, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                navController.navigate(Routes.DetailsView.createRoute(monster.index))
            },
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.Gray),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = monster.image),
                contentDescription = monster.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(0.4f)
            )
            Column {
                Text(
                    text = monster.name,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = monster.type,
                    fontSize = 16.sp
                )
            }
        }
    }
}