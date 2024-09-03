package com.example.androidcomposebeginner.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun RowComponent(modifier: Modifier = Modifier) {
    Row (modifier = modifier){
        Text(text = "No")
        Text(text = "Name")
        Text(text = "Age")
    }
}