package fr.felix_viart.cv_felix

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            PercentageCompetence(
                "PHP",
                1.0f,
                Color.White,
                progressColor = Color.White,
                bgProgressColor = Color.Black
            ),

            PercentageCompetence(
                "JS",
                0.6456f,
                Color.White,
                progressColor = Color.White,
                bgProgressColor = Color.Black
            ),

            PercentageCompetence(
                "SQL",
                0.45f,
                Color.White,
                progressColor = Color.White,
                bgProgressColor = Color.Black
            ),
        )

        SingleCompetenceComposable("Compétences", competences)

    }
}