package com.example.myapplication.sujit

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.sujit.ui.theme.ComposePractTheme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePractTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    val username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Hello Again",
            color = Color.Blue,
            fontSize = 25.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Welcome",
            color = Color.Blue,
            fontSize = 25.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Back",
            color = Color.Blue,
            fontSize = 25.sp,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Normal,
            fontWeight = FontWeight.Bold
        )


        OutlinedTextField(
            value = username.value,
            onValueChange = {
                username.value = it
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "person")
            },
            label = {
                Text(text = "User Name")
            },
            placeholder = {
                Text(text = "Enter UserName")
            },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "")
            },
            label = {
                Text(text = "Password")
            },
            placeholder = {
                Text(text = "Enter Password")
            },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedButton(onClick = { }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Enter")
        }

    }
}
