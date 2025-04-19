package fr.felix_viart.cv_felix.data.skills

/**
 * Class that holds skills, languages, and frameworks.
 */
data class SkillsHolder(
    val spokenLanguages: Array<SingleLanguage>,

    val codingLanguages: Array<SingleSkill>,
    val framekworks: Array<SingleSkill>,
)
