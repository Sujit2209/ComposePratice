package com.example.myapplication.sujit.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.sujit.R

@Composable
fun ImageLayout()
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        
        Image(painter = painterResource(id = R.drawable.image),
            contentDescription = "image",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape),
            alignment = Alignment.BottomCenter
        )
        
        Image(imageVector = Icons.Default.Home,
            contentDescription = "Home Button",
            modifier = Modifier.size(200.dp)
            )
    }
}
