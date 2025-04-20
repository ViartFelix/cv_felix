package fr.felix_viart.cv_felix.composables

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

/**
 * Renders a CV text with a specified size
 */
@Composable
fun CvText(
    text: String,
    style: TextStyle = TextStyle.Normal,
    color: Palette = Palette.Black,
    modifier: Modifier = Modifier,
) {
    Text(
        text,
        modifier = modifier,
        fontSize = style.size,
        fontWeight = style.boldness,
        color = color.color
    )
}