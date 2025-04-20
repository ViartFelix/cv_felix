package fr.felix_viart.cv_felix.cv.right.skills

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.cv.right.skills.interests.SingleInterest
import fr.felix_viart.cv_felix.cv.right.skills.languages.AllCodingLanguages
import fr.felix_viart.cv_felix.cv.right.skills.spoken.AllSpokenLanguages
import fr.felix_viart.cv_felix.data.skills.SkillsHolder
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Will render the skills and spoken languages.
 */
@Composable
fun MainSkills(
    skills: SkillsHolder,
    codingAndLanguagesSpace: Dp = 24.dp
) {
    Column {
        Row(
            horizontalArrangement = Arrangement.spacedBy(codingAndLanguagesSpace)
        ) {
            AllCodingLanguages(skills.codingLanguages)

            //FIXME: this divider take all available height !
            VerticalDivider(
                thickness = Utils.thinLineWith,
                color = Palette.White.color,
            )

            AllSpokenLanguages(skills.spokenLanguages)
        }

        Row {
            Text("INTERESTS")

            skills.interests.forEach {
                SingleInterest(it)
            }
        }
    }


}