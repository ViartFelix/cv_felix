package fr.felix_viart.cv_felix

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.classes.PercentageCompetence
import fr.felix_viart.cv_felix.contracts.ComposableInterface
import fr.felix_viart.cv_felix.cv.competence.SingleCompetenceComposable
import fr.felix_viart.cv_felix.cv.photoComposable

@Composable
fun mainCvEntrypoint()
{
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        photoComposable()


        val competences: List<ComposableInterface> = listOf(
            PercentageCompetence( "PHP", 1.0f ),
            PercentageCompetence( "JS", 0.6456f ),
            PercentageCompetence( "SQL", 0.45f ),
        )

        SingleCompetenceComposable("Compétences", competences)

        val languages: List<ComposableInterface> = listOf(
            PercentageCompetence( "Français", 1f, "Natif" ),
            PercentageCompetence( "Anglais", 0.9f, "900 TOEIC"),
            PercentageCompetence( "Espagnol", 0.15f, "Débutant"),
        )

        SingleCompetenceComposable("Langues", languages)
    }
}