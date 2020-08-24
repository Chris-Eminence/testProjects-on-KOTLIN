package com.example.testprojects

import java.util.Scanner

class Employee{
    val reader = Scanner (System.`in`)
    fun employeesDetails(){

        println("Surname")
        val surnName = readLine()!!
        println("First name")
        val Firstname = readLine()
    }

    fun validation(){
        println("Enter your age")
        val age = reader.nextInt()

        if (age >= 20){
            println("you are eligible to apply")
        }else{
            println("Try again when you are up to 20")
        }
    }
}
fun main(){
    val obj = Employee()
    obj.employeesDetails()
    obj.validation()
}