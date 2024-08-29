package com.example.androidcomposebeginner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidcomposebeginner.ui.theme.AndroidComposeBeginnerTheme

class RowActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidComposeBeginnerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RowComponent(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun RowComponent(modifier: Modifier = Modifier) {
    Row (modifier = modifier){
        Text(text = "No")
        Text(text = "Name")
        Text(text = "Age")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    AndroidComposeBeginnerTheme {
        RowComponent(modifier = Modifier.fillMaxSize())
    }
}