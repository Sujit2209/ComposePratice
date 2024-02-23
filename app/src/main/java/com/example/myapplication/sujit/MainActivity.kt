package com.example.myapplication.sujit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.sujit.Composables.ButtonLayout
import com.example.myapplication.sujit.Composables.RowLayout
import com.example.myapplication.sujit.Composables.ScaffoldFun
import com.example.myapplication.sujit.Composables.TextViewLayout
import com.example.myapplication.sujit.ui.theme.ComposePractTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePractTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                        ScaffoldFun()
//                        TextViewLayout()
                    ButtonLayout()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        color = MaterialTheme.colorScheme.secondary,
        modifier = modifier.size(20.dp)
    )
}

@Composable
fun SwitchFun()
{
    val isChecked = remember {
        mutableStateOf(true)
    }
    Switch(
        checked = isChecked.value,
        onCheckedChange = {
            isChecked.value = it
        },
        modifier = Modifier.run {
            size(20.dp)
            padding(10.dp)
        }
    )
}

@Preview(showBackground = true, name = "light mode")
@Preview(showBackground = true, name = "dark mode")

@Composable
fun GreetingPreview() {
    ComposePractTheme {
        Greeting("Android")
    }
}