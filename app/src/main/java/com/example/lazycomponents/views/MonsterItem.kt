package com.example.lazycomponents.views

import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import com.example.lazycomponents.model.Monster
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun MonsterItem (monster: Monster, onSelectedItem: (String) -> Unit) {
    Card(modifier = Modifier
            .fillMaxWidth()
            .clickable { onSelectedItem(monster.index) }
    ) {
        Row {
            Image(
                painter = painterResource(id = monster.image),
                contentDescription = monster.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxHeight()
            )
            Column {
                Text(
                    text = monster.name,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = monster.type
                )
            }
        }
    }
}