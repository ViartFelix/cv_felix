package fr.felix_viart.cv_felix

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.felix_viart.cv_felix.cv.left.cvLeftSide
import fr.felix_viart.cv_felix.utils.Palette

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
            modifier = Modifier
                .fillMaxWidth( leftSideSize )
                .fillMaxHeight()
                .background(Palette.Black)
                .padding(25.dp)
        ) {
            cvLeftSide(
                modifier = Modifier.padding(20.dp)
            )
        }

        //right side container
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            //cvRightSide()
        }
    }
}