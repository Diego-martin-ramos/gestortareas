package org.example.app

fun main() {
    print("Teclea la cantidad de euros: ")
    var cantidad = readln().toIntOrNull() ?: return println("Entrada no válida.")

    val billetes = intArrayOf(500, 200, 100, 50, 20, 10, 5)

    println("La cantidad de billetes que te tengo que dar es:")
    for (billete in billetes) {
        val numBilletes = cantidad / billete
        cantidad %= billete
        println("$numBilletes billetes de $billete€")
    }
}