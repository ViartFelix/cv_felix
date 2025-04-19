package fr.felix_viart.cv_felix.cv.right.experiences.education

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.data.experience.SingleEducation

/**
 * Renders all given educations.
 */
@Composable
fun AllEducations(
    jobs: List<SingleEducation>
) {
    //main container
    Row(
        modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min)
    ) {
        //container for the left side
        Column {
            Text("EXPERIENCE")
        }

        jobs.forEach {
            Column {
                SingleEducation(it)

                //better visibility
                HorizontalDivider()
            }
        }
    }


}