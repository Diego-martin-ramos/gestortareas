package org.example.app

fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

fun main() {
    val suma: (Int, Int) -> Int = { x, y -> x + y }

    val res1 = operar(5, 3, suma)
    println("1. Variable lambda (suma): $res1")

    val res2 = operar(10, 2, { x, y -> x * y })
    println("2. Lambda dentro de paréntesis (multiplicación): $res2")

    val res3 = operar(20, 4) { x, y -> x / y }
    println("3. Trailing lambda fuera de paréntesis (división): $res3")
}