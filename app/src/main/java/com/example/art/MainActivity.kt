package com.example.art

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    var photo by remember { mutableStateOf(1) }

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
            when (photo) {
                1-> NumberImage(
                    R.string.Poster,
                    R.string.Poster_descrição,
                    R.drawable.poster,
                    onImageClick = {
                        photo = 2
                    }


                )

                2 -> NumberImage(
                    R.string.Nome_do_personagem_1,
                    R.string.Nome_do_personagem_1_descrição,
                    R.drawable.nanami,
                    onImageClick = {
                        photo = 3
                    }

                )

                3 -> NumberImage(
                    R.string.Nome_do_personagem_2,
                    R.string.Nome_do_personagem_2_descrição,
                    R.drawable.maki,
                    onImageClick = {
                        photo = 4
                    }
                )

                4  -> NumberImage(
                R.string.Nome_do_personagem_3,
                R.string.Nome_do_personagem_3_descrição,
                R.drawable.fig,
                onImageClick = {
                    photo = 5
                }
            )
                5 -> NumberImage(
                    R.string.Nome_do_personagem_4,
                    R.string.Nome_do_personagem_4_descrição,
                    R.drawable.sakuna,
                    onImageClick = {
                        photo = 6
                    }
                )

                6 -> NumberImage(
                    R.string.Nome_do_personagem_5,
                    R.string.Nome_do_personagem_5_descrição,
                    R.drawable.nobara,
                    onImageClick = {
                        photo = 7
                    }
                )

                7 -> NumberImage(
                    R.string.Nome_do_personagem_6,
                    R.string.Nome_do_personagem_6_descrição,
                    R.drawable.gojo,
                    onImageClick = {
                        photo = 1
                    }
                )
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .padding(65.dp)
                    .fillMaxWidth()
            ) {

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
fun NumberImage(recursoTextId: Int,recursoTextDescrição: Int, recursoImageId: Int, onImageClick:()-> Unit){


    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Image(
            painter = painterResource(id = recursoImageId) ,
            contentDescription = null,
            modifier = Modifier
                .padding(15.dp)
                .border(
                    BorderStroke(4.dp, color = Color(119, 136, 153)),
                    RoundedCornerShape(5.dp)

                )
                .clickable(onClick = onImageClick)


        )


        Text(
            text = stringResource(id = recursoTextId),
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier
                .padding( 6.dp)
        )

        Text(
            text = stringResource(id = recursoTextDescrição),
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth(),
            fontFamily = FontFamily.Monospace

        )


    }
}