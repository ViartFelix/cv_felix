package fr.felix_viart.cv_felix.cv.right.experiences.jobs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.composables.JobArrow
import fr.felix_viart.cv_felix.data.experience.SingleExperience
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle
import fr.felix_viart.cv_felix.utils.Utils

//TODO: Could be a util composable for reusable code part ?

/**
 * Renders all given jobs.
 */
@Composable
fun AllJobs(
    jobs: List<SingleExperience>,
    spaceBetween: Dp = 28.dp,
    leftMargin: Dp = 32.dp,
) {
    //main container
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        //calculate the padding left of the title
        val jobArrowWidth = 32.dp

        //divider on the left
        VerticalDivider(
            thickness = Utils.thinLineWith,
            color = Palette.Grey.color
        )

        //content container
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(spaceBetween)
        ) {
            //container for the left side
            Column {
                CvText(
                    "EXPERIENCE",
                    TextStyle.Title,
                    Palette.Black,
                    modifier = Modifier.padding(start = jobArrowWidth + leftMargin)
                )
            }

            jobs.forEach {
                Row(
                    //to "push" the job at the left side (so that they are arrows on the line with
                    // the jobs and section title aligned.)
                    horizontalArrangement = Arrangement.spacedBy(leftMargin)
                ) {
                    //job arrow on the left
                    JobArrow(width = jobArrowWidth, height = jobArrowWidth)
                    //and the job on the right side
                    SingleJob(it)
                }
            }
        }
    }
}