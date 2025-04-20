package fr.felix_viart.cv_felix.cv.left.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.data.left.IconText
import fr.felix_viart.cv_felix.toDp
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

/**
 * Renders a single category row.
 */
@Composable
fun SingleCategoryRow(
    data: IconText,
    color: Palette = Palette.White,
    spaceBetween: Dp = 16.dp,
) {
    //main container
    Row(
        horizontalArrangement = Arrangement.spacedBy(spaceBetween),
        verticalAlignment = Alignment.Top
    ) {
        //icon container
        Column(
            modifier = Modifier
                //same size as the text size
                .width(TextStyle.Bold.size.toDp())
                .aspectRatio(1f),
        ) {
            Icon(
                imageVector = data.icon,
                contentDescription = "",
                tint = color.color
            )
        }

        CvText(data.content, TextStyle.Normal, color)
    }
}