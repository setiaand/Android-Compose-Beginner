package com.example.androidcomposebeginner.component


import android.app.Dialog
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
internal fun AlertDialogComponent(
    isShowDialog: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    AlertDialog(
        modifier = modifier,
        title = {
            Text(text = "Title Alert Dialog")
        },
        text = {
            Text(text = "Description Alert Dialog")
        },
        onDismissRequest = {
            isShowDialog.invoke(false)
        },
        confirmButton = {
            Button(onClick = {
            isShowDialog.invoke(false)
            }) {
                Text(text = "Oke")
            }
        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun AlertDialogPreview() {
    var isShowDialog by remember { mutableStateOf(false) }

    if (isShowDialog) {
        AlertDialogComponent(
            isShowDialog = { value ->
                isShowDialog = value
            }
        )
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Button(onClick = {isShowDialog = true}) {
            Text(text = "Show Dialog")
        }
    }

}