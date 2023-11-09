package com.example.dota2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.dota2.R

object CircularAvatarDimensions {
    val avatarSize = 40.dp
}

@Composable
fun CircularAvatar(imageResId: Int) {
    Box(
        modifier = Modifier
            .size(CircularAvatarDimensions.avatarSize)
            .clip(CircleShape)
    ) {
        val imagePainter = painterResource(id = imageResId)
        Image(
            painter = imagePainter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
fun CircularAvatarPreview(){
    CircularAvatar(imageResId = R.drawable.rozhkov_alexey)
}