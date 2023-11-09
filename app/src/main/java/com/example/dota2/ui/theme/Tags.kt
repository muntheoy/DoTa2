package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R

@Composable
fun Tags() {
    val tagsArray = stringArrayResource(id = R.array.tag_array)

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
    ) {
        tagsArray.forEach { tag ->
            Tag(onClick = {}, tag = tag)
            Spacer(modifier = Modifier.width(15.dp))
        }
    }
}

@Preview
@Composable
fun TagsPreview() {
    Tags()
}