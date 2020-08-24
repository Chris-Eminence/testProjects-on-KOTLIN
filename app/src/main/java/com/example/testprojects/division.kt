package com.example.testprojects

import java.util.Scanner

//program to Divide two numbers

class Division{
    fun divide(){
        val reader = Scanner (System.`in`)

        println("Enter your first number")
        var firstNumber = reader.nextInt()

        println("Enter your second number")
        var secondNumber = reader.nextInt()

        var result = firstNumber / secondNumber
        println("Your divided result is $result")
    }
}

fun main(){
    val obj = Division()
    obj.divide()
}