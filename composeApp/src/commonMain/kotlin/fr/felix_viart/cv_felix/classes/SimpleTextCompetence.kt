package fr.felix_viart.cv_felix.classes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import fr.felix_viart.cv_felix.contracts.ComposableInterface

data class SimpleTextCompetence(
    val title: String,
    val content: String,

    val color: Color,
): ComposableInterface {

    @Composable
    override fun getComposable() {
        return Column {
            Text(
                text = title,
                modifier = Modifier.width( super.textWidth ).padding( end = super.textRightMargin ),
                color = color,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = content,
                color = color,
                fontWeight = FontWeight.Normal
            )
        }
    }

}
