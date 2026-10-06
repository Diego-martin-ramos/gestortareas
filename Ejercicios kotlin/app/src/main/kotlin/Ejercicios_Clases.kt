package clases

import java.time.LocalDate
import java.time.Period

// 1. Persona con calcularEdad()
class Persona(val nombre: String, val fechaNacimiento: LocalDate) {
    fun calcularEdad() = Period.between(fechaNacimiento, LocalDate.now()).years
}

// 2. Vehiculo: la velocidad nunca baja de 0
class Vehiculo(val marca: String, val modelo: String, var velocidad: Int = 0) {
    fun acelerar(cantidad: Int) {
        velocidad += cantidad
    }

    fun frenar(cantidad: Int) {
        velocidad = maxOf(0, velocidad - cantidad)
    }
}

// 3. data class Empleado + copy()
data class Empleado(val nombre: String, val puesto: String, val salario: Double)

// 4. data class Rectangulo con propiedades calculadas
data class Rectangulo(val base: Double, val altura: Double) {
    val area get() = base * altura
    val perimetro get() = 2 * (base + altura)
}

// 5. Salario privado + require
class EmpleadoSeguro(val nombre: String, private var salario: Double) {
    fun subirSalario(porcentaje: Double) {
        require(porcentaje in 0.0..100.0) { "El porcentaje debe estar entre 0 y 100" }
        salario += salario * porcentaje / 100
    }

    fun mostrarSalario() = salario
}

// 6. Jerarquía de figuras
abstract class Figura {
    abstract fun calcularArea(): Double
}

class Circulo(val radio: Double) : Figura() {
    override fun calcularArea() = Math.PI * radio * radio
}

class Cuadrado(val lado: Double) : Figura() {
    override fun calcularArea() = lado * lado
}

// 7. data class Alumno con media calculada
data class Alumno(val nombre: String, val notas: List<Double>) {
    val media get() = if (notas.isEmpty()) 0.0 else notas.average()
}

// 8. ListaReproduccion con lista privada
class ListaReproduccion {
    private val canciones = mutableListOf<String>()

    fun añadirCancion(cancion: String) {
        canciones.add(cancion)
    }

    fun eliminarCancion(cancion: String) {
        canciones.remove(cancion)
    }

    fun mostrarCanciones() {
        canciones.forEachIndexed { i, c -> println("   ${i + 1}. $c") }
    }
}

// 9. data classes anidadas
data class Direccion(val calle: String, val ciudad: String)
data class Cliente(val nombre: String, val direccion: Direccion)

// 10. Temperatura con validación del cero absoluto
class Temperatura(val celsius: Double) {
    init {
        require(celsius >= -273.15) { "No puede estar por debajo del cero absoluto (-273.15 °C)" }
    }

    val fahrenheit get() = celsius * 9 / 5 + 32
    val kelvin get() = celsius + 273.15
}

fun main() {
    // 1
    val persona = Persona("Ana", LocalDate.of(2000, 5, 20))
    println("1) ${persona.nombre} tiene ${persona.calcularEdad()} años")

    // 2
    val coche = Vehiculo("Seat", "Ibiza")
    coche.acelerar(50)
    coche.frenar(80)
    println("2) Velocidad tras acelerar 50 y frenar 80: ${coche.velocidad}")

    // 3
    val emp = Empleado("Luis", "Programador", 2000.0)
    val empSubida = emp.copy(salario = emp.salario * 1.05)
    println("3) Original: $emp | Con subida: $empSubida")

    // 4
    val rect = Rectangulo(4.0, 3.0)
    println("4) Área: ${rect.area} | Perímetro: ${rect.perimetro}")

    // 5
    val empSeguro = EmpleadoSeguro("Marta", 1500.0)
    empSeguro.subirSalario(10.0)
    println("5) Salario tras subir 10%: ${empSeguro.mostrarSalario()}")
    try {
        empSeguro.subirSalario(150.0)
    } catch (e: IllegalArgumentException) {
        println("   Error: ${e.message}")
    }

    // 6
    val figuras: List<Figura> = listOf(Circulo(2.0), Cuadrado(3.0))
    figuras.forEach { println("6) ${it::class.simpleName}: área = ${it.calcularArea()}") }

    // 7
    val alumno = Alumno("Pedro", listOf(6.0, 8.0, 10.0))
    println("7) Media de ${alumno.nombre}: ${alumno.media}")

    // 8
    val lista = ListaReproduccion()
    lista.añadirCancion("Canción A")
    lista.añadirCancion("Canción B")
    lista.añadirCancion("Canción C")
    lista.eliminarCancion("Canción B")
    println("8) Canciones:")
    lista.mostrarCanciones()

    // 9
    val c1 = Cliente("Eva", Direccion("Gran Vía 1", "Madrid"))
    val c2 = Cliente("Eva", Direccion("Gran Vía 1", "Madrid"))
    println("9) toString: $c1")
    println("   c1 == c2: ${c1 == c2}") // true: equals compara también la Direccion anidada

    // 10
    val temp = Temperatura(25.0)
    println("10) 25 °C = ${temp.fahrenheit} °F = ${temp.kelvin} K")
    try {
        Temperatura(-300.0)
    } catch (e: IllegalArgumentException) {
        println("    Error: ${e.message}")
    }
}
