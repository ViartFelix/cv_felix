package fr.felix_viart.cv_felix.data.experience

import kotlinx.datetime.Instant

/**
 * Data class representing a single education.
 */
data class SingleEducation(
    val schoolName: String,
    val diploma: String,

    /** First is begin date, second is end date. Leave null if current education. */
    val dates: Pair<Instant, Instant?>
)
