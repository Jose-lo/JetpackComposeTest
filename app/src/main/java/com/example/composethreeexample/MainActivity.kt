package com.example.composethreeexample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composethreeexample.ui.theme.ComposeThreeExampleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            test()
        }
    }
}

@Composable
fun test(){
    Column (modifier = Modifier.padding(16.dp)){
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
    test()
}