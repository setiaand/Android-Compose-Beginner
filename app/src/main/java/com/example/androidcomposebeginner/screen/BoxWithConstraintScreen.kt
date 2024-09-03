package com.example.androidcomposebeginner.screen

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BoxWithConstraintScreen(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier = modifier) {
        val boxWithConstraintsScope = this
        Column {
            if (boxWithConstraintsScope.maxHeight >= 200.dp) {
                Text(
                    text = "Text ini akan muncul jika maxHeight lebih dari 200.dp",
                    fontSize = 20.sp
                )
            }
            Text(
                text = """
            minHeight: ${boxWithConstraintsScope.minHeight}
            minWidth: ${boxWithConstraintsScope.minWidth}
            minHeight: ${boxWithConstraintsScope.minHeight}
            minWidth: ${boxWithConstraintsScope.minWidth}
        """.trimIndent()
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun BoxConstrainScreenPreview() {
    Column(modifier = Modifier.height(200.dp)) {
        BoxWithConstraintScreen()
    }

}