package com.example.testprojects

import java.util.*

class Average{
    fun average(){
        val reader = Scanner (System.`in`)

        println("Enter your first number")
        var firstNumber = reader.nextInt()

        println("Enter your second number")
        var secondNumber = reader.nextInt()

        var result = (firstNumber + secondNumber) / 2
        println("Your Average number is $result")
    }
}

fun main(){
    val obj = Average()
    obj.average()
}