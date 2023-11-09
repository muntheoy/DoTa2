package com.example.dota2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
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

object ReviewAndRatingHeaderDimensions {
    val headerFontSize = 16.sp
    val headerFontWeight = FontWeight.Bold
    val headerLetterSpacing = 0.6.sp

    val ratingValueFontSize = 48.sp
    val ratingValueFontWeight = FontWeight.Bold

    val starsImagePadding = 20.dp
    val reviewsFontSize = 12.sp
    val reviewsFontColor = Color.Gray
    val reviewsLetterSpacing = 0.5.sp
    val reviewsFontWeight = FontWeight.Normal
    val reviewsTopPadding = 5.dp
    val verticalPadding = 10.dp
}

@Composable
fun ReviewAndRatingHeader(
    ratingValue: Number, numberOfRaters: Number
) {
    Column {
        Text(
            text = stringResource(id = R.string.review_and_rating_header),
            fontSize = ReviewAndRatingHeaderDimensions.headerFontSize,
            style = TextStyle(
                fontFamily = FontFamily,
                fontWeight = ReviewAndRatingHeaderDimensions.headerFontWeight
            ),
            color = Color.White,
            letterSpacing = ReviewAndRatingHeaderDimensions.headerLetterSpacing
        )
        Row(modifier = Modifier.padding(top = ReviewAndRatingHeaderDimensions.verticalPadding)) {
            Text(
                text = ratingValue.toString(),
                fontSize = ReviewAndRatingHeaderDimensions.ratingValueFontSize,
                style = TextStyle(
                    fontFamily = FontFamily,
                    fontWeight = ReviewAndRatingHeaderDimensions.ratingValueFontWeight
                ),
                color = Color.White
            )
            Column(
                modifier = Modifier
                    .padding(start = ReviewAndRatingHeaderDimensions.verticalPadding)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rating_stars),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = ReviewAndRatingHeaderDimensions.starsImagePadding)
                )
                Text(
                    text = numberOfRaters.toString() + "M Reviews",
                    fontSize = ReviewAndRatingHeaderDimensions.reviewsFontSize,
                    color = ReviewAndRatingHeaderDimensions.reviewsFontColor,
                    letterSpacing = ReviewAndRatingHeaderDimensions.reviewsLetterSpacing,
                    style = TextStyle(
                        fontFamily = FontFamily,
                        fontWeight = ReviewAndRatingHeaderDimensions.reviewsFontWeight
                    ),
                    modifier = Modifier.padding(top = ReviewAndRatingHeaderDimensions.reviewsTopPadding)
                )
            }
        }
    }
}

@Preview
@Composable
fun ReviewAndRatingHeaderReview(){
    ReviewAndRatingHeader(ratingValue = 4.9, numberOfRaters = 70)
}