package fr.felix_viart.cv_felix.contracts

import fr.felix_viart.cv_felix.utils.DateFormat
import kotlinx.datetime.Instant

/**
 * This class can format a date.
 * **BEWARE** This class can only format dates **AND NOT TIME**.
 */
interface FormatableDate {

    /** Format of the future date */
    var dateFormat: DateFormat

    /**
     * Formats a date with the given format.
     */
    public fun formatDate(date: Instant): String
}