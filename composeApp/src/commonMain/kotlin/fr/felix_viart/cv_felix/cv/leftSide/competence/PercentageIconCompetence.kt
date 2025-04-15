package fr.felix_viart.cv_felix.cv.leftSide.competence

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import fr.felix_viart.cv_felix.contracts.ComposableInterface
import kotlin.math.roundToInt

data class PercentageIconCompetence(
    val title: String,
    val percentage: Float,
    val fontColor: Color,
    val icon: ImageVector,

    val progressColor: Color,
    val bgProgressColor: Color,
): ComposableInterface {

    @Composable
    override fun getComposable() {
        return Column {
            Icon(
                icon,
                contentDescription = "Icon of $title",
                tint = fontColor,
                modifier = Modifier.padding( end = super.textRightMargin )
            )

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
