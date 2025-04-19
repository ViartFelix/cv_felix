package fr.felix_viart.cv_felix.data.skills

import fr.felix_viart.cv_felix.enums.SkillLevel

/**
 * Represents a spoken language (with an optional)
 */
data class SingleLanguage(
    val name: String,
    val level: SkillLevel
)
