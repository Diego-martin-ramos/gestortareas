package colecciones

data class Producto(val nombre: String, val precio: Double)
data class Alumno(val nombre: String, val nota: Double)
data class Transaccion(val tipo: String, val importe: Double)

// Función auxiliar del ejercicio 9
fun rango(nota: Double) = when {
    nota < 5 -> "Suspenso"
    nota < 7 -> "Aprobado"
    nota < 9 -> "Notable"
    else -> "Sobresaliente"
}

fun main() {
    // 1. filter + sum
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter { it % 2 == 0 }
    println("1) Pares: $pares | Suma: ${pares.sum()}")

    // 2. map + maxBy
    val nombres = listOf("Ana", "Carlos", "Beatriz", "Luis")
    println("2) Longitudes: ${nombres.map { it.length }} | Más largo: ${nombres.maxBy { it.length }}")

    // 3. reduce (producto total)
    val lista = listOf(1, 2, 3, 4, 5)
    println("3) Producto con reduce: ${lista.reduce { acc, n -> acc * n }}")

    // 4. fold con valor inicial 100
    // Diferencia: reduce usa el primer elemento como acumulador inicial (y falla con lista vacía);
    // fold permite elegir el valor inicial (y con lista vacía devuelve ese valor).
    println("4) Producto con fold desde 100: ${lista.fold(100) { acc, n -> acc * n }}")

    // 5. sortedBy + maxBy
    val productos = listOf(Producto("Ratón", 15.5), Producto("Monitor", 199.9), Producto("Teclado", 45.0))
    println("5) Ordenados: ${productos.sortedBy { it.precio }} | Más caro: ${productos.maxBy { it.precio }}")

    // 6. flatMap
    val frases = listOf("hola mundo", "kotlin es genial", "me gusta programar")
    println("6) Palabras: ${frases.flatMap { it.split(" ") }}")

    // 7. all, any, count
    val edades = listOf(20, 17, 25, 16, 30)
    println("7) ¿Todos mayores? ${edades.all { it >= 18 }} | ¿Algún menor? ${edades.any { it < 18 }} | Menores: ${edades.count { it < 18 }}")

    // 8. partition
    val (listaPares, listaImpares) = (1..20).toList().partition { it % 2 == 0 }
    println("8) Pares: $listaPares | Impares: $listaImpares")

    // 9. groupBy con función auxiliar
    val alumnos = listOf(Alumno("Ana", 4.5), Alumno("Luis", 6.0), Alumno("Marta", 8.0), Alumno("Pedro", 9.5), Alumno("Eva", 3.0))
    println("9) Por rango: ${alumnos.groupBy { rango(it.nota) }}")

    // 10. filter + map + sum
    val transacciones = listOf(
        Transaccion("ingreso", 1000.0),
        Transaccion("gasto", 250.0),
        Transaccion("ingreso", 500.0),
        Transaccion("gasto", 100.0)
    )
    val ingresos = transacciones.filter { it.tipo == "ingreso" }.map { it.importe }.sum()
    val gastos = transacciones.filter { it.tipo == "gasto" }.map { it.importe }.sum()
    println("10) Balance final: ${ingresos - gastos}")
}
