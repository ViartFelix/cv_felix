package fr.felix_viart.cv_felix.cv.right.skills

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.cv.right.skills.interests.SingleInterest
import fr.felix_viart.cv_felix.cv.right.skills.languages.AllCodingLanguages
import fr.felix_viart.cv_felix.cv.right.skills.spoken.AllSpokenLanguages
import fr.felix_viart.cv_felix.data.skills.SkillsHolder
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Will render the skills and spoken languages.
 */
@Composable
fun MainSkills(
    skills: SkillsHolder,
    spaceBetween: Dp = 28.dp,
    //first is for programming and languages, second is for interests
    spaceAfterTitles: Pair<Dp, Dp> = Pair(16.dp, 64.dp),
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(spaceBetween)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(spaceBetween)
        ) {
            AllCodingLanguages(
                skills.codingLanguages,
                spaceBellowTitle = spaceAfterTitles.first,
                spaceBetween = spaceBetween
            )

            AllSpokenLanguages(
                skills.spokenLanguages,
                spaceBellowTitle = spaceAfterTitles.first,
            )
        }

        HorizontalDivider(
            thickness = Utils.thinLineWith,
            color = Palette.White.color
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(spaceAfterTitles.second),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CvText("INTERESTS", TextStyle.Subtitle, Palette.White)

            Row(
                horizontalArrangement = Arrangement.spacedBy(spaceBetween)
            ) {
                skills.interests.forEach {
                    SingleInterest(it)
                }
            }
        }
    }


}