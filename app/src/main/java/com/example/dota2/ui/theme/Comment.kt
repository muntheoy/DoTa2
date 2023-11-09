package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2.FontFamily
import com.example.dota2.R

object CommentDimensions {
    val nameTextSize = 19.sp
    val dateTextSize = 12.sp
    val commentTextSize = 12.sp
    val avatarSpacing = 20.dp
    val textSpacing = 5.dp
    val commentSpacing = 15.dp
}

@Composable
fun Comment(commentData: CommentData) {
    Column {
        Row {
            CircularAvatar(commentData.imageResId)
            Column(
                modifier = Modifier
                    .padding(CommentDimensions.avatarSpacing)
            ) {
                Text(
                    text = commentData.name,
                    fontSize = CommentDimensions.nameTextSize,
                    letterSpacing = 0.5.sp,
                    style = TextStyle(
                        fontFamily = FontFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    color = Color.White
                )
                Text(
                    text = commentData.month + " " + commentData.date.toString() + "," + " " + commentData.year.toString(),
                    fontSize = CommentDimensions.dateTextSize,
                    letterSpacing = 0.5.sp,
                    style = TextStyle(
                        fontFamily = FontFamily,
                        fontWeight = FontWeight.Normal
                    ),
                    color = Color.Gray,
                    modifier = Modifier.padding(top = CommentDimensions.textSpacing)
                )
            }
        }
        Text(
            text = commentData.comment,
            fontSize = CommentDimensions.commentTextSize,
            letterSpacing = 0.5.sp,
            style = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal
            ),
            color = colorResource(id = R.color.comment_text_color),
            modifier = Modifier.padding(top = CommentDimensions.commentSpacing)
        )
    }
}
