package fr.felix_viart.cv_felix.classes

import androidx.annotation.FloatRange
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
    @FloatRange(from = 0.0, to = 1.0)
    val percentage: Float,
    val fontColor: Color,

    val progressColor: Color,
    val bgProgressColor: Color,
): ComposableInterface {

    @Composable
    override fun getComposable() {
        return Column {
            Text(
                text = title,
                color = fontColor,
                modifier = Modifier.width( super.textWidth ).padding( end = super.textRightMargin ),
                fontWeight = FontWeight.Bold
            )

            //container for the progress bar and
            Column {
                val roundedPercentage = (percentage * 100).roundToInt()

                Text(
                    text = "$roundedPercentage %",
                    color = progressColor
                )

                LinearProgressIndicator(
                    progress = percentage,
                    color = progressColor,
                    backgroundColor = bgProgressColor,
                    modifier = Modifier.fillMaxWidth()
                )
            }

        }
    }

}
