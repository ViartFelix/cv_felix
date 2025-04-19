package fr.felix_viart.cv_felix.cv.right.skills.languages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.composables.SkillLevelRender
import fr.felix_viart.cv_felix.data.skills.SingleSkill

/**
 * Renders a single coding language.
 */
@Composable
fun SingleCodingLanguage(
    language: SingleSkill
) {
    Column {

        //circle container with language name
        Box(
            modifier = Modifier
        ) {

        }

        SkillLevelRender(language.level)
    }


}
