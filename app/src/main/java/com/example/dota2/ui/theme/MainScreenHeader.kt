package com.example.dota2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2.FontFamily
import com.example.dota2.R

object DotaScreenHeaderDimensions {
    val topPadding = 280.dp
    val startPadding = 20.dp
    val iconSpacing = 16.dp
    val gameNameTopPadding = 60.dp
    val gameNameFontSize = 20.sp
    val gameNameLetterSpacing = 0.5.sp
    val gameNameFontStyle = TextStyle(
        fontFamily = FontFamily,
        fontWeight = FontWeight.Bold
    )
    val gameNameColor = Color.White
    val ratingTopPadding = 5.dp
    val starsSpacing = 5.dp
    val ratingFontSize = 12.sp
    val ratingColor = Color.Gray
}

@Composable
fun DotaScreenHeader(numberOfRatings: Number) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.cover),
            contentDescription = null
        )

        Box(
            modifier = Modifier
                .padding(top = DotaScreenHeaderDimensions.topPadding, start = DotaScreenHeaderDimensions.startPadding)
                .fillMaxHeight(0.2f)
        ) {

            Row(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.icon),
                    contentDescription = null,
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.width(DotaScreenHeaderDimensions.iconSpacing))
                Column(
                    modifier = Modifier.padding(top = DotaScreenHeaderDimensions.gameNameTopPadding)
                ) {
                    Text(
                        text = stringResource(id = R.string.game_name),
                        fontSize = DotaScreenHeaderDimensions.gameNameFontSize,
                        letterSpacing = DotaScreenHeaderDimensions.gameNameLetterSpacing,
                        style = DotaScreenHeaderDimensions.gameNameFontStyle,
                        color = DotaScreenHeaderDimensions.gameNameColor
                    )
                    Row(
                        modifier = Modifier.padding(top = DotaScreenHeaderDimensions.ratingTopPadding)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.stars5),
                            contentDescription = null
                        )
                        Text(
                            text = numberOfRatings.toString() + "M",
                            letterSpacing = DotaScreenHeaderDimensions.gameNameLetterSpacing,
                            fontSize = DotaScreenHeaderDimensions.ratingFontSize,
                            color = DotaScreenHeaderDimensions.ratingColor,
                            modifier = Modifier.padding(start = DotaScreenHeaderDimensions.starsSpacing)
                        )
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DotaScreenHeaderPreview() {
    DotaScreenHeader( numberOfRatings = 4.9)

}