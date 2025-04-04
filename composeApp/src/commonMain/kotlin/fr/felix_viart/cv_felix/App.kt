package fr.felix_viart.cv_felix

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import cv_felix.composeapp.generated.resources.Res
import cv_felix.composeapp.generated.resources.compose_multiplatform
import fr.felix_viart.cv_felix.cv.photoComposable

@Composable
@Preview
fun App() {
    MaterialTheme {
        mainCvEntrypoint()
    }
}