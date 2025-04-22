package fr.felix_viart.cv_felix.cv.right.experiences

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.cv.right.experiences.education.AllEducations
import fr.felix_viart.cv_felix.cv.right.experiences.jobs.AllJobs
import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.data.experience.SingleExperience
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Renders the jobs list and the education list
 */
@Composable
fun Experiences(
    jobs: List<SingleExperience>,
    education: List<SingleEducation>,

    spaceBetween: Dp = 64.dp,

    modifier: Modifier = Modifier
) {
    val trueSpaceBetween = spaceBetween / 2

    Column (
        modifier = modifier.fillMaxWidth(),
        //verticalArrangement = Arrangement.spacedBy(spaceBetween)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            AllJobs(jobs, paddingBottom = trueSpaceBetween)
        }

        HorizontalDivider(
            thickness = Utils.lineWidth,
            color = Palette.Grey.color,
            modifier = Modifier.fillMaxWidth()
        )

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            AllEducations(education)
        }
    }
}