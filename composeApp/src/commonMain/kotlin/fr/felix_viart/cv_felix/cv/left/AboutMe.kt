package fr.felix_viart.cv_felix.cv.left

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.Utils

/**
 * Renders an "about me" section.
 */
@Composable
fun AboutMe(
    text: String = Utils.randomLettersInRange(min = 50, max = 200)
) {
    //main container
    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp).height(IntrinsicSize.Min),
    ) {
        Column {
            VerticalDivider(
                thickness = 2.dp,
                color = Color.Black
            )
        }

        Column {
            Text(
                text
            )
        }
    }
}