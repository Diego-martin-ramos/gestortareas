package org.example.app

fun main() {
    val diccionario = listOf(
        "Computer" to "Ordenador",
        "Keyboard" to "Teclado",
        "Mouse" to "Ratón",
        "Screen" to "Pantalla",
        "Software" to "Programa",
        "Network" to "Red",
        "File" to "Archivo",
        "Memory" to "Memoria",
        "Code" to "Código",
        "Database" to "Base de datos"
    )

    println("%-15s %-15s".format("INGLÉS", "CASTELLANO"))
    println("------------------------------")
    for ((ingles, espanol) in diccionario) {
        println("%-15s\t%-15s".format(ingles, espanol))
    }
}