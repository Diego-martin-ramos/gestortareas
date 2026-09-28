package org.example.app

fun main() {
    val suma: (Int, Int) -> Int = { a, b -> a + b }

    val resta = { a: Int, b: Int -> a - b }

    println("Suma: ${suma(3, 4)}")
    println("Resta: ${resta(10, 4)}")
}