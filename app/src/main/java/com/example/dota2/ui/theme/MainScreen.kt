package com.example.dota2.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.screen_color))
    ) {
        LazyColumn(
            contentPadding = PaddingValues(bottom = 64.dp) // Учитываем высоту кнопки
        ) {
            item {
                DotaScreenHeader(numberOfRatings = 70)
            }
            item {
                MainScreenBody()
            }
        }

        PrimaryOvalButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 40.dp,
                    bottom = 20.dp
                )
                .height(height = 64.dp)
                .align(Alignment.BottomCenter)
        )
    }
}
@Preview
@Composable
fun MainScreenPreview(){
    MainScreen()
}