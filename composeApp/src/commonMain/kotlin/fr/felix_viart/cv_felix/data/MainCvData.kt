package fr.felix_viart.cv_felix.data

import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.data.experience.SingleExperience
import fr.felix_viart.cv_felix.data.left.LeftSide
import fr.felix_viart.cv_felix.data.skills.SkillsHolder

/**
 * All data for the CV
 */
data class MainCvData(
    val leftSide: LeftSide,

    val skills: SkillsHolder,

    val experience: List<SingleExperience>,
    val education: List<SingleEducation>,
)
