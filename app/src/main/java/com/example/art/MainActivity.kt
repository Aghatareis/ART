package com.example.art

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.art.ui.theme.ARTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ARTTheme {
                    CardNumberOne()
                }
            }
        }
    }

@Preview
@Composable
fun CardNumberOne(){
    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color.White
            ){
        Column (
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(45.dp)
                )
        {
            NumberImage(
                painter = painterResource(id = R.drawable.sakuna)
            )

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .padding(65.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Nome Do Personagem"
                )

                Text(
                    text = "Desrição"
                )
            }
        }
        Row (
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(50.dp)
        )
        {
            Button(
                onClick = { /*TODO*/ })
            {
                Text(text = "Anterior")
            }

            Button(
                onClick = { /*TODO*/ })
            {
                Text(text = "Avançar")
            }
        }
    }
}

@Composable
fun NumberImage(painter: Painter){
    Image(
        painter = painter ,
        contentDescription = null,
        modifier = Modifier
            .padding(top = 25.dp)
            .fillMaxWidth()


    )
}