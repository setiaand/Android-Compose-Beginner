package com.example.androidcomposebeginner.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SpacerScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Action")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Prasetya")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun SpaceScreenPreview() {
    SpacerScreen(modifier = Modifier.fillMaxSize())

}