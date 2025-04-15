package fr.felix_viart.cv_felix

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import fr.felix_viart.cv_felix.contracts.ComposableInterface
import fr.felix_viart.cv_felix.cv.leftSide.cvLeftSide
import fr.felix_viart.cv_felix.enums.ScreenSize

/**
 * Main CV entrypoint.
 * This is where the Cv is going to get rendered.
 */
@Composable
fun mainCvEntrypoint(
    competences: List<ComposableInterface>,
    languages: List<ComposableInterface>,
) {
    //main container
    Row(
        modifier = Modifier.fillMaxSize().background( Color.Green )
    ) {
        BoxWithConstraints {
            when {
                maxWidth <= ScreenSize.Small.width -> {
                    Column (
                        modifier = Modifier.fillMaxSize()
                    ) {
                        cvLeftSide(competences, languages)
                        Text("GROS BOUVIER", modifier = Modifier.fillMaxWidth().background( Color.Red ))
                    }
                }
                else -> {
                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        //container for the left side of the CV
                        Column(
                            modifier = Modifier.fillMaxWidth(1.0f/3.0f).fillMaxHeight()
                        ) {
                            cvLeftSide(competences, languages)
                        }

                        //and container for the right side
                        Column(
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text("GROS BOUVIER", modifier = Modifier.fillMaxWidth().background( Color.Red ))
                        }
                    }
                }
            }
        }
    }
}