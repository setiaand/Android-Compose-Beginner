package com.example.androidcomposebeginner.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(40.dp)
            .background(
                color = Color.Blue,
                shape = RoundedCornerShape(20.dp)
            ),
        contentAlignment = Alignment.BottomEnd
    ) {
       Box(
           modifier = Modifier
               .size(20.dp)
               .background(
                   color = Color.Green,
                   shape = RoundedCornerShape(20.dp)
               )
               .border(
                   width = 1.dp,
                   color = Color.White,
                   shape = RoundedCornerShape(20.dp)
               )
       )
    }
}

@Preview
@Composable
private fun BoxPreview() {
    BoxScreen(modifier = Modifier.padding(24.dp))
}