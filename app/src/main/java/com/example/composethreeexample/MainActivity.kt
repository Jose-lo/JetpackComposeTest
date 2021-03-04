package com.example.composethreeexample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RowLayout()
        }
    }
}

@Composable
fun test() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Hey look some there")
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "A BUTTON")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RowLayout()
}

@Composable
fun Column() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Image(
            painter = painterResource(id = R.drawable.happy_meal_senior_mcd_sweden_cover),
            contentDescription = "",
            modifier = Modifier.height(300.dp),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Happy Meal",
                style = TextStyle(fontSize = 26.sp)
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "800 Calories",
                style = TextStyle(fontSize = 17.sp)
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(
                text = "$5.99",
                style = TextStyle(fontSize = 17.sp, color = Color.Magenta)
            )
        }
    }
}

@Composable
fun RowLayout() {
    Column(){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "ITEM 1")
            Text(text = "ITEM 1")
        }
        Spacer(modifier = Modifier.padding(20.dp))
        Row(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .border(border = BorderStroke(width = 1.dp, color = Color.Black)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "ITEM 2")
        }
    }
}