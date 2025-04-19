package fr.felix_viart.cv_felix.data.skills

import androidx.compose.ui.graphics.vector.ImageVector
import fr.felix_viart.cv_felix.enums.SkillLevel

/**
 * Represents a single skill
 */
data class SingleSkill(
    val name: String,
    val level: SkillLevel,

    val icon: ImageVector? = null,
)
