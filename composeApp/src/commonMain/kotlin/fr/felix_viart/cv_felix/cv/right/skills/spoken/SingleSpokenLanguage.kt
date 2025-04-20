package fr.felix_viart.cv_felix.cv.right.skills.spoken

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.composables.SkillLevelRender
import fr.felix_viart.cv_felix.data.skills.SingleLanguage
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

@Composable
fun SingleSpokenLanguage(
    language: SingleLanguage,
    color: Palette = Palette.White,
    modifier: Modifier = Modifier,
    textProportion: Float = 0.5f
) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        CvText(
            language.name,
            TextStyle.Normal,
            color,
            modifier = Modifier.fillMaxWidth(textProportion)
        )

        SkillLevelRender(language.level, fill = color, borderColor = color)
    }
}