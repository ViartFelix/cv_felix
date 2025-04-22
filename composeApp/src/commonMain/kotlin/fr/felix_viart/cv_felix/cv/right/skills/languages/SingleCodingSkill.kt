package fr.felix_viart.cv_felix.cv.right.skills.languages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.composables.SkillBubble
import fr.felix_viart.cv_felix.composables.SkillLevelRender
import fr.felix_viart.cv_felix.data.skills.SingleSkill
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

/**
 * Renders a single coding language.
 */
@Composable
fun SingleCodingSkill(
    language: SingleSkill,
    color: Palette = Palette.White,
    spaceBellowText: Dp = 8.dp,
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(spaceBellowText),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SkillBubble(
            width = 60.dp
        ) {
            //render an icon if there is any
            if( null !== language.icon ) {
                Icon(
                    imageVector = language.icon,
                    contentDescription = language.name,
                    tint = color.color
                )
            }
            //else we render a fallback text
            else {
                CvText(language.name, TextStyle.Normal, color)
            }
        }

        SkillLevelRender(language.level)
    }
}
