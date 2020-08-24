package com.example.testprojects
import java.util.Scanner

class Multiplication{
    fun multi(){
        val reader = Scanner (System.`in`)

        println("Enter your first number")
        var firstNumber = reader.nextInt()

        println("Enter your second number")
        var secondNumber = reader.nextInt()

        var result = firstNumber * secondNumber
        println("Your multiplied result is $result")
    }
}

fun main(){
    val obj = Multiplication()
    obj.multi()
}