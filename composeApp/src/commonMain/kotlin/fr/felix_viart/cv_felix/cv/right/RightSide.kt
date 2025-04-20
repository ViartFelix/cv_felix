package fr.felix_viart.cv_felix.cv.right

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.background
import fr.felix_viart.cv_felix.cv.right.experiences.Experiences
import fr.felix_viart.cv_felix.cv.right.skills.MainSkills
import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.data.experience.SingleExperience
import fr.felix_viart.cv_felix.data.skills.SkillsHolder
import fr.felix_viart.cv_felix.utils.Palette

/**
 * Renders the right side of the CV.
 */
@Composable
fun cvRightSide(
    modifier: Modifier = Modifier,

    jobs: List<SingleExperience>,
    education: List<SingleEducation>,
    skills: SkillsHolder,

    //first is vertical, second is horizontal
    padding: Pair<Dp, Dp> = Pair(25.dp, 50.dp),

    experienceSkillsSpace: Dp = 25.dp,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = padding.first, horizontal = padding.second)
            .height(IntrinsicSize.Min),
        verticalArrangement = Arrangement.spacedBy(experienceSkillsSpace)
    ) {
        Experiences( jobs = jobs, education = education )

        Row(
            modifier = Modifier
                .fillMaxSize()
                .height(IntrinsicSize.Min)
                .background(Palette.Black)
                .padding(25.dp)
        ) {
            MainSkills( skills = skills )
        }

    }
}