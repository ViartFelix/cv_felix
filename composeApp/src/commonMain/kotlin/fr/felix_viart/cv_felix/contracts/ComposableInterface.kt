package fr.felix_viart.cv_felix.contracts

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

interface ComposableInterface {

    val textRightMargin: Dp
        get() = 5.dp

    val textWidth: Dp
        get() = 50.dp

    /**
     * Returns the composable for this class.
     */
    @Composable
    fun getComposable()
}