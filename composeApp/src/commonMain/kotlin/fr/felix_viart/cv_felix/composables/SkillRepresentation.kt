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

@Composable
fun SkillLevelRender(
    level: SkillLevel,
    fill: Color = Color.White,
    size: Dp = 12.dp
) {
    val sortedSkillLevels = SkillLevel.entries.sortedBy { it.level }

    Row {
        sortedSkillLevels.forEach {

            val finalBackground: Color = if( level.level >= it.level ) {
                fill
            } else {
                Color.Transparent
            }

            Box(
                modifier = Modifier
                    .circle()
                    .borderSkill(3.dp)
                    .width(size)
                    .aspectRatio(1f)
                    .background(finalBackground)
            ) {

            }
        }
    }
}