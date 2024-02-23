package com.example.myapplication.sujit.Composables

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
//import java.lang.reflect.Modifier
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

@Composable
fun ButtonLayout()
{
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        Column() {
            Button(
                onClick = {
                    Toast.makeText(context, "This is a Button", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                enabled = true,
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                border = BorderStroke(2.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text(text = "Button")
            }

            OutlinedButton(onClick = { /*TODO*/ }) {

                Text(text = "Outlined Button")
            }
            TextButton(onClick = { /*TODO*/ }) {

                Text(text = "Text Button")

            }
        }
    }
}