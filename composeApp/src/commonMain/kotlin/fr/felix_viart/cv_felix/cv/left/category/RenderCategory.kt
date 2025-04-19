package fr.felix_viart.cv_felix.cv.left.category

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.data.left.IconText

/**
 * Renders a category with a list of elements to display.
 */
@Composable
fun RenderCategory(
    sectionTitle: String,
    content: List<IconText>,
) {
    Column {
        Row {
            Text(sectionTitle)
        }

        content.forEach {
            SingleCategoryRow(it)
        }
    }
}