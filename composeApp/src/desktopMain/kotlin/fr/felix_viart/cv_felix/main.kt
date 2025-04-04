package fr.felix_viart.cv_felix

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "cv_felix",
    ) {
        App()
    }
}