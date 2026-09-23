package org.example.app

fun main() {
    print("Introduce tu peso en la Tierra (kg): ")
    val pesoTierra = readln().toDoubleOrNull() ?: return println("Entrada no válida.")

    val gravedadTierra = 9.8
    val gravedadLuna = 1.62

    val pesoLuna = (pesoTierra / gravedadTierra) * gravedadLuna

    println("Tu peso en la Luna sería de %.2f kg.".format(pesoLuna))
}