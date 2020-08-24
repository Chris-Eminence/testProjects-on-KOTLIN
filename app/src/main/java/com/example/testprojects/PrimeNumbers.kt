package com.example.testprojects
import java.util.Scanner

//program to check for prime numbers

class PrimeNumbers{
    fun prime(){
        val reader = Scanner(System.`in`)

        println("Enter a number to check for the primeness")
        val number = reader.nextInt()
        var flag = false
        for (i in 2..number / 2){

    //codition for no-prime numbers

            if (number % i == 0){
                flag = true
                break
            }
        }

        if (!flag){
            println("$number is a prime number")
        }else{
            println("$number is not a prime number")
        }

    }
}

fun main(){
    val obj = PrimeNumbers()
    obj.prime()
}