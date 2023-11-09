package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.dota2.FontFamily
import com.example.dota2.R

object DescriotionGameDimensions{
    val textSize = 12.sp
}

@Composable
fun DescriotionGame(descriotionText: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            descriotionText,
            fontSize = DescriotionGameDimensions.textSize,
            color = colorResource(id = R.color.descriotion_game_text_color).copy(alpha = 0.7f),
            style = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal
            ),
            textAlign = TextAlign.Start,
            modifier = Modifier


        )
    }
}

@Preview
@Composable
fun DescriotionGameTextPreview(){
    DescriotionGame(descriotionText = stringResource(id = R.string.game_descriotion))
}
