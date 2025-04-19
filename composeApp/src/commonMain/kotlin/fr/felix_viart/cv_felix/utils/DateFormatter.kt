package fr.felix_viart.cv_felix.utils

import fr.felix_viart.cv_felix.contracts.FormatableDate
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 * A custom made date formatter.
 * KMP doesn't have a formatter ? Well, i'll do it myself then.
 */
class DateFormatter(override var dateFormat: DateFormat): FormatableDate
{
    /** The date string being parsed or being mid-parse. */
    private var builtDate: String

    /** Months of the year as long values */
    public val monthsLong: List<String> = listOf(
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    )

    init {
        this.builtDate = dateFormat.format
    }

    constructor(format: String) : this(
        dateFormat = DateFormat.from(format)
    )

    override fun formatDate(date: Instant): String
    {
        val parsedDate = date.toLocalDateTime(TimeZone.UTC)

        this
            .replaceYears(parsedDate)
            .replaceMonths(parsedDate)
            .replaceDays(parsedDate)

        return this.builtDate
    }

    /**
     * Parses the years in the date.
     */
    private fun replaceYears(date: LocalDateTime): DateFormatter
    {
        if( 'y' in this.dateFormat.format) {
            this.charReplacement('y', date.year)
        }

        return this
    }

    /**
     * Parses the months in the date.
     */
    private fun replaceMonths(date: LocalDateTime): DateFormatter
    {
        val month: Int = date.monthNumber

        //if month in long version
        if('F' in this.dateFormat.format) {
            val targetMonth: String? = monthsLong.getOrNull(month - 1)

            if( null === targetMonth ) {
                throw Error("Month '${month}' is not valid for getting their long form equivalent. (Possible indexes: 0 to 11)")
            }

            this.charReplacement('F', targetMonth)
        }
        //if month w/ double digits (01-12)
        else if( "mm" in this.dateFormat.format ) {
            //add char if month is bellow 10
            val addedChar = if( month < 10 ) "0" else ""

            this.charReplacement("mm", "${addedChar}${month}")
        }
        //if single month (1-12)
        else if( 'm' in this.dateFormat.format ) {
            this.charReplacement('m', date.monthNumber)
        }

        return this
    }

    /**
     * Parses the days in the date.
     */
    private fun replaceDays(date: LocalDateTime): DateFormatter
    {
        if( 'd' in this.dateFormat.format ) {
            this.charReplacement('d', date.dayOfMonth)
        }

        return this
    }

    // ----------------------------------------------------------------------------

    private fun charReplacement(formatChar: Char, value: Int)
    {
        this.doCharReplacement(formatChar.toString(), value.toString())
    }

    private fun charReplacement(formatChar: Char, value: String)
    {
        this.doCharReplacement(formatChar.toString(), value)
    }

    private fun charReplacement(formatChar: String, value: Int)
    {
        this.doCharReplacement(formatChar, value.toString())
    }

    private fun charReplacement(formatChar: String, value: String)
    {
        this.doCharReplacement(formatChar, value)
    }

    /**
     * Do the actual char replacement on the built date
     */
    private fun doCharReplacement(formatChar: String, value: String)
    {
        if( formatChar in this.dateFormat.format) {
            this.builtDate = this.builtDate.replace(formatChar, value)
        }
    }
}