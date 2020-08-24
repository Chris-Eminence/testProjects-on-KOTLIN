package com.example.testprojects
import java.util.Scanner

class Salary {
    val reader = Scanner(System.`in`)

    fun salaryCalculator() {

        println("Your name ")
        val name = readLine()

        println("How much is your clothes allowance? ")
        val clothAllowance = reader.nextInt()

        println("How much is your newspaper allowance? ")
        val newsPaper = reader.nextInt()

        println("How much is your transport allowance? ")
        val transportAllowance = reader.nextInt()

        println("How much is your weekend allowance? ")
        val weekend = reader.nextInt()

        println("How much is your monthly allowance? ")
        val monthlyPay = reader.nextInt()

        val monthlyResult = clothAllowance + newsPaper + transportAllowance + weekend + monthlyPay
        val anualResult = monthlyResult * 12

        println("$name your monthly earnings is $monthlyResult \nYour yearly earnings is $anualResult")
    }
}

fun main(){
    val obj = Salary()
    obj.salaryCalculator()
}
