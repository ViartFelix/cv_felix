package fr.felix_viart.cv_felix.data.skills

/**
 * Class that holds skills, languages, and frameworks.
 */
data class SkillsHolder(
    val spokenLanguages: List<SingleLanguage>,

    val codingLanguages: List<SingleSkill>,
    val frameworks: List<SingleSkill>,
)
