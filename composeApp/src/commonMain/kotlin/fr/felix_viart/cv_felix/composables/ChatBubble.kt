package fr.felix_viart.cv_felix.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.background
import fr.felix_viart.cv_felix.utils.Palette

/**
 * Renders a single chat bubble with content inside.
 */
@Composable
fun ChatBubble(
    color: Palette = Palette.Black,
    innerPadding: Dp = 10.dp,
    spaceBetween: Dp = 0.dp,
    withTriangle: Boolean = true,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Column {
        //main chat bubble
        Column (
            modifier = modifier.background(color).padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(spaceBetween)
        ) {
            content()
        }

        if( withTriangle ) {
            //the triangle at the bottom
            ChatBubbleTriangle(
                color = color.color,
                modifier = Modifier
                    .padding(start = 25.dp) //margin left
                    .width(25.dp)
                    .height(15.dp),
            )
        }
    }
}