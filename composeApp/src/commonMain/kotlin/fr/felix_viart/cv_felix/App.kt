package fr.felix_viart.cv_felix

import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.data.MainCvData
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.Utils
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    data: MainCvData = Utils.getRealData()
) {
    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            mainCvEntrypoint(
                1.0f / 3.0f,
                data = data
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

/**
 * Applies a rectangle background with the specified color in the palette.
 */
fun Modifier.background(color: Palette) : Modifier = this.background(color.color, RectangleShape)

/**
 * Converts a raw SP to DP. Conversion Rate: 1 SP = 1 DP.
 */
fun TextUnit.toDp() : Dp = Dp(this.value)