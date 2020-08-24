package com.example.testprojects
import java.util.Scanner
//
//Project to check if the user a particular user is old a enough to see a movie
//

class AgeVerification{


    val reader = Scanner(System.`in`)

    fun userDetails(){
        println("Please Enter your name: ")
        val userName = readLine()!!

        println("Enter your age: ")
        val userAge = reader.nextInt()

        if (userAge >= 18){
            println("$userName You are welcome to see BBNaija")
        }else{
            println("$userName you are not Eligible to watch BBNaija")
        }
    }


}

fun main(){
    val obj = AgeVerification()
    obj.userDetails()
}