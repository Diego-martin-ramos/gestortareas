package org.example.app

fun main() {
    print("Introduce el primer número: ")
    val n1 = readln().toDoubleOrNull() ?: return
    print("Introduce el segundo número: ")
    val n2 = readln().toDoubleOrNull() ?: return
    print("Introduce el tercer número: ")
    val n3 = readln().toDoubleOrNull() ?: return

    if (n1 <= n2 && n2 <= n3) {
        println("Los números están ordenados de menor a mayor.")
    } else if (n1 >= n2 && n2 >= n3) {
        println("Los números están ordenados de mayor a menor.")
    } else {
        println("Los números no están ordenados.")
    }
}