package fr.felix_viart.cv_felix.cv.left.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.data.left.IconText
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

/**
 * Renders a category with a list of elements to display.
 */
@Composable
fun RenderCategory(
    sectionTitle: String,
    content: List<IconText>,
    color: Palette = Palette.White,
    spaceBetween: Dp = 15.dp,
    leftSpace: Dp = 15.dp,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(spaceBetween)
    ) {
        Row {
            CvText(sectionTitle, TextStyle.Subtitle, color)
        }

        content.forEach {
            Box(
                modifier = Modifier.padding(start = leftSpace)
            ) {
                SingleCategoryRow(it)
            }
        }
    }
}