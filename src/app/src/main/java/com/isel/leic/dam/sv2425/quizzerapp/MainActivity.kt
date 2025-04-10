package com.isel.leic.dam.sv2425.quizzerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.isel.leic.dam.sv2425.quizzerapp.ui.theme.QuizzerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuizzerAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    innerPadding ->
                    Greeting(
                        userName = "Android",
                        avatar = painterResource(R.drawable.ic_avatar4)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting(userName: String,
             avatar: Painter) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .systemBarsPadding()
            .background(Color.Gray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(painterResource(R.drawable.ic_sun_color), contentDescription = "Icon",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Unspecified)
                Spacer(modifier = Modifier.width(24.dp))
                Text(text = stringResource(R.string.home_greeting), style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.tertiary)
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 4.dp),

                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(text = userName, style = MaterialTheme.typography.headlineSmall, color = MaterialTheme.colorScheme.onPrimary)
            }
        }

        Image(
            painter = avatar,
            contentDescription = "Avatar",
            modifier = Modifier
                .size(52.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
                .align(Alignment.CenterEnd)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuizzerAppTheme {
        Greeting("Ana Correia", painterResource(R.drawable.ic_avatar4))
    }
}
