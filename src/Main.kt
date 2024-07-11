//EJERCICIO 1
// fun sumarPares(numeros: Array<Int>): Int {
//    var suma = 0
//
//    for (numero in numeros) {
//        if (numero % 2 == 0) {
//        }
//    }
//
//    return suma
//}
//
//fun main() {
//    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
//    println(sumarPares(numeros))
//}
//EJERCICIO 2
//class Producto(
//    val nombre: String,
//    val precio: Double
//) {
//    // Método para mostrar el precio con IVA
//    fun mostrarPrecioConIVA() {
//        val precioConIVA = precio * 1.16  // Calcula el precio con IVA del 16%
//        println("Precio con IVA: $precioConIVA")
//    }
//}
//
//fun main() {
//    val laptop = Producto("Laptop X", 1500.0)
//    laptop.mostrarPrecioConIVA() // Imprime "Precio con IVA: 1740.0"
//}
//EJERCICIO 3
//fun Int.duplicar(): Int {
//    return this * 2
//}
//
//fun main() {
//    val numero = 5
//    println(numero.duplicar()) // Debería imprimir 10
//}

//EJERCICIO 4
//fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
//    return operacion(numero)
//}
//
//fun cuadrado(numero: Int): Int {
//    return numero * numero
//}
//
//fun main() {
//    println(aplicarOperacion(5, ::cuadrado)) // Debería imprimir 25
//}

//EJERCICIO 5
//abstract class FiguraGeometrica {
//    abstract fun calcularArea(): Double
//}
//class Rectangulo(private val base: Double,private val altura:Double) : FiguraGeometrica() {
//    override fun calcularArea(): Double {
//        return base * altura
//    }
//}
//    fun main(args: Array<String>) {
//
//        val rectangulo = Rectangulo(5.0, 10.0)
//        println("El area del rectangulo es: " + rectangulo.calcularArea())
//    }
//class Circulo (private val radio: Double) : FiguraGeometrica() {
//    override fun calcularArea(): Double {
//        return 3.1416 * radio
//    }
//}
//
//fun main(args: Array<String>) {
//
//    val circulo = Circulo(5.0)
//    println("El area del circulo es: " + circulo.calcularArea())
//}
//EJERCICIO 6
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

    class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
        fun showProfile() {
            println("Name: $name")
            println("Age: $age")
            hobby?.let {
                print("Likes to $it. ")
            }
            if (referrer != null) {
                println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
            } else {
                println("Doesn't have a referrer.")
            }
        }
    }



