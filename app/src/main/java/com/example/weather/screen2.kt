package com.example.weather


import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.weather.model.listofdata
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


class screen2 : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color(android.graphics.Color.parseColor("#FEB054"))
                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color =
                        Color(android.graphics.Color.parseColor("#FEB054"))
                    )
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        Icons.Default.ArrowBack,
                        modifier = Modifier.clickable(onClick = {
                        navigator?.push(screen1())}),
                        contentDescription = "back",
                    )
                    Text(
                        text = "Next 7 Days",
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier
                            .padding(end = 30.dp)
                            .weight(0.1f), color = Color.Black
                    )
                }
                Spacer(modifier = Modifier.height(30.dp))
                Box(modifier = Modifier
                    .background(
                        color = Color.White.copy(alpha = 0.4f),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .graphicsLayer {
                        alpha = 0.8f
                        clip = true
                    }
                    .fillMaxWidth()
                ) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color.White.copy(alpha = 0.4f),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .graphicsLayer {
                            alpha = 0.8f
                            clip = true
                        }) {
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier
                                .fillMaxWidth(),
                        ) {
                            Text(
                                text = "Tommorow",
                                fontSize = 15.sp,
                                color = Color.Black,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .padding(10.dp)
                            )
                            Box(
                                modifier = Modifier
                                    .background(color = Color.Transparent)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .background(color = Color.Transparent)
                                ) {
                                    Text(
                                        text = "22%",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically),
                                        textAlign = TextAlign.End
                                    )
                                    //Spacer(modifier = Modifier.width(20.dp))
                                    Image(
                                        painter = painterResource(id = R.drawable.img_7),
                                        contentDescription = "img",
                                        modifier = Modifier
                                            .padding(5.dp)
                                            .size(60.dp)
                                    )
                                }
                            }
                        }

                        Row(
                            modifier = Modifier
                                .background(color = Color.Transparent)
                                .align(Alignment.CenterHorizontally)
                        ) {
                            Column(
                                modifier = Modifier
                                    .background(color = Color.Transparent)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_4),
                                    contentDescription = "img",
                                    modifier = Modifier.size(60.dp)
                                )
                                Text(
                                    text = "1 cm",
                                    color = Color.Black,
                                    fontSize = 13.sp,
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                )
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            Column(
                                modifier = Modifier
                                    .background(color = Color.Transparent)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_5),
                                    contentDescription = "img",
                                    modifier = Modifier.size(60.dp)
                                )
                                Text(
                                    text = "15 km/h",
                                    color = Color.Black,
                                    fontSize = 13.sp,
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                )
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            Column(
                                modifier = Modifier
                                    .background(color = Color.Transparent)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_5),
                                    contentDescription = "50%",
                                    modifier = Modifier
                                        .height(60.dp)
                                        .width(60.dp)
                                )
                                Text(
                                    text = "1 cm",
                                    color = Color.Black,
                                    fontSize = 13.sp,
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(15.dp))
                    }
                }
                Spacer(modifier = Modifier.height(40.dp))
                LazyColumn(content = {
                    items(listofdata()) { item ->
                        days(
                            time = item.time,
                            image = item.image,
                            degree = item.degree,
                            day = item.day
                        )
                    }
                })
            }
        }
    }
}

@Composable
fun days(time: String,image:Int,degree:String,day:String) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(
                color = Color.White.copy(alpha = 0.4f),
                shape = RoundedCornerShape(15.dp)
            )
            .graphicsLayer {
                alpha = 0.8f
                clip = true
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
        ) {

            Text(
                text = day,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 10.dp),
                fontSize = 15.sp
            )
            Box (modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
                contentAlignment = Alignment.CenterEnd){
                Text(
                    text = degree,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(end = 50.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 15.sp
                )
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "Humidity",
                    modifier = Modifier
                        .padding(top = 9.dp)
                        .width(60.dp)
                )
            }


        }
    }
    Spacer(modifier = Modifier.height(5.dp))
}