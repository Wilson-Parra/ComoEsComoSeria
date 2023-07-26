package com.pipe1013.fundamentoskotlin2.Apuntes

class Condicionales {
}

fun main() {

    /*print("Ingrese un número: ")
    var num: Int= readLine()!!.toInt()

    if(num in 1..20){
        print("El número $num esta en un rango de 1 a 20")
    }
    else{
        print("El número $num no esta en un rango de 1 a 20")
    }*/

    var results:Int= (1..50).random() // Generación de números aleatorios
    println("El número es $results")
    when(results){
        0 -> println("No hya resultados")
        1,2,3,4,5-> println("Hay menos de 5 resultados")
        in 6..50-> println("Hay entre 5 y 50 resultados")
        else -> println("Esos son bastantes resultados")
    }
}