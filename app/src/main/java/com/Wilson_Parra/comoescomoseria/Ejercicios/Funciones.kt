package com.Wilson_Parra.comoescomoseria.Ejercicios

class Funciones {
}
fun perimetro(lado1: Int,lado2: Int,lado3: Int) {
    var Perimetro =(lado1+lado2+lado3)
    println("El perimetro del triangulo es $Perimetro")
}
fun area(altura: Int,base: Int) {
    var area=(altura*base)/2
    println("El area del triangulo es $area")
}
fun perimetroRectangulo(base: Int,altura: Int): Int{
    var perimetroA = (base*altura)*2
    return perimetroA
}
fun areaRectangulo(base: Int,altura: Int): Int{
    var areaA = base*altura
    return areaA
}

fun main() {
    /*println("Bienvenido !!")
    println("Digite su edad: ")
    var edad: Int = readLine()!!.toInt()
    val mayor = if (edad>17)"Puedes ir donde las inciplinas " else "ve mejor a ver peppa"
    println(mayor)*/

    var c=1
    while (c==1) {
        println("Bienvenido al juego de matematicas")
        println("Que deseas realizar: \n 1. Triangulo Perimetro \n 2. Triangulo Area  \n 3. Circulo Perimetro  \n4. Circulo Area \n5. Rectangulo Perimetro \n6.Rectangulo Area")
        var opcion: Int = readLine()!!.toInt()

        when (opcion) {
            1 -> {    println("Digita el lado 1 de tu triangulo")
                var lado1: Int = readLine()!!.toInt() ?: 0
                println("Digita el lado 2 de tu triangulo")
                var lado2: Int = readLine()!!.toInt() ?: 0
                println("Digita el lado 3 de tu triangulo")
                var lado3: Int = readLine()!!.toInt() ?: 0
                perimetro(lado1,lado2,lado3)
            }

            2 -> { println("Digita la altura de tu triangulo")
                var altura: Int = readLine()!!.toInt() ?: 0
                println("Digita la base de tu triangulo")
                var base: Int = readLine()!!.toInt() ?: 0
                area(altura, base)
            }
            3 -> {
                println("Digita el radio de tu circulo")
                var radio: Int = readLine()!!.toInt()
                fun perimetro() {
                    var Perimetro = 3.1416 * (radio * 2)
                    println("El radio de tu circulo es $radio por lo tanto el perimetro es $Perimetro")
                }
                perimetro()
            }

            4 -> {
                println("Digita el radio de tu circulo")
                var radio: Int = readLine()!!.toInt()
                fun area() {
                    var area = 3.1416 * (radio * radio)
                    println("El radio de tu circulo es $radio por lo tanto el area es $area")
                }
                area()
            }
            5->{
                println("Digita la base de tu rectangulo")
                var base: Int = readLine()!!.toInt()
                println("Digita la altura de tu rectangulo")
                var altura: Int = readLine()!!.toInt()
                var perimetro = perimetroRectangulo(base,altura)
                println("El perimetro de tu rectangulo es: $perimetro")
            }
            6->{
                println("Digita la base de tu rectangulo")
                var base: Int = readLine()!!.toInt()
                println("Digita la altura de tu rectangulo")
                var altura: Int = readLine()!!.toInt()
                var area = areaRectangulo(base,altura)
                println("El perimetro de tu rectangulo es: $area")
            }

            else -> println("Upss revisa la opcion que escojiste")
        }
        println("Deseas realizar otro calculo: \n 1.SI \n 2. NO")
        c= readLine()!!.toInt()
    }
    println("Gracias por calcular")
}