package fr.felix_viart.cv_felix.cv.right

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.cv.right.experiences.Experiences
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Renders the right side of the CV.
 */
@Composable
fun cvRightSide(
    modifier: Modifier = Modifier,
    padding: Pair<Dp, Dp> = Pair(25.dp, 50.dp)
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(vertical = padding.first, horizontal = padding.second)
    ) {
        Experiences(
            jobs = Utils.getRandomAmountOfSingleExperience(min = 1, max = 3),
            education = Utils.getRandomAmountOfSingleEducation(min = 1, max = 3)
        )

        Row {
            //MainSkills( Utils.randomSkillHolder() )
        }

    }
}