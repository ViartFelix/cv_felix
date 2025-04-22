package fr.felix_viart.cv_felix.cv.right.skills.interests

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.data.left.IconText
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

/**
 * Renders a single interest
 */
@Composable
fun SingleInterest(
    interest: IconText,
    color: Palette = Palette.White,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            interest.icon,
            contentDescription = "Icon",
            tint = color.color
        )

        CvText(interest.content, TextStyle.Normal, color)
    }
}