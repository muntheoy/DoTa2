package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2.FontFamily
import com.example.dota2.R

object PrimaryOvalButtonDimensions {
    val cornerRadius = 20
    val fontSize = 20.sp
    val fontWeight = FontWeight.W700
    val letterSpacing = 0.6.sp
}

@Composable
fun PrimaryOvalButton(modifier: Modifier = Modifier) {

    TextButton(
        onClick = {},
        modifier = modifier,
        shape = RoundedCornerShape(PrimaryOvalButtonDimensions.cornerRadius),
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.primary_oval_button_color))
    ) {
        Text(
            text = stringResource(id = R.string.button_text),
            style = TextStyle(
                fontFamily = FontFamily,
                fontWeight = PrimaryOvalButtonDimensions.fontWeight
            ),
            color = colorResource(id = R.color.black),
            fontSize = PrimaryOvalButtonDimensions.fontSize,
            letterSpacing = PrimaryOvalButtonDimensions.letterSpacing
        )
    }
}

@Preview
@Composable
fun PrimaryOvalButtonPreview() {
    PrimaryOvalButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 24.dp,
                end = 24.dp,
                top = 40.dp,
                bottom = 50.dp,
            )
            .height(height = 64.dp)
    )
}