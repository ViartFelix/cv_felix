package fr.felix_viart.cv_felix.cv.left

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.cv.left.category.RenderCategory
import fr.felix_viart.cv_felix.data.left.LeftSide

/**
 * Main composable entrypoint of the left side of the CV
 */
@Composable
fun cvLeftSide(
    modifier: Modifier = Modifier,
    data: LeftSide,
    spacedBy: Dp = 32.dp
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(spacedBy)
    ) {
        NameAndPhoto(data = data)
        AboutMe(text = data.presentation)
        RenderCategory("Contact Me",  data.contactMediums)
        RenderCategory("Socials",  data.socials)
    }
}