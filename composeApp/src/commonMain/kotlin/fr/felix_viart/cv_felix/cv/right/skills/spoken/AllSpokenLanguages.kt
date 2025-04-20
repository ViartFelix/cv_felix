package fr.felix_viart.cv_felix.cv.right.skills.spoken

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.data.skills.SingleLanguage

@Composable
fun AllSpokenLanguages(
    languages: List<SingleLanguage>
) {
    Column {
        Text("LANGUAGES")

        Row {
            languages.forEach {
                Column {
                    SingleSpokenLanguage(it)
                }
            }
        }
    }
}