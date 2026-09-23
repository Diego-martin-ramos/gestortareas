package org.example.app

import kotlin.math.sqrt

fun main() {
    print("Introduce el coeficiente a: ")
    val a = readln().toDoubleOrNull() ?: return
    print("Introduce el coeficiente b: ")
    val b = readln().toDoubleOrNull() ?: return
    print("Introduce el coeficiente c: ")
    val c = readln().toDoubleOrNull() ?: return

    if (a == 0.0) {
        println("No es una ecuación de segundo grado (a no puede ser 0).")
        return
    }

    val discriminante = b * b - 4 * a * c

    if (discriminante > 0) {
        val x1 = (-b + sqrt(discriminante)) / (2 * a)
        val x2 = (-b - sqrt(discriminante)) / (2 * a)
        println("Tiene dos soluciones reales: x1 = $x1, x2 = $x2")
    } else if (discriminante == 0.0) {
        val x = -b / (2 * a)
        println("Tiene una solución real doble: x = $x")
    } else {
        println("La ecuación no tiene soluciones reales.")
    }
}