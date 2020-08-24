package com.example.testprojects
import java.util.Scanner


class EvenNumbers {
    val reader = Scanner(System.`in`)
    fun evenNumbers() {

        println("Enter your number to check if its even")
        val number = reader.nextInt()
        if (number % 2 == 0){
            println("$number is even")
        }else{
            println("$number is odd")
        }
    }
}

fun main(){
    val obj = EvenNumbers()
    obj.evenNumbers()
}