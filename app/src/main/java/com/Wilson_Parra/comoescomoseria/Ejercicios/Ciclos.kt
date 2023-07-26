package com.pipe1013.fundamentoskotlin2.Apuntes

class Ciclos {

}

fun main() {
    /*for( i in 1..5) print(i)
    println()

    for(i in 5 downTo 1) print(i)
    println()

    for(i in 1..5 step 2) print(i)
    println()

    var contadorPar = 0
    var contadorImpar = 0
    var totalSumaPar = 0
    var totalSumaImpar = 0


    for (i in 1..6) {
        println("Ingrese un número:  $i")
        var num: Int = readLine()!!.toInt()

        if (num % 2 == 0) {
            println("El número digitado es par")
            contadorPar++
            totalSumaPar = totalSumaPar + num

        } else {
            println("El número digitado es impar")
            contadorImpar++
            totalSumaImpar = totalSumaImpar + num

        }

    }
    println("La cantidad de numeros pares son: $contadorPar")
    println("La cantidad de numeros impares son: $contadorImpar")
    println("La suma de los números par es: $totalSumaPar")
    println("La suma de los números impar es: $totalSumaImpar")*/

    /*var contadorPar = 0
    var contadorImpar = 0
    var totalSumaPar = 0
    var totalSumaImpar = 0
    var num = 1

    while (num==1){
        println("Ingrese un número: ")
        var numero: Int = readLine()!!.toInt()

        if (numero % 2 == 0) {
            println("El número digitado es par")
            contadorPar++
            totalSumaPar = totalSumaPar + num

        } else {
            println("El número digitado es impar")
            contadorImpar++
            totalSumaImpar = totalSumaImpar + num

        }

        println("Desea seguir digitando números? Escriba (1) para si o (2) para no")
        num = readLine()!!.toInt()

    }
    println("La cantidad de numeros pares son: $contadorPar")
    println("La cantidad de numeros impares son: $contadorImpar")
    println("La suma de los números par es: $totalSumaPar")
    println("La suma de los números impar es: $totalSumaImpar")*/

    var num: Int=0
    var op:String

    do{
        println("Ingrese un número")
        num = readLine()!!.toInt()
        println("Desea ingresar otro número")
        op = readLine()!!.toString()
    }while (op=="yes")


}

