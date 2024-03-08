package com.example.test.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.R
import com.example.test.ui.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BaoNguyenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Bai4()
                }
            }
        }
    }
}
@Composable
fun Bai1(modifier: Modifier = Modifier){
    val img = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier.fillMaxWidth().fillMaxHeight())
    {


        Box {
            Image(
                painter = img,
                contentDescription = null

            )
        }
        Text(
            text = "Jetpack Compose tutorial" ,
            fontSize = 24.sp ,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.\n",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp , 0.dp),


        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp),
            )








    }
}
@Composable
fun Bai2(modifier: Modifier = Modifier) {
    val img1 = painterResource(R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxHeight().fillMaxWidth()) {
        Image(
            painter = img1,
            contentDescription = null ,
        )

        Text(
            text = "All tasks completed" ,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(0.dp , 24.dp , 0.dp ,8.dp),

            )
        Text(
            text = "Nice work!" ,
            fontSize = 16.sp,
            )
    }
}


@Composable
fun Collumns(modifier: Modifier = Modifier, title: String, content: String, Mau: Color ){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Mau)
            .padding(16.dp)
            .fillMaxHeight()


        ) {
        Text(
            text = title ,
            modifier = Modifier.padding(0.dp , 0.dp , 0.dp , 16.dp) ,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = content ,
            modifier = Modifier.padding(0.dp , 0.dp , 0.dp , 16.dp) ,
            textAlign = TextAlign.Justify
            )
    }
}
@Composable
fun Bai3() {
    Column {
        Row (modifier = Modifier.weight(1f) ) {
            Collumns(modifier = Modifier.weight(.5f),"Text composable" , "Displays text and follows the recommended Material Design guidelines." , Mau1)
            Collumns(modifier = Modifier.weight(.5f),"Text composable" , "Displays text and follows the recommended Material Design guidelines." , Mau2)

        }

        Row (modifier = Modifier.weight(1f) ){
            Collumns(modifier = Modifier.weight(.5f),"Text composable" , "Displays text and follows the recommended Material Design guidelines." , Mau3)
            Collumns(modifier = Modifier.weight(.5f),"Text composable" , "Displays text and follows the recommended Material Design guidelines." , Mau4)

        }
    }
}
@Composable
fun Bai4(modifier: Modifier = Modifier){
    val img = painterResource(id = R.drawable.ic_android_black_24dp)

    val img1 = painterResource(id = R.drawable.baseline_local_phone_24)
    val img2 = painterResource(id = R.drawable.baseline_email_24)
    val img3 = painterResource(id = R.drawable.baseline_emergency_share_24)

    Column (modifier = modifier) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .weight(.6f)
                .fillMaxWidth()
        )
        {
            Box {
                Image(painter = img, contentDescription = null ,
                    Modifier
                        .width(200.dp)
                        .height(200.dp))
            }
            Text(text = "Bảo Nguyên" , fontSize = 40.sp)
            Text(text = "Android Developer Extraordinaire" , fontSize = 20.sp , fontWeight = FontWeight.Bold , modifier = Modifier.padding(5.dp) , color = Color.Green )
        }
        Column (
            modifier = modifier
                .weight(.4f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {

                Column() {
                    Image(
                        painter = img1,
                        contentDescription = null ,
                        colorFilter = ColorFilter.tint(Color.Green),
                        modifier = Modifier
                            .padding(10.dp, 5.dp)
                            .width(30.dp)
                            .height(30.dp)

                    )

                    Image(
                        painter = img3,
                        contentDescription = null ,
                        colorFilter = ColorFilter.tint(Color.Green),
                        modifier = Modifier
                            .padding(10.dp, 5.dp)
                            .width(30.dp)
                            .height(30.dp)

                    )

                    Image(
                        painter = img2,
                        contentDescription = null ,
                        colorFilter = ColorFilter.tint(Color.Green),
                        modifier = Modifier
                            .padding(10.dp, 5.dp)
                            .width(30.dp)
                            .height(30.dp)

                    )

                }

                Column {
                    Text(text = "0336 184 132" , fontSize = 20.sp, modifier = Modifier.padding(10.dp, 5.dp))
                    Text(text = "@AndroidDev" , fontSize = 20.sp,  modifier = Modifier.padding(10.dp, 5.dp))
                    Text(text = "nguyenhb.22it@vku.udn.vn" , fontSize = 20.sp,  modifier = Modifier.padding(10.dp, 5.dp))
                }

            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

        Bai4()

}