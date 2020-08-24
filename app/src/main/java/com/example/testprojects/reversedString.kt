package com.example.testprojects

class Reversed{
    fun rev(){
        println("Type a word you want to reverse")
        val word = readLine()!!
        val reverse = word.reversed()
        print(reverse)
    }
}

fun main(){
    val ttt = Reversed()
        ttt.rev()

}