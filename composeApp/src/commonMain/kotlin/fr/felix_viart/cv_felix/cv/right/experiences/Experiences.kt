package fr.felix_viart.cv_felix.cv.right.experiences

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.cv.right.experiences.education.AllEducations
import fr.felix_viart.cv_felix.cv.right.experiences.jobs.AllJobs
import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.data.experience.SingleExperience

/**
 * Renders the jobs list and the education list
 */
@Composable
fun Experiences(
    jobs: List<SingleExperience>,
    education: List<SingleEducation>,

    jobsSize: Float = 0.5f,
    spaceBetween: Dp = 32.dp,

    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spaceBetween)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(jobsSize)
        ) {
            AllJobs(jobs)
        }

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            AllEducations(education)
        }
    }
}