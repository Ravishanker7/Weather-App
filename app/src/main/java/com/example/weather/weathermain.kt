package com.example.weather


import android.graphics.drawable.shapes.Shape
import android.view.View.OnClickListener
import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
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


class screen1 : Screen{
    @OptIn(ExperimentalFoundationApi::class)
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
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "search image",
                        modifier = Modifier.size(40.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "search image",
                        modifier = Modifier
                            .size(30.dp)
                            .padding(end = 10.dp)
                            .clickable(onClick = {
                                navigator?.push(screen2())
                            })
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Stockholm,",
                    fontSize = 40.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )
                Text(
                    text = "Sweden",
                    fontSize = 40.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )
                Text(
                    text = "Tue, Jun 30",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray
                )
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "weathe image",
                        modifier = Modifier
                            .size(200.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "weather",
                        modifier = Modifier
                            .size(150.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(60.dp)
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
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = "weather",
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(50.dp)
                                .align(Alignment.CenterVertically)
                        )
                        Text(
                            text = "RainFall",
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically),
                            fontSize = 15.sp
                        )
                        Text(
                            text = "3cm",
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .weight(1f)
                                .padding(end = 30.dp),
                            textAlign = TextAlign.End,
                            fontSize = 15.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(60.dp)
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
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_5),
                            contentDescription = "weather",
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(50.dp)
                                .align(Alignment.CenterVertically)
                        )
                        Text(
                            text = "Wind",
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically),
                            fontSize = 15.sp
                        )
                        Text(
                            text = "19km/h",
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .weight(1f)
                                .padding(end = 30.dp),
                            textAlign = TextAlign.End,
                            fontSize = 15.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(60.dp)
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
                        Image(
                            painter = painterResource(id = R.drawable.img_6),
                            contentDescription = "Humidity",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(top = 9.dp)
                                .width(50.dp)
                        )
                        Text(
                            text = "RainFall",
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically),
                            fontSize = 15.sp
                        )
                        Text(
                            text = "64%",
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .weight(1f)
                                .padding(end = 30.dp),
                            textAlign = TextAlign.End,
                            fontSize = 15.sp
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Today", color = Color.Black, fontWeight = FontWeight.Bold)
                    Text(text = "Tommorow", color = Color.Black)
                    Text(text = "Next 7 days", color = Color.Black)
                }
                Spacer(modifier = Modifier.height(10.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(color = Color.Gray)
                ) {

                }
                Spacer(modifier = Modifier.height(10.dp))

            }
        }
    }

}

@Composable
fun lazyrow(){
    LazyRow(content = {
        items(listofdata()) { item ->
            weatherdetail(time = item.time, image = item.image, degree = item.degree)
        }
    })
}
@Composable
fun weatherdetail(time: String,image:Int,degree:String){

        Box(
            modifier = Modifier
                .width(70.dp)
                .height(120.dp)
            ) {
            Column (horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(
                        color = Color.White.copy(alpha = 0.4f), shape = RoundedCornerShape(40.dp)
                    )
                    .graphicsLayer {
                        alpha = 0.8f
                        clip = true
                    }
             ){
                Text(text = time,
                    fontSize = 15.sp, color = Color.Black
                )
                Image(painter = painterResource(id = image),
                    contentDescription ="image",
                    modifier=Modifier.size(40.dp))
                Text(text = degree,
                    fontSize = 15.sp,
                    color = Color.Black)
            }
    }
    Spacer(modifier = Modifier.width(15.dp))
}