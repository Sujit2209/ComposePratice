package com.example.myapplication.sujit.Composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RowLayout()
{

    RowLayoutHelper()
}

@Composable
fun RowLayoutHelper()
{
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.run {
            background(Color.Red)
            fillMaxWidth()
            fillMaxSize()
        }
    ) {
        Text(text = "Sujit")
        Text(text = "Fights")
        Text(text = "Tanishka")
    }
}

@Composable
fun ColumnLayoutHelper(){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "Sujit")
        Text(text = "Fights")
        Text(text = "Tanishka")
    }
}

@Composable
fun BoxLayout()
{

    Box(
    ) {
        Text(text = "Sujit", modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "Fights", modifier = Modifier.align(Alignment.Center))
        Text(text = "Tanishka", modifier = Modifier.align(Alignment.CenterEnd))
    }
}
