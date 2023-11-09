package com.example.dota2

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.dota2.ui.theme.MainScreen

internal val FontFamily = FontFamily(
    Font(R.font.sk_modernist_regular),
    Font(R.font.sk_modernist_mono, weight = FontWeight.Medium),
    Font(R.font.sk_modernist_bold, weight = FontWeight.Bold)
)

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        setContent {

            MainScreen()


        }
    }
}




@Preview(showBackground = true)
@Composable
fun DotaScreenHeaderPrewiev() {
    ComponentActivity()

}




