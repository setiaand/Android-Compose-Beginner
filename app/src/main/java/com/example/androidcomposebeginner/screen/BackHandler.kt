package com.example.androidcomposebeginner.screen

import androidx.activity.compose.BackHandler
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BackHandlerScreen(modifier: Modifier = Modifier) {
    var isBackHandlerClicked by remember { mutableIntStateOf(0) }

    BackHandler (enabled = true, onBack = { isBackHandlerClicked += 1 })

    Text(text = "BackHandler telah di klik sebanyak $isBackHandlerClicked kali")
}

@Preview
@Composable
private fun BackHandlerScreenPreview() {
    BackHandlerScreen()

}