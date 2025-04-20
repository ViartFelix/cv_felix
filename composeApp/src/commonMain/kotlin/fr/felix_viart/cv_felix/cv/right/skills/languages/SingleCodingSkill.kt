package fr.felix_viart.cv_felix.cv.right.skills.languages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.composables.SkillBubble
import fr.felix_viart.cv_felix.composables.SkillLevelRender
import fr.felix_viart.cv_felix.data.skills.SingleSkill

/**
 * Renders a single coding language.
 */
@Composable
fun SingleCodingSkill(
    language: SingleSkill
) {
    Column {
        SkillBubble {
            Text(language.name)
        }

        SkillLevelRender(language.level)
    }
}
