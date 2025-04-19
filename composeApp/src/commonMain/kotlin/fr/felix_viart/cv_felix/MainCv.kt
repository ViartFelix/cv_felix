package fr.felix_viart.cv_felix

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.felix_viart.cv_felix.cv.left.cvLeftSide
import fr.felix_viart.cv_felix.cv.right.cvRightSide

/**
 * Main CV entrypoint.
 * This is where the CV is going to get rendered.
 */
@Composable
fun mainCvEntrypoint(
    leftSideSize: Float,
) {
    //main container
    Row(
        modifier = Modifier.fillMaxSize()
    ) {
        //left side container
        Column(
            modifier = Modifier.fillMaxWidth( leftSideSize )
        ) {
            cvLeftSide()
        }

        //right side container
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            cvRightSide()
        }
    }
}