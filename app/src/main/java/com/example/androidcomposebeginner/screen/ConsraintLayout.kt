package com.example.androidcomposebeginner.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(25.dp)
            .fillMaxWidth(),
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            val (imageId, nameId) = createRefs()
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        color = Color.Green,
                        shape = RoundedCornerShape(25.dp)
                    )
                    .constrainAs(imageId) {}
            )

            Text(
                text = "Arfan Siregar",
                modifier = Modifier
                    .constrainAs(nameId) {
                        start.linkTo(imageId.end, 8.dp)
                    },
                color = Color.White
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ConstraintLayoutScreenPreview() {
    ConstraintLayoutScreen(
        modifier = Modifier
            .background(
                color = Color.Blue,
                shape = RoundedCornerShape(14.dp)
            )
    )
}