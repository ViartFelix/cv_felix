package fr.felix_viart.cv_felix.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.borderSkill
import fr.felix_viart.cv_felix.circle

/**
 * Renders a skill bubble with content inside.
 */
@Composable
fun SkillBubble(
    borderSize: Dp = 6.dp,
    width: Dp = 100.dp,
    borderColor: Color = Color.White,
    content: @Composable () -> Unit,
) {
    //circle container
    Box(
        modifier = Modifier
            .circle()
            .borderSkill(borderSize, borderColor)
            .width(width)
            .aspectRatio(1.0f),
        contentAlignment = Alignment.Center,
    ) {
        content()
    }
}