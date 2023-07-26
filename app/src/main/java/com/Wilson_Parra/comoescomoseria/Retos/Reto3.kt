package com.Wilson_Parra.comoescomoseria.Retos

class Reto3 {
}
fun main(){
    var c=1
    var Concesionario = mutableListOf<String>("mazda","bmw","renault")
    while (c==1) {

        println("Bienvenido al concesionario Jennifer S.A.S")
        println("Digite la opcion deseada:\n 1. Insertar Auto\n 2.Mostrar Datos \n 3.Buscar Carro \n 4.Modificar Vehiculo \n 5.Eliminar Vehiculo ")
        var opcion: Int = readLine()!!.toInt()
        when (opcion) {
            1 -> {
                println("Digite el Carro que desea Agregar: ")
                var nuevo: String = readLine()!!.toString()
                nuevo=nuevo.toLowerCase()
                if (Concesionario.contains(nuevo)) {
                    println("El carro ya existe ")
                } else {
                    Concesionario.add(nuevo)
                    println("El carro se ha agregado correctamente !!")
                    println("La nueva lista es $Concesionario")
                }
            }

            2 -> {
                println("La lista actual de Carros es")
                println(Concesionario)
            }

            3 -> {
                println("Digite el Carro que desea Buscar: ")
                var buscar: String = readLine()!!.toString()
                buscar=buscar.toLowerCase()
                var index = Concesionario.indexOf(buscar)
                if (Concesionario.contains(buscar)) {
                    println("El carro $buscar existe y se encuentra en ls posicion $index de la lista ")
                } else {
                    println("El carro no existe en la lista")
                }
            }

            4 -> {
                println("Actualmente en la lista hay los siguientes carros")
                println(Concesionario)
                println("Digite el Carro que desea Modificar: ")
                var modificar: String = readLine()!!.toString()
                modificar=modificar.toLowerCase()
                var indice = Concesionario.indexOf(modificar)
                println("Digite el Carro que lo va a reemplazar: ")
                var modificado: String = readLine()!!.toString()
                modificado=modificado.toLowerCase()
                Concesionario[indice] = modificado
                println("Los cambios se han realizado.La lista actualizada es")
                println(Concesionario)
            }

            5 -> {
                println("Actualmente en la lista hay los siguientes carros")
                println(Concesionario)
                println("Digite el Carro que desea eliminar: ")
                var eliminar: String = readLine()!!.toString()
                eliminar=eliminar.toLowerCase()
                var indice = Concesionario.indexOf(eliminar)
                Concesionario.removeAt(indice)
                println("El carro se ha eliminado.La lista actualizada es")
                println(Concesionario)
            }

            else -> println("Opcion invalida.Revisa el menu por favor.")
        }
        println("Podemos hacer algo mas por ti.Digita \n 1.Para si  \n 2.Para no")
        c = readLine()!!.toInt()
    }
    println("Gracias por usar Nuestro Menu.")
}