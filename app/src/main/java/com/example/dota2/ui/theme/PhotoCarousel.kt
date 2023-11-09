package com.example.dota2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R

object PhotosCarouselDimensions {
    val imageHeight = 135.dp
    val imageCornerRadius = 10.dp
    val horizontalSpacerWidth = 15.dp
    val contentPadding = PaddingValues(
        start = 20.dp,
        top = 8.dp,
        end = 16.dp,
        bottom = 8.dp
    )
}

@Composable
fun PhotosCarousel(previewResList: List<Int>) {
    LazyRow(contentPadding = PhotosCarouselDimensions.contentPadding) {
        items(previewResList) { previewResId ->
            Image(
                painter = painterResource(id = previewResId),
                contentDescription = "image",
                modifier = Modifier
                    .height(PhotosCarouselDimensions.imageHeight)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(PhotosCarouselDimensions.imageCornerRadius))
            )
            Spacer(modifier = Modifier.width(PhotosCarouselDimensions.horizontalSpacerWidth))
        }
    }
}

@Preview
@Composable
fun PhotoCarouselPreview() {

    PhotosCarousel(
        previewResList = listOf(R.drawable.photo1, R.drawable.photo2, R.drawable.photo3)
    )
}