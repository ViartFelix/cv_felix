package fr.felix_viart.cv_felix.cv.right.experiences.jobs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.composables.ChatBubble
import fr.felix_viart.cv_felix.utils.Utils
import fr.felix_viart.cv_felix.data.experience.SingleExperience
import kotlinx.datetime.Instant

/**
 * Renders a single experience.
 */
@Composable
fun SingleJob(
    job: SingleExperience
) {
    //main container
    Column {

        //future chat bubble here
        ChatBubble {
            Row {
                Text(job.company)
            }

            //dates
            Row {
                val beginDate = Utils.toLocalDate(job.beginDate)

                val endDate = if( job.endDate is Instant ) {
                    Utils.toLocalDate(job.endDate)
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
                Text(job.jobTitle)
            }

            Row {
                Text(job.description)
            }
        }
    }
}