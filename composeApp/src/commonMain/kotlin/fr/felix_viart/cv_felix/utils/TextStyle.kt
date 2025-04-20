package fr.felix_viart.cv_felix.utils

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * Class for unified texts styles
 */
class TextStyle(val size: TextUnit, val boldness: FontWeight) {

    companion object {
        val Normal = TextStyle(20.sp, FontWeight.Normal)
        val Bold = TextStyle(20.sp, FontWeight.Bold)

        val Title = TextStyle(30.sp, FontWeight.Bold)
        val ThinTitle = TextStyle(30.sp, FontWeight.Light)

        val Subtitle = TextStyle(26.sp, FontWeight.Medium)

        val LastName = TextStyle(38.sp, FontWeight.Light)
        val FirstName = TextStyle(46.sp, FontWeight.SemiBold)
        val Position = TextStyle(30.sp, FontWeight.Medium)
    }

}