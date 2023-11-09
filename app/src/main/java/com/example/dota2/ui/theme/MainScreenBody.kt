package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R

object MainScreenBodyDimensions {
    val padding = 20.dp
    val spacing = 25.dp
}

@Composable
fun MainScreenBody(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 40.dp)

    ) {

        Column {



                Column(modifier = Modifier.padding(MainScreenBodyDimensions.padding)) {
                    Tags()
                    Spacer(modifier = Modifier.height(MainScreenBodyDimensions.spacing))
                    DescriotionGame(descriotionText = stringResource(id = R.string.game_descriotion))
                }



                Column(modifier = Modifier.padding(start = MainScreenBodyDimensions.padding)) {
                    PhotosCarousel(
                        previewResList = listOf(R.drawable.photo1, R.drawable.photo2, R.drawable.photo3)
                    )
                    Spacer(modifier = Modifier.height(25.dp))
                }



                Column(modifier = Modifier.padding(start = MainScreenBodyDimensions.padding, end = MainScreenBodyDimensions.padding)) {
                    ReviewAndRatingHeader(ratingValue = 4.9, numberOfRaters = 70)
                    Spacer(modifier = Modifier.height(15.dp))
                    CommentList(
                        listOf(user1, user2, user3)
                    )
                }

        }
    }
}


@Preview
@Composable
fun MainScreenBodyPreview(){
    MainScreenBody()
}