package fr.felix_viart.cv_felix.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

/**
 * Renders a chat bubble triangle
 */
@Composable
fun ChatBubbleTriangle(
    modifier: Modifier = Modifier,
    color: Color = Color.Black,
) {
    val bubbleTriangleShape = GenericShape { size, _ ->
        moveTo(0f, 0f) //top left

        lineTo(size.width, size.height) //top left -> bottom right
        lineTo(size.width, 0f) //bottom right -> top right
        lineTo(0f, 0f) //top right -> top left
    }

    Box(
        modifier = modifier
            .clip(bubbleTriangleShape) //apply the clip BEFORE the color (else the clip doesn't work)
            .background(color)
    )
}