package fr.felix_viart.cv_felix.cv.right.skills.spoken

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.composables.CvText
import fr.felix_viart.cv_felix.data.skills.SingleLanguage
import fr.felix_viart.cv_felix.utils.Palette
import fr.felix_viart.cv_felix.utils.TextStyle

@Composable
fun AllSpokenLanguages(
    languages: List<SingleLanguage>,
    spaceBellowTitle: Dp = 12.dp,
    orderByLevel: Boolean = true,
    spaceBetween: Dp = 2.dp,
    paddingLeft: Dp = 32.dp,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(spaceBellowTitle)
    ) {
        CvText("LANGUAGES", TextStyle.Subtitle, Palette.White)

        Column(
            modifier = Modifier.padding(start = paddingLeft),
            verticalArrangement = Arrangement.spacedBy(spaceBetween)
        ) {
            val finalLanguages: List<SingleLanguage> = if( orderByLevel ) {
                languages.sortedByDescending {
                    it.level.level
                }
            } else {
                languages
            }

            finalLanguages.forEach {
                SingleSpokenLanguage(it)
            }
        }
    }
}