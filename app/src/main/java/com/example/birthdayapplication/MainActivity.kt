package com.example.birthdayapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.birthdayapplication.ui.theme.BirthdayApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String , modifier: Modifier = Modifier) {
    Text(
        text = message
    )
}

@Preview(showBackground = true , name = "My preview" , showSystemUi = false)
@Composable
fun BirthdayCardPreview() {
    BirthdayApplicationTheme {
        GreetingText(message = "Happy Birthday Shrijan!")
    }
}