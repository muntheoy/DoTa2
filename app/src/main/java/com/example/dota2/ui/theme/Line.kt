package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R

object LineDimensions{
    val lineThickness = 1.dp
    val linePaddingHorizontal = 10.dp
}

@Composable
fun Line() {
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = LineDimensions.linePaddingHorizontal),
        color = colorResource(id = R.color.line_color),
        thickness = LineDimensions.lineThickness
    )
}
@Preview
@Composable
fun LinePreview(){
    Line()
}

