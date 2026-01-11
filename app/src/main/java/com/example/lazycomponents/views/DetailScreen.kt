package com.example.lazycomponents.views

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.runtime.remember
import com.example.lazycomponents.viewmodel.getMonsterList
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Button

@Composable
fun DetailScreen(navController: NavController, monster: String, modifier: Modifier = Modifier) {
    val monster = remember(monster) { getMonsterList().find { it.index == monster} }

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(6.dp),
        contentAlignment = Alignment.Center
    ) {
        if (monster != null) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = monster.image),
                    contentDescription = monster.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(280.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = monster.name,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "El tipo es: ${monster.type}",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "El tamaño es: ${monster.size}",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Daño: ${monster.hit}",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "'HitDice': ${monster.hitDice}",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                )
            }

        } else {
            Text(
                text = "Monster no encontrado...",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Button(
            onClick = {navController.popBackStack()},
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text("Voler a la lista")
        }
    }
}
