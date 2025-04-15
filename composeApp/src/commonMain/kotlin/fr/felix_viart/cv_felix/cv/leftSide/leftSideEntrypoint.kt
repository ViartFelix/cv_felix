package fr.felix_viart.cv_felix.cv.leftSide

import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.contracts.ComposableInterface
import fr.felix_viart.cv_felix.cv.leftSide.competence.SingleCompetenceComposable
import fr.felix_viart.cv_felix.cv.leftSide.competence.photoComposable

/**
 * Main composable entrypoint of the left side of the CV
 */
@Composable
fun cvLeftSide(
    competences: List<ComposableInterface>,
    languages: List<ComposableInterface>,
) {
    photoComposable()

    SingleCompetenceComposable("Compétences", competences)
    SingleCompetenceComposable("Langues", languages)
}