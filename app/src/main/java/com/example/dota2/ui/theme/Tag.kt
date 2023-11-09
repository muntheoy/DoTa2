package com.example.dota2.ui.theme

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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

@Composable
fun Tag(onClick: () -> Unit, tag: String) {
    TextButton(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tag_button_color)),
        shape = RoundedCornerShape(40.dp),
        modifier = Modifier
            .width(IntrinsicSize.Max)


    ) {
        Text(
            text = tag.toUpperCase(),
            style = TextStyle(
                fontFamily = FontFamily,
                fontWeight = FontWeight.Normal
            ),
            color = colorResource(id = R.color.tag_text),
            fontSize = 10.sp
        )
    }


}

@Preview
@Composable
fun TagPreview(){
    Tag(onClick = {}, tag = "MOBA")
}