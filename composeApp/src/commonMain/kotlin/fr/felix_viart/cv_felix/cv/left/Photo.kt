package fr.felix_viart.cv_felix.cv.left

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import cv_felix.composeapp.generated.resources.Res
import cv_felix.composeapp.generated.resources.main_photo
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

/**
 * The photo for my CV
 */
@Composable
fun photoComposable(
    rounded: Boolean = true,
    aspectRatio: Float = 1f,
    contentDescription: String = "Photo Félix Viart",
    source: DrawableResource = Res.drawable.main_photo,
) {
    val targetClip = if( rounded ) {
        CircleShape
    } else {
        //no round
        AbsoluteRoundedCornerShape(0.dp)
    }

    val finalModifier: Modifier = Modifier
        .fillMaxWidth()
        .aspectRatio( aspectRatio )
        .clip( targetClip )

    Image(
        painter = painterResource(source),
        contentDescription = contentDescription,
        modifier = finalModifier,
        contentScale = ContentScale.Crop,
    )
}