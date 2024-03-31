package com.example.ders2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.Basketball


@Composable
fun ScientistList(scientistList: List <Basketball>) {

}

@Composable
@Preview
        fun ScientistListPreview() {
            ScientistList(scientists)
        }

@Composable
fun ScientistCard(scientist: Basketball, navController: NavController) {
    Column (
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(16.dp),
        )


     {
        Image(painterResource(id = scientist.imageResources),contentDescription = "${scientist.name} img")
        Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(20.dp)) {
            Column {
                Text(scientist.name,style = MaterialTheme.typography.bodyLarge, color= Color.Black)
                Column {
                    for (area in scientist.researchArea) {
                        Text(area, style = MaterialTheme.typography.bodyMedium, color = Color.Green)
                }
            }
        }
            Text(scientist.info,style = MaterialTheme.typography.bodyMedium, color=Color.Black, textAlign = TextAlign.End)
        }
    }

    }
