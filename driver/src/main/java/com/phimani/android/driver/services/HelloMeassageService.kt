package com.phimani.android.driver.services

class HelloMeassageService {

    fun compose(name: String, age: String): String {

        return if (age == "") {
            "Age should not be empty"
        } else if (name == "") {
            "Name should not be empty"
        } else {
            "Hello, $name. You are $age years old."
        }
    }
}