package fr.felix_viart.cv_felix.cv.left

import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.cv.left.category.RenderCategory
import fr.felix_viart.cv_felix.utils.Utils

/**
 * Main composable entrypoint of the left side of the CV
 */
@Composable
fun cvLeftSide() {
    NameAndPhoto()
    AboutMe()
    RenderCategory("Contact Me",  Utils.getRandomAmountOfIconText(min = 2, max = 5))
    RenderCategory("Socials",  Utils.getRandomAmountOfIconText(min = 3, max = 7))
}