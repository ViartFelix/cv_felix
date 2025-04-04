package fr.felix_viart.cv_felix.cv

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import cv_felix.composeapp.generated.resources.Res
import cv_felix.composeapp.generated.resources.main_photo
import org.jetbrains.compose.resources.painterResource

@Composable
fun photoComposable()
{
    Image(
        painter = painterResource(Res.drawable.main_photo),
        contentDescription = "Photo Félix Viart",
        modifier = Modifier.fillMaxWidth().aspectRatio( 1f ),
        contentScale = ContentScale.Crop,
    )
}