package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R

val user1 = CommentData(
    R.drawable.super_cat,
    "Super Cat",
    "June",
    20,
    2023,
    "My dad like it."
)
val user2 = CommentData(
    R.drawable.rozhkov_alexey,
    "Alexey Rozhkov",
    "May",
    21,
    2023,
    "“Once you start to learn its secrets, there’s a wild and exciting " +
            "variety of play here that’s unmatched, even by its peers.”"
)
val user3 = CommentData(
    R.drawable.ryan_gosling,
    "Ryan Gosling",
    "June",
    15,
    2023,
    "I survived at the end of DoTa."
)

@Composable
fun CommentList(comments: List<CommentData>) {
    Column {
        comments.forEach { commentData ->
            Comment(commentData = commentData)
            Spacer(modifier = Modifier.height(15.dp))
            Line()
            Spacer(modifier = Modifier.height(15.dp))
        }
    }
}
@Preview
@Composable
fun CommentListPreview() {
    CommentList(
        listOf(user1, user2, user3)
    )
}