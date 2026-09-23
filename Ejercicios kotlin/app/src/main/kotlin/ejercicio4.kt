package org.example.app
    fun bisiesto(anio: Int): Boolean{
    return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)
}
    fun main (){
        println("introduzca el año que quiera saber si es bisiesto o no")
        val anio: Int = readln().toInt()
        if (bisiesto(anio)){
            println("El año $anio es bisiesto")
        } else {
            println("el año $anio no es bisiesto")
        }
}