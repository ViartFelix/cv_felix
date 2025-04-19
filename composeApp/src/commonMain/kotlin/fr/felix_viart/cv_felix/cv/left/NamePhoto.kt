package fr.felix_viart.cv_felix.cv.left

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Renders the name and photo
 */
@Composable
fun nameAndPhoto()
{
    //main container
    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp)
    ) {

        //container for the photo
        Column(
            modifier = Modifier.fillMaxWidth(0.5f)
        ) {
            photoComposable()
        }

        //container for the names and title
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            //last name
            Text(
                "VIART"
            )
            Text(
                "Félix"
            )
            HorizontalDivider(
                modifier = Modifier.fillMaxWidth(),
                thickness = 2.dp
            )
            Text(
                "Web Dev"
            )
        }
    }
}