package fr.felix_viart.cv_felix

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App()
{
    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            mainCvEntrypoint(
                1.0f / 3.0f
            )
        }
    }
}