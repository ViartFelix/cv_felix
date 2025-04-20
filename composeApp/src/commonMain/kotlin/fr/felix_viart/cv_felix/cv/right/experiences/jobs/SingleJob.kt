package fr.felix_viart.cv_felix.cv.right.experiences.jobs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.ChatBubble
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.data.experience.SingleExperience
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle
import fr.felix_viart.cv_felix.utils.Utils
import kotlinx.datetime.Instant

/**
 * Renders a single experience.
 */
@Composable
fun SingleJob(
    job: SingleExperience,
    modifier: Modifier = Modifier,
) {
    //main container
    Column(
        modifier = modifier
    ) {

        ChatBubble(
            spaceBetween = 15.dp
        ) {
            Row {
                CvText(job.company, TextStyle.BigBold, Palette.White)
            }

            //dates
            Row {
                val beginDate = Utils.toLocalDate(job.beginDate)

                val endDate = if( job.endDate is Instant ) {
                    Utils.toLocalDate(job.endDate)
                } else {
                    //assume it's out current job if endDate is null
                    "now"
                }

                CvText("$beginDate - $endDate", TextStyle.Small, Palette.White)
            }
        }

        //container for bottom content
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            CvText(job.jobTitle, TextStyle.Subtitle)

            if( null !== job.description ) {
                CvText(job.description, TextStyle.SmallThin)
            } else {
                //margin bottom for less "weird" looking char bubbles
                Box(modifier = Modifier.padding(bottom = 7.dp)) {}
            }
        }
    }
}