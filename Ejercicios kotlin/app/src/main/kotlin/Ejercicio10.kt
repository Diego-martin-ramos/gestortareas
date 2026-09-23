package org.example.app

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Introduce el radio de la circunferencia: ")
    val radio = readln().toDoubleOrNull() ?: return println("Entrada no válida.")

    val longitud = 2 * PI * radio
    val area = PI * radio.pow(2)

    println("Longitud: %.2f".format(longitud))
    println("Área: %.2f".format(area))
}