package fr.felix_viart.cv_felix.utils

import androidx.annotation.IntRange
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.data.experience.SingleEducation
import fr.felix_viart.cv_felix.data.experience.SingleExperience
import fr.felix_viart.cv_felix.data.left.IconText
import fr.felix_viart.cv_felix.data.skills.SingleLanguage
import fr.felix_viart.cv_felix.data.skills.SingleSkill
import fr.felix_viart.cv_felix.data.skills.SkillsHolder
import fr.felix_viart.cv_felix.enums.SkillLevel
import kotlinx.datetime.Instant
import kotlin.random.Random

/**
 * An utils class (object for easier use)
 */
object Utils {

    private val allChars: List<Char> = ('a' .. 'z').toList()

    /** Size of the small icons in the CV */
    val iconSize: Dp = 16.dp

    /** A list of random icons to choose from */
    private val iconsList = listOf(
        Icons.Filled.ShoppingCart,
        Icons.Filled.Call,
        Icons.Filled.Done,
        Icons.Filled.AccountCircle,
        Icons.Filled.Share,
        Icons.Filled.Settings,
        Icons.Filled.Face,
        Icons.Filled.AccountBox,
        Icons.Filled.Lock,
        Icons.Filled.Check,
        Icons.Filled.Menu,
        Icons.Filled.Home,
    )

    /**
     * Seconds from 1970 for a random pick.
     * Value here is 1990-01-01T00:00:00Z
     * @see Utils.randomTimestamp
     */
    val startTimestamp: Long = 631152000L

    /**
     * Seconds from 1970 for a random pick.
     * Value here is 2025-01-01T00:00:00Z
     */
    val endTimestamp: Long = 1735689600L

    /** Size of the lines in the CV */
    val lineWidth: Dp = 4.dp

    /** Size for a thin line in the CV */
    val thinLineWith: Dp = 2.dp

    /**
     * Generates random letters with given length.
     */
    public fun randomLetters(@IntRange(from = 1) length: Int): String
    {
        if( length < 1 ) {
            throw Exception("Cannot generate random letters with length < 1 ('${length}' given).")
        }

        return doGetRandomCharsAsString(length)
    }

    /**
     * Generates random letters withing given random range.
     */
    public fun randomLettersInRange(@IntRange(from = 1) min: Int = 1, max: Int): String
    {
        if( min < 1 ) {
            throw Exception("Cannot generate random letters with min < 1 ('${min}' given).")
        }

        return doGetRandomCharsAsString(
            (min..max).random()
        )
    }

    private fun doGetRandomCharsAsString(length: Int): String = (1..length)
        .map { allChars.random() }
        .joinToString("")

    /**
     * Returns the given Instant to the locale date.
     */
    public fun toLocalDate(date: Instant, format: DateFormat = DateFormat.Job): String
    {
        val formatter = DateFormatter(format)

        return formatter.formatDate(date)
    }

    // ------------------------------ Data mock methods ------------------------------

    /**
     * Mocks and returns some icon texts.
     */
    public fun getRandomAmountOfIconText(@IntRange(from = 1) min: Int = 1, max: Int): List<IconText>
    {
        if( min < 1 ) {
            throw Exception("Cannot generate random icon texts with min < 1 ('${min}' given).")
        }

        val length = (min..max).random()

        return (1..length).map { _ ->
            getSingleRandomIconText()
        }
    }

    /**
     * Returns a random icon Text
     */
    public fun getSingleRandomIconText(): IconText = IconText(
        randomLettersInRange(5, 25),
        iconsList.random()
    )

    public fun getRandomAmountOfSingleExperience(@IntRange(from = 1) min: Int = 1, max: Int): List<SingleExperience>
    {
        if( min < 1 ) {
            throw Exception("Cannot generate random experiences with min < 1 ('${min}' given).")
        }

        val length = (min..max).random()

        return (1..length).map { _ ->
            getSingleRandomExperience()
        }
    }

    public fun getSingleRandomExperience(): SingleExperience = SingleExperience(
        randomLettersInRange(5, 30),
        randomLettersInRange(10, 20),
        description = if( Random.nextBoolean() ) randomLettersInRange(50, 200) else null,
        randomTimestamp(),
        if( Random.nextBoolean() ) randomTimestamp() else null
    )

    public fun getRandomAmountOfSingleEducation(@IntRange(from = 1) min: Int = 1, max: Int): List<SingleEducation>
    {
        if( min < 1 ) {
            throw Exception("Cannot generate random educations with min < 1 ('${min}' given).")
        }

        val length = (min..max).random()

        return (1..length).map { _ ->
            getSingleRandomEducation()
        }
    }

    public fun getSingleRandomEducation(): SingleEducation = SingleEducation(
        randomLettersInRange(5, 30),
        randomLettersInRange(7, 50),
        randomTimestamp(),
        if( Random.nextBoolean() ) randomTimestamp() else null
    )

    /**
     * Returns a skill holder with random generated data inside
     */
    public fun randomSkillHolder(): SkillsHolder = SkillsHolder(
        (1..(1..3).random()).map { getSingleRandomSpokenLanguage() },
        (1..(1..3).random()).map { getSingleRandomSkill() },
        getRandomAmountOfIconText(min = 1, max = 3),
    )

    /**
     * Returns a randomly generated skill
     */
    public fun getSingleRandomSkill(): SingleSkill = SingleSkill(
        randomLettersInRange(6, 10),
        SkillLevel.entries.random(),
    )

    /**
     * Returns a randomly generated spoken language
     */
    public fun getSingleRandomSpokenLanguage(): SingleLanguage = SingleLanguage(
        randomLettersInRange(6, 10),
        SkillLevel.entries.random()
    )

    public fun randomTimestamp(): Instant = Instant
        .fromEpochSeconds(
            (startTimestamp..endTimestamp).random()
        )
}
