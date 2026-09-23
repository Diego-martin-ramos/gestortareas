package org.example.app

fun main() {
    print("¿Cuántos segundos duró el concierto?: ")
    val totalSegundos = readln().toIntOrNull() ?: return println("Entrada no válida.")

    val horas = totalSegundos / 3600
    val minutos = (totalSegundos % 3600) / 60
    val segundos = totalSegundos % 60

    println("Equivale a %d:%02d:%02d".format(horas, minutos, segundos))
}