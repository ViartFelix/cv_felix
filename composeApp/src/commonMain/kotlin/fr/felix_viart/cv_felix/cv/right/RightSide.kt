package fr.felix_viart.cv_felix.cv.right

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import fr.felix_viart.cv_felix.cv.right.skills.MainSkills
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Renders the right side of the CV.
 */
@Composable
fun cvRightSide()
{
    Column(
        modifier = Modifier.fillMaxSize().background(Color.LightGray)
    ) {
        Row {
            /*
            Experiences(
                jobs = Utils.getRandomAmountOfSingleExperience(min = 1, max = 3),
                education = Utils.getRandomAmountOfSingleEducation(min = 1, max = 3)
            )
             */
        }

        Row {
            MainSkills( Utils.randomSkillHolder() )
        }

    }
}