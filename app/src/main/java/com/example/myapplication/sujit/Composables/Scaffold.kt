package com.example.myapplication.sujit.Composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldFun(){

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Hello")
                        },
                navigationIcon = {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                },
                actions = {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "")
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "")
                }

            )
        },
        modifier = Modifier
            .fillMaxSize(),
        contentColor = Color.Black,
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(imageVector = Icons.Default.Add, contentDescription ="" )
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) {
    }
}