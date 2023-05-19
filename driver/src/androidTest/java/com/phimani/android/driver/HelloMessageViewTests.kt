package com.phimani.android.driver


import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.phimani.android.driver.ui.theme.Seng222432023Theme
import org.junit.Rule
import org.junit.Test

class HelloMessageViewTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testUi(){
        composeTestRule.setContent{
            Seng222432023Theme {
                TwoGreetings()
            }
        }

        composeTestRule.onNodeWithText("Add").performClick()
        composeTestRule.onNodeWithText("Age").assertIsDisplayed()
    }
}