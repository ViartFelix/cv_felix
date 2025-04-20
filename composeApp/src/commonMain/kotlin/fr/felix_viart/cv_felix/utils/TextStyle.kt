package fr.felix_viart.cv_felix.utils

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

/**
 * Class for unified texts styles
 */
class TextStyle(val size: TextUnit, val boldness: FontWeight) {

    companion object {
        val Normal = TextStyle(24.sp, FontWeight.Normal)
        val Bold = TextStyle(24.sp, FontWeight.Bold)

        val Title = TextStyle(32.sp, FontWeight.Bold)
        val ThinTitle = TextStyle(32.sp, FontWeight.Light)

        val Subtitle = TextStyle(28.sp, FontWeight.Medium)

        val LastName = TextStyle(40.sp, FontWeight.Light)
        val FirstName = TextStyle(48.sp, FontWeight.SemiBold)
        val Position = TextStyle(32.sp, FontWeight.Medium)
    }

}