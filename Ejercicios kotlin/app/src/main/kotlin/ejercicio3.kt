package org.example.app

fun main (){
    println("introduzca un numero para saber si el numero es multiplo de 7")
    val numero : Int = readln().toInt()
    if (numero % 7 == 0) {
        println("el $numero es multiplo de 7")
    } else {
        println("el $numero no es multiplo de 7")
    }
}