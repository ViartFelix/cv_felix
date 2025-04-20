package fr.felix_viart.cv_felix.data.skills

import fr.felix_viart.cv_felix.data.left.IconText

/**
 * Class that holds skills, languages, and frameworks.
 */
data class SkillsHolder(
    val spokenLanguages: List<SingleLanguage>,
    val codingLanguages: List<SingleSkill>,
    val interests: List<IconText>,
)
