package fr.felix_viart.cv_felix.cv.left.category

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import fr.felix_viart.cv_felix.Utils
import fr.felix_viart.cv_felix.data.left.IconText

/**
 * Renders a single category row.
 */
@Composable
fun SingleCategoryRow(
    data: IconText
) {
    //main container
    Row {

        //icon container
        Column(
            modifier = Modifier.width(Utils.iconSize).aspectRatio(1f),
        ) {
            Icon(
                imageVector = data.icon,
                contentDescription = "",
                tint = Color.Black
            )
        }

        //text container
        Column {
            Text(data.content)
        }
    }
}