package org.example.app

fun main() {
    val calificar: (Double) -> String = { nota ->
        when {
            nota < 0.0 || nota > 10.0 -> "Nota no válida"
            nota < 5.0 -> "Insuficiente"
            nota < 6.0 -> "Suficiente"
            nota < 7.0 -> "Bien"
            nota < 9.0 -> "Notable"
            else -> "Sobresaliente"
        }
    }


    println(calificar(-1.0))
    println(calificar(4.5))
    println(calificar(5.5))
    println(calificar(6.8))
    println(calificar(8.5))
    println(calificar(9.8))
    println(calificar(10.5))
}