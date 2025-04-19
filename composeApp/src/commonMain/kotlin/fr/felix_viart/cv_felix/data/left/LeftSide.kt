package fr.felix_viart.cv_felix.data.left

/**
 * Data class to store the left side's infos
 */
data class LeftSide(
    val lastName: String,
    val firstName: String,
    val title: String,
    val presentation: String,

    val contactMediums: Array<IconText>,
    val socials: Array<IconText>,
)