package fr.felix_viart.cv_felix

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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

/**
 * Returns the common border to use for the skills and languages.
 */
fun Modifier.borderSkill(size: Dp = 2.dp, color: Color = Color.White) : Modifier = this
    .border(size, color,CircleShape)
    .padding(size)

/**
 * Sets the shape to a circle
 */
fun Modifier.circle() : Modifier = this.clip(CircleShape)