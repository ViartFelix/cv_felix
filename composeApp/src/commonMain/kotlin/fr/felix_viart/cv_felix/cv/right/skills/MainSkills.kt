package fr.felix_viart.cv_felix.cv.right.skills

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.cv.right.skills.frameworks.AllFrameworks
import fr.felix_viart.cv_felix.cv.right.skills.languages.AllCodingLanguages
import fr.felix_viart.cv_felix.cv.right.skills.spoken.AllSpokenLanguages
import fr.felix_viart.cv_felix.data.skills.SkillsHolder

/**
 * Will render the skills and spoken languages.
 */
@Composable
fun MainSkills(
    skills: SkillsHolder
) {
    Row {
        Column {
            Row {
                AllCodingLanguages(skills.codingLanguages)
            }

            Row {
                AllFrameworks(skills.frameworks)
            }
        }

        Row {
            AllSpokenLanguages(skills.spokenLanguages)
        }
    }


}