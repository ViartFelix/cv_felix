package fr.felix_viart.cv_felix.data.experience

import kotlinx.datetime.Instant

/**
 * Data class representing a single company experience.
 */
data class SingleExperience(
    val company: String,
    val jobTitle: String,
    val description: String? = null,

    val beginDate: Instant,
    val endDate: Instant? = null,
)
