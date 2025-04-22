package fr.felix_viart.cv_felix.cv.right.skills.languages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.data.skills.SingleSkill
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

@Composable
fun AllCodingLanguages(
    languages: List<SingleSkill>,
    spaceBellowTitle: Dp = 12.dp,
    orderByLevel: Boolean = true,
    spaceBetween: Dp = 12.dp,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(spaceBellowTitle),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CvText("PROGRAMMING", TextStyle.Subtitle, Palette.White)

        Column (
            verticalArrangement = Arrangement.spacedBy(spaceBetween),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val finalLanguages: List<SingleSkill> = if( orderByLevel ) {
                languages.sortedByDescending {
                    it.level.level
                }
            } else {
                languages
            }

            finalLanguages.forEach {
                SingleCodingSkill(it)
            }
        }
    }
}