package com.enriselle.labo4.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.enriselle.labo4.ui.theme.Labo4Theme
import com.enriselle.labo4.utils.ChampionInformation
import com.enriselle.labo4.utils.ChampionSprite

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ChampionCard(champion: ChampionInformation, onClick: () -> Unit) {

ElevatedCard (
    modifier = Modifier
        .fillMaxWidth(),
    elevation =  CardDefaults.cardElevation(
        defaultElevation = 2.dp
    ),
onClick = {onClick()}
){
    Row {
        AsyncImage(model = champion.image.sprite, contentDescription = null)
        Column (
            modifier = Modifier
                .padding(8.dp)
            ){
                Text(text = champion.name)
            Text(text = champion.title, 
                modifier = Modifier
                .padding(bottom = 8.dp)
            )}
LazyRow {
    itemsIndexed(champion.tags.toList())
    {index, tag ->
        Card(
            modifier= Modifier 
                .padding(start = 8.dp)
        ){
            Text(text = tag)
        }
                 }
            }
        }
    }
}
