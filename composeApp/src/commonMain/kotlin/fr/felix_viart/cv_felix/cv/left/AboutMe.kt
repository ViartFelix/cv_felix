package fr.felix_viart.cv_felix.cv.left

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Renders an "about me" section.
 */
@Composable
fun AboutMe(
    text: String,
    color: Palette = Palette.White,
    lineWidth: Dp = Utils.lineWidth,
    spaceAfterLine: Dp = 25.dp,
    spaceBellowTitle: Dp = 15.dp,
    modifier: Modifier = Modifier
) {
    //main container
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
    ) {
        Column(
            modifier = Modifier.padding(end = spaceAfterLine)
        ) {
            VerticalDivider(
                thickness = lineWidth,
                color = color.color,
            )
        }

        Column(
            verticalArrangement = Arrangement.spacedBy(spaceBellowTitle)
        ) {
            CvText("ABOUT ME", TextStyle.Title, color)
            CvText(text, TextStyle.Italic, color)
        }
    }
}