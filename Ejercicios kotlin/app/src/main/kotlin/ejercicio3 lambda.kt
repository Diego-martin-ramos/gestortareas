package org.example.app

fun main() {

    val cuadrado: (Int) -> Int = { it * it }

    val esPar: (Int) -> Boolean = { it % 2 == 0 }

    println("Cuadrado de 4: ${cuadrado(4)}")
    println("Cuadrado de 7: ${cuadrado(7)}")
    println("Cuadrado de -3: ${cuadrado(-3)}")

    println("---")

    println("¿Es par el 4?: ${esPar(4)}")
    println("¿Es par el 7?: ${esPar(7)}")
    println("¿Es par el 0?: ${esPar(0)}")
}