package fr.felix_viart.cv_felix

import androidx.annotation.IntRange

/**
 * An utils class (object for easier use)
 */
object Utils {

    private val allChars: List<Char> = ('a' .. 'z').toList()

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
}