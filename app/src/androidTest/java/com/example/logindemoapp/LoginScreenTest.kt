package com.example.logindemoapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import org.junit.Rule
import org.junit.Test

class LoginScreenTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()


    // Clicks the login button without inputting anything into the text fields
    // checks for error message that says "Email and Password cannot be empty"
    @Test
    fun loginFailsWithEmptyFields() {
        composeTestRule.onNodeWithText("Login").performClick()
        composeTestRule.onNodeWithText("Email and password cannot be empty").assertIsDisplayed()
    }

    // Inputs correct email and password into the text fields
    // Clicks the login button
    // checks for success message that says "Login Successful"
    @Test
    fun loginSucceedWithCorrectCredentials() {
        composeTestRule.onNodeWithText("Email").performTextInput("test@example.com")
        composeTestRule.onNodeWithText("Password").performTextInput("1234")
        composeTestRule.onNodeWithText("Login").performClick()
        composeTestRule.onNodeWithText("Login Successful").assertIsDisplayed()
    }
}