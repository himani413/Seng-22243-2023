package com.phimani.android.driver

import com.phimani.android.driver.services.HelloMeassageService
import org.junit.Assert
import org.junit.Test

class HelloMessageServiceTests {

    @Test
    fun it_should_return_error_on_empty_name(){
        val service = HelloMeassageService()
        val message = service.compose("","12")
        Assert.assertEquals("Name should not be empty",message)
    }

    @Test
    fun it_should_return_error_on_empty_age(){
        val service = HelloMeassageService()
        val message = service.compose("Himani","")
        Assert.assertEquals("Age should not be empty",message)
    }

    @Test
    fun it_should_return_correct_message_with_values(){
        val service = HelloMeassageService()
        val message = service.compose("Himani","23")
        Assert.assertEquals("Hello, Himani. You are 23 years old.",message)
    }
}