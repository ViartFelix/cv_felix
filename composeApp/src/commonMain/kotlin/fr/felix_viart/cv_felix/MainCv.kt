package fr.felix_viart.cv_felix

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.cv.photoComposable

@Composable
fun mainCvEntrypoint()
{
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        photoComposable()
    }
}