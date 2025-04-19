package fr.felix_viart.cv_felix

import androidx.annotation.IntRange
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.data.left.IconText

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
     * Generates random letters with given length.
     */
    public fun randomLetters(@IntRange(from = 1) length: Int): String
    {
        if( length < 1 ) {
            throw Exception("Cannot generate random letters with length < 1 ('${length}' given).")
        }

        return this.doGetRandomCharsAsString(length)
    }

    /**
     * Generates random letters withing given random range.
     */
    public fun randomLettersInRange(@IntRange(from = 1) min: Int = 1, max: Int): String
    {
        if( min < 1 ) {
            throw Exception("Cannot generate random letters with min < 1 ('${min}' given).")
        }

        return this.doGetRandomCharsAsString(
            (min..max).random()
        )
    }

    private fun doGetRandomCharsAsString(length: Int): String
    {
        return (1..length).map { allChars.random() }.joinToString("")
    }

    // ------------------------------ Data mock methods ------------------------------

    /**
     * Mocks some contacts. Returns 1 to 4 contacts to display later.
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
    public fun getSingleRandomIconText(): IconText
    {
        return IconText(
            randomLettersInRange(5, 25),
            iconsList.random()
        )
    }
}