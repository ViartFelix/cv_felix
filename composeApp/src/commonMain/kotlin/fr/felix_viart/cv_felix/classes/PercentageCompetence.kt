package fr.felix_viart.cv_felix.classes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import fr.felix_viart.cv_felix.contracts.ComposableInterface
import kotlin.math.roundToInt

data class PercentageCompetence(
    val title: String,
    val progress: Float,
    val textValue: String? = null,
    val fontColor: Color = Color.White,
    val progressColor: Color = Color.White,
    val bgProgressColor: Color = Color.Black,
): ComposableInterface {

    @Composable
    override fun getComposable() {
        return Column {
            Text(
                text = title,
                color = fontColor,
                modifier = Modifier.fillMaxWidth().padding( end = super.textRightMargin ),
                fontWeight = FontWeight.Bold
            )

            //container for the progress bar and text
            Column {

                //compute the final text
                val finalText: String = if( textValue === null ) {
                    val roundedPercentage = (progress * 100).roundToInt()

                    "$roundedPercentage %"
                } else {
                    textValue
                }

                Text(
                    text = finalText,
                    color = progressColor
                )

                LinearProgressIndicator(
                    progress = progress,
                    color = progressColor,
                    backgroundColor = bgProgressColor,
                    modifier = Modifier.fillMaxWidth()
                )
            }

        }
    }

}
