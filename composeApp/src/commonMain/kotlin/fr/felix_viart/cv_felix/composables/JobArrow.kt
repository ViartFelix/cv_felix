package fr.felix_viart.cv_felix.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.background
import fr.felix_viart.cv_felix.utils.Palette

/**
 * Renders a job arrow pointing to a certain direction
 */
@Composable
fun JobArrow(
    width: Dp = 32.dp,
    height: Dp = 32.dp,
    padding: Dp = 4.dp,
    background: Palette = Palette.Black,
    color: Palette = Palette.White,
    icon: ImageVector = Icons.Filled.PlayArrow
) {
    val roundedCornerShape: Dp = 9999999.dp

    Box(
        modifier = Modifier
            .width(width)
            .height(height)
            //right-side rounded
            .clip(RoundedCornerShape(topEnd = roundedCornerShape, bottomEnd = roundedCornerShape))
            .background(background)
            .padding(padding),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            icon,
            contentDescription = "",
            tint = color.color,
            modifier = Modifier.fillMaxSize()
        )
    }
}