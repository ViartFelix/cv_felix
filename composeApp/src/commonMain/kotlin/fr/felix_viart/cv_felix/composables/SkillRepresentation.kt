package fr.felix_viart.cv_felix.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.borderSkill
import fr.felix_viart.cv_felix.circle
import fr.felix_viart.cv_felix.enums.SkillLevel
import fr.felix_viart.cv_felix.utils.Palette

@Composable
fun SkillLevelRender(
    level: SkillLevel,
    fill: Palette = Palette.White,
    borderColor: Palette = Palette.White,
    borderSize: Dp = 3.dp,
    size: Dp = 12.dp
) {
    //sort skill levels (to avoid a messed up order)
    val sortedSkillLevels = SkillLevel.entries.sortedBy { it.level }

    Row {
        sortedSkillLevels.forEach {

            val finalBackground: Color = if( level.level >= it.level ) {
                fill.color
            } else {
                Color.Transparent
            }

            Box(
                modifier = Modifier
                    .circle()
                    .borderSkill(borderSize, borderColor.color)
                    .width(size)
                    .aspectRatio(1f)
                    .background(finalBackground)
            ) {

            }
        }
    }
}