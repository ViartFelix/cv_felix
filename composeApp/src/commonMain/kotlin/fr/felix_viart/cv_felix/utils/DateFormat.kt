package fr.felix_viart.cv_felix.utils

/**
 * Date format class.
 * Sort of custom i18n date format class.
 * Available letters for the format are:
 *  - d: Full day (1-31)
 *  - m: Month in numbers (1-12)
 *  - mm: Month in numbers with always two digits (01-12)
 *  - F: Full month in string (eg: "January")
 *  - y: Full year (4 digits)
 */
class DateFormat(var format: String) {

    companion object {
        val French = DateFormat("d/m/y")
        val English = DateFormat("y/m/d")

        val Job = DateFormat("F y")
        val JobMonth = DateFormat("mm/y")

        fun from(format: String): DateFormat {
            return DateFormat(format)
        }
    }
}

