package com.phimani.android.driver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.phimani.android.driver.ui.theme.Seng222432023Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Seng222432023Theme {
                TwoGreetings()
            }
        }
    }
}


@Composable
fun TwoGreetings(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column() {
            Greeting("Himani")
            Greeting("Android")
            
            Button(onClick = {
                Log.d("Two Greetings","You clicked")
            }) {
                Text(text = "Click me!")
            }
        }

    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TwoGreetings()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewDark() {
    Seng222432023Theme (darkTheme = true){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Himani")
        }
    }
}