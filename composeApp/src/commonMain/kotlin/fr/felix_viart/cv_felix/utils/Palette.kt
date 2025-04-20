package fr.felix_viart.cv_felix.utils

import androidx.compose.ui.graphics.Color

/**
 * Color palette of the CV.
 */
class Palette(val color: Color) {

    companion object {
        val White = Palette(Color.White)
        val Black = Palette(Color.Black)
        val Grey = Palette(Color.Gray)

        //for testing
        val Test = Palette(Color.Green)
        val Test2 = Palette(Color.Red)
        val Test3 = Palette(Color.Blue)
        val Test4 = Palette(Color.Yellow)
        val Test5 = Palette(Color.Magenta)
    }

}