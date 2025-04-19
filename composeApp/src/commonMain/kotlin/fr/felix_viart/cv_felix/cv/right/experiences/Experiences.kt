package fr.felix_viart.cv_felix.cv.right.experiences

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.cv.right.experiences.jobs.AllJobs
import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.data.experience.SingleExperience

/**
 * Renders the jobs list and the education list
 */
@Composable
fun Experiences(
    jobs: List<SingleExperience>,
    education: List<SingleEducation>
) {
    Row {
        AllJobs(jobs)
    }
}