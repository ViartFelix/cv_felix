package fr.felix_viart.cv_felix.cv.left

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Renders the name and photo
 */
@Composable
fun NameAndPhoto(
    photoSize: Float = 0.35f,
    textColor: Palette = Palette.White,
    dividerHeight: Dp = Utils.lineWidth,
    spaceBetween: Dp = 15.dp,
    modifier: Modifier = Modifier
) {
    //main container
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        //container for the photo
        Column(
            modifier = Modifier
                .padding(end = spaceBetween)
                .fillMaxWidth(photoSize)
        ) {
            photoComposable()
        }

        //container for the names and title
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = spaceBetween),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min),
            ) {
                //last name
                CvText("VIART", style = TextStyle.LastName, color = textColor)

                //first name
                CvText("Félix", style = TextStyle.FirstName, color = textColor)
            }

            HorizontalDivider(
                modifier = Modifier.fillMaxWidth(),
                thickness = dividerHeight
            )

            //job position
            CvText("Web Dev", style = TextStyle.Position, color = textColor)
        }
    }
}