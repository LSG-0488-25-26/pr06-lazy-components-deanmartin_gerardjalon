package com.example.lazycomponents.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lazycomponents.viewmodel.getMonsterList
import com.example.lazycomponents.views.support.DetailRow
@Composable
fun DetailScreen(navController: NavController, monsterId: String, modifier: Modifier = Modifier) {
    val monster = remember(monsterId) { getMonsterList().find { it.index == monsterId } }

    if (monster != null) {
        Box(modifier = modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = monster.image),
                    contentDescription = monster.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(300.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = monster.name,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        DetailRow("Tipo", monster.type)
                        DetailRow("Tamaño", monster.size)
                        DetailRow("Daño", (monster.hit).toString())
                        DetailRow("Hit Dice", monster.hitDice)
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
            }
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(16.dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Volver",
                    tint = Color.Black,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    } else {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Monstruo no encontrado...",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
