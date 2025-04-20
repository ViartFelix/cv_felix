package fr.felix_viart.cv_felix.cv.right

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.background
import fr.felix_viart.cv_felix.cv.right.skills.MainSkills
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Renders the right side of the CV.
 */
@Composable
fun cvRightSide(
    modifier: Modifier = Modifier,
    //first is vertical, second is horizontal
    padding: Pair<Dp, Dp> = Pair(25.dp, 50.dp)
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(vertical = padding.first, horizontal = padding.second),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {
        /*
        Experiences(
            jobs = Utils.getRandomAmountOfSingleExperience(min = 1, max = 3),
            education = Utils.getRandomAmountOfSingleEducation(min = 1, max = 3)
        )
         */

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Palette.Black)
                .padding(25.dp)
        ) {
            MainSkills( Utils.randomSkillHolder() )
        }

    }
}