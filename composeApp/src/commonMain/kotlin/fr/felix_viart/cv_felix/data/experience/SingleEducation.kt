package fr.felix_viart.cv_felix.data.experience

import kotlinx.datetime.Instant

/**
 * Data class representing a single education.
 */
data class SingleEducation(
    val schoolName: String,
    val diploma: String,

    val beginDate: Instant,
    val endDate: Instant? = null,
)
