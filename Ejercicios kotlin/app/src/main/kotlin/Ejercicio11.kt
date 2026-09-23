package org.example.app

fun main() {
    print("Introduce un código entero (ej. 65 para 'A'): ")
    val codigo = readln().toIntOrNull() ?: return println("Entrada no válida.")

    val caracter = codigo.toChar()
    println("El número $codigo equivale al carácter ASCII: '$caracter'")
}