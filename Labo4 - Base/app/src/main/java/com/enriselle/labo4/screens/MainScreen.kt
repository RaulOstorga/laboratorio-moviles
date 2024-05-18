package com.enriselle.labo4.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.enriselle.labo4.ui.components.ChampionCard
import com.enriselle.labo4.ui.theme.Labo4Theme

@Composable
fun MainScreen(
    viewModel: ChampionsViewModel,
    onClick: () -> Unit
) {
    val listChampions = viewModel.listChampions.collectAsState()
    val isLoading = viewModel.isLoading.collectAsState()

    Labo4Theme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { viewModel.fetchData() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
                ) {
                    Text(text = "Traer los champs")
                }
            }
            if (isLoading.value) {
                Box(
                    modifier = Modifier
                        .weight(1f).padding(6.dp)
                ) {
                    CircularProgressIndicator()
                }
            } else {
                when {
                    listChampions.value.isEmpty() -> {
                        Box(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(text = "No hay campeones papi, metale al lol")
                        }
                    }

                    else -> {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(1f),
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(listChampions.value) { champ ->
                                ChampionCard(champion = champ) {
                                    viewModel.saveDataFromSelectedChampion(champ)
                                    onClick()
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
