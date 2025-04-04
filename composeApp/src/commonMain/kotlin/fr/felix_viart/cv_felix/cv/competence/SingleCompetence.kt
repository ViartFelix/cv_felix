package fr.felix_viart.cv_felix.cv.competence

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.contracts.ComposableInterface

@Composable
fun SingleCompetenceComposable(
    title: String,
    content: List<ComposableInterface>? = null,
    titleBackgroundColor: Color = Color(8, 68, 163, 255),
    titleColor: Color = Color.White,
    mainBackgroundColor: Color = Color(66, 135, 245, 255)
) {
    Column(
        modifier = Modifier.fillMaxWidth().background( mainBackgroundColor ),
    ) {
        val hasContent = null !== content && content.isNotEmpty()

        val bottomMargin = (if ( hasContent ) { 5 } else { 0 }).dp

        Row(
            modifier = Modifier.background( titleBackgroundColor ).fillMaxWidth().padding(12.dp)
        ) {
            Text(
                modifier = Modifier.padding(bottom = bottomMargin),
                text = title,
                color = titleColor,
            )
        }

        if( hasContent ) {
            var index = 0

            content!!.forEach { element ->
                //if last element, add a bottom margin
                val addedMargin = ( if (index == content.size - 1) { 30 } else {0} ).dp

                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = addedMargin, start = 20.dp, end = 20.dp)
                ) {
                    element.getComposable()
                }

                index++
            }
        }
    }
}