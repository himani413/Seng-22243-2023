package com.phimani.android.driver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.phimani.android.driver.services.Calculate
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TwoGreetings(){

    var number1 by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0,7)))
    }

    var number2 by rememberSaveable(stateSaver = TextFieldValue.Saver) {
        mutableStateOf(TextFieldValue("", TextRange(0,7)))
    }

    var total by remember { mutableStateOf(0) }

    var calculate  = Calculate()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        Column() {
            OutlinedTextField(
                value = number1,
                onValueChange = {number1 = it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                label = {Text("Number 1")}
            )
            OutlinedTextField(
                value = number2,
                onValueChange = {number2 = it},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                label = {Text("Number 2")}
            )
            Text(text = "Total is $total")
            Button(onClick = {
                total = calculate.add(number1.text.toInt(),number2.text.toInt())

                Log.d("TwoGreetings","total is $total")

            }) {
                Text(text = "Add")
            }
        }

    }
}



@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OutlinedNumberTextField(label: String, _text: TextFieldValue){
    var text = _text

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