package fr.felix_viart.cv_felix.cv.right

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import fr.felix_viart.cv_felix.utils.Utils
import fr.felix_viart.cv_felix.cv.right.experiences.Experiences

/**
 * Renders the right side of the CV.
 */
@Composable
fun cvRightSide()
{
    Column(
        modifier = Modifier.fillMaxSize().background(Color.LightGray)
    ) {
        Experiences(
            jobs = Utils.getRandomAmountOfSingleExperience(min = 1, max = 3),
            education = Utils.getRandomAmountOfSingleEducation(min = 1, max = 3)
        )
    }
}