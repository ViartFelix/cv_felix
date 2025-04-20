package fr.felix_viart.cv_felix.cv.right.skills.languages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.data.skills.SingleSkill

@Composable
fun AllCodingLanguages(
    languages: List<SingleSkill>
) {
    Column {
        Text("PROGRAMMING")

        Row {
            languages.forEach {
                Column {
                    SingleCodingSkill(it)
                }
            }
        }
    }
}