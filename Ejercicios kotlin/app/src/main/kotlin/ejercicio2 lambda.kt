package org.example.app

fun main() {
    val saludar: () -> Unit = {
        println("¡Hola! Bienvenido/a.")
    }
    saludar()
    saludar.invoke()
}