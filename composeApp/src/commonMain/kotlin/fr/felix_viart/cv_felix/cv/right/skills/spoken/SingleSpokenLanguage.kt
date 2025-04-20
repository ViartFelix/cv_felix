package fr.felix_viart.cv_felix.cv.right.skills.spoken

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.composables.SkillLevelRender
import fr.felix_viart.cv_felix.data.skills.SingleLanguage

@Composable
fun SingleSpokenLanguage(
    language: SingleLanguage
) {
    Row {
        Text(language.name)
        SkillLevelRender(language.level)
    }
}