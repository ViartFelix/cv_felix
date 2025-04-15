package fr.felix_viart.cv_felix

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.contracts.ComposableInterface
import fr.felix_viart.cv_felix.cv.leftSide.competence.PercentageCompetence
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App()
{
    MaterialTheme {
        BoxWithConstraints(
            modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())
        ) {
            //set the data values
            val competences: List<ComposableInterface> = listOf(
                PercentageCompetence( "PHP", 1.0f ),
                PercentageCompetence( "JS", 0.6456f ),
                PercentageCompetence( "SQL", 0.45f ),
            )

            val languages: List<ComposableInterface> = listOf(
                PercentageCompetence( "Français", 1f, "Natif" ),
                PercentageCompetence( "Anglais", 0.9f, "900 TOEIC"),
                PercentageCompetence( "Espagnol", 0.15f, "Débutant"),
            )

            mainCvEntrypoint(competences, languages)
        }
    }
}