package fr.felix_viart.cv_felix.cv.right.experiences.education

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.composables.ChatBubble
import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.utils.Utils
import kotlinx.datetime.Instant

/**
 * Renders a single education.
 */
@Composable
fun SingleEducation(
    education: SingleEducation
) {
    //main container
    Column {

        ChatBubble {
            Row {
                Text(education.schoolName)
            }

            //dates
            Row {
                val beginDate = Utils.toLocalDate(education.beginDate)

                val endDate = if( education.endDate is Instant ) {
                    Utils.toLocalDate(education.endDate)
                } else {
                    //assume it's out current job is endDate is null
                    "now"
                }

                Text(
                    "$beginDate - $endDate"
                )
            }
        }

        //container for bottom content
        Column {
            Row {
                Text(education.diploma)
            }
        }
    }
}