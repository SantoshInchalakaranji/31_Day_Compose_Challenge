package com.prplmnstr.compose_day_1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.prplmnstr.compose_day_1.ui.theme.Compose_Day_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row (

                modifier = Modifier.background(androidx.compose.ui.graphics.Color.Black)
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center){

                Text (
                    text = buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                color = androidx.compose.ui.graphics.Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("J")
                        }
                        append("etpack ")

                        withStyle(
                            SpanStyle(
                                color = androidx.compose.ui.graphics.Color.Green,
                                fontSize = 50.sp
                            )
                        ) {
                            append("C")
                        }
                        append("ompose ")
                    },
                    color = androidx.compose.ui.graphics.Color.White,
                    fontSize = 30.sp,

                    fontWeight = FontWeight. Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }

            }
        }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_Day_1Theme {
        Greeting("Sagar")
    }
}