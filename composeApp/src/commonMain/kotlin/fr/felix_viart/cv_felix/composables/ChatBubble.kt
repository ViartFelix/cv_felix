package fr.felix_viart.cv_felix.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Renders a single chat bubble with content inside.
 */
@Composable
fun ChatBubble(
    color: Color = Color.Black,
    content: @Composable () -> Unit,
) {
    Column {
        //main chat bubble
        Column (
            modifier = Modifier.background(color).padding(10.dp)
        ) {
            content()
        }

        //the triangle at the bottom
        ChatBubbleTriangle(
            color = color,
            modifier = Modifier
                .padding(start = 25.dp) //margin left
                .width(25.dp)
                .height(15.dp),
        )
    }
}