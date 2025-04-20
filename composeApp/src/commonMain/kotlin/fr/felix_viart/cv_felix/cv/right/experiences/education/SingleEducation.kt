package fr.felix_viart.cv_felix.cv.right.experiences.education

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.ChatBubble
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle
import fr.felix_viart.cv_felix.utils.Utils
import kotlinx.datetime.Instant

/**
 * Renders a single education.
 */
@Composable
fun SingleEducation(
    education: SingleEducation,
    paddingBottom: Dp = 7.dp,
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
                CvText(education.schoolName, TextStyle.BigBold, Palette.White)
            }

            //dates
            Row {
                val dates = education.dates
                val beginDate = Utils.toLocalDate(dates.first)

                val endDate = if( dates.second is Instant ) {
                    Utils.toLocalDate(dates.second!!)
                } else {
                    //assume it's out current job is endDate is null
                    "now"
                }

                CvText("$beginDate - $endDate", TextStyle.Small, Palette.White)
            }
        }

        //container for bottom content
        Column(
            modifier = Modifier.padding(bottom = paddingBottom),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            CvText(education.diploma, TextStyle.Subtitle)
        }
    }
}