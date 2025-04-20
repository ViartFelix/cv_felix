package fr.felix_viart.cv_felix.cv.right.skills.interests

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import fr.felix_viart.cv_felix.data.left.IconText

/**
 * Renders a single interest
 */
@Composable
fun SingleInterest(
    interest: IconText
) {
    Column(
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            interest.icon,
            contentDescription = "Icon"
        )

        Text(interest.content)
    }
}