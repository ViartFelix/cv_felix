package fr.felix_viart.cv_felix.cv.leftSide.competence

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.contracts.ComposableInterface
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight

data class IconTextCompetence(
    val title: String,
    val content: String,
    val icon: ImageVector,
    val color: Color,
): ComposableInterface {

    @Composable
    override fun getComposable() {
        return Column {
            Icon(
                icon,
                contentDescription = "Icon of $title",
                tint = color,
                modifier = Modifier.padding( end = super.textRightMargin )
            )

            Text(
                text = title,
                color = color,
                modifier = Modifier.width( super.textWidth ).padding( end = super.textRightMargin ),
                fontWeight = FontWeight.Bold
            )

            Column {
                Text(
                    text = content,
                    color = color,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}
