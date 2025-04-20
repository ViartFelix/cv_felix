package fr.felix_viart.cv_felix.cv.right.skills

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.cv.right.skills.interests.SingleInterest
import fr.felix_viart.cv_felix.cv.right.skills.languages.AllCodingLanguages
import fr.felix_viart.cv_felix.cv.right.skills.spoken.AllSpokenLanguages
import fr.felix_viart.cv_felix.data.skills.SkillsHolder

/**
 * Will render the skills and spoken languages.
 */
@Composable
fun MainSkills(
    skills: SkillsHolder,
) {
    Row {
        Column {
            AllCodingLanguages(skills.codingLanguages)
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