package com.prplmnstr.compose_day_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.prplmnstr.compose_day_1.ui.theme.Compose_Day_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val constraints = ConstraintSet {
                val redBox = createRefFor("redBox")
                val yellowBox = createRefFor("yellowBox")

                constrain(redBox) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    width = Dimension.matchParent
                    height = Dimension.value(100.dp)

                }
                constrain(yellowBox) {
                    top.linkTo(redBox.bottom)
                    start.linkTo(parent.start)
                    width = Dimension.matchParent
                    height = Dimension.value(100.dp)

                }
            }

            ConstraintLayout(
                constraints,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)

            ) {
                Box(
                    modifier = Modifier
                        .background(Color.Yellow)
                        .layoutId("yellowBox")

                )
                Box(
                    modifier = Modifier
                        .background(Color.Red)
                        .layoutId("redBox")

                )
            }
        }
    }
}
