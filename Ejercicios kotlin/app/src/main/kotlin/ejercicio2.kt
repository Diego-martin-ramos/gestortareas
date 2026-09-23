package org.example.app

fun main(){
    println("introduzca su edad")
    val edad : Int = readln().toInt()
    if (edad <= 17) {
        println("Es menor de edad")
    } else {
        println("Es mayor de edad")
    }
}