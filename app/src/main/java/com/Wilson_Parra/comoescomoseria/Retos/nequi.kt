package com.Wilson_Parra.comoescomoseria.Retos
import java.util.Scanner

class nequi(private var celular: String = "", private var clave: String = "") {
    private var saldoDisponible: Double = 50000.0

    fun ingresar() {
        var intentos = 3

        while (intentos > 0) {
            println("Ingrese su número de celular:")
            val inputCelular: String = readLine()!!.toString()
            println("Ingrese su clave de 4 dígitos:")
            val inputClave: String = readLine()!!.toString()

            if (inputCelular == celular && inputClave == clave) {
                println("¡Bienvenido a Nequi!")
                break
            } else {
                intentos--
                if (intentos > 0) {
                    println("¡Upps! Parece que tus datos de acceso no son correctos. Tienes $intentos intentos más.")
                } else {
                    println("¡Upps! Parece que tus datos de acceso no son correctos. Has agotado tus intentos.")
                }
            }
        }
    }

    fun mostrarSaldo() {
        println("Tu saldo actual es: $saldoDisponible")
    }

    fun retirar() {
        println("Elige una opción para sacar dinero:")
        println("1. Cajero")
        println("2. Punto físico")
        var opcion: Int = readLine()!!.toInt()

        if (saldoDisponible < 2000 ) {
            println("No te alcanza para hacer el retiro. No tienes el saldo suficiente")
        } else {
            println("Ingrese el monto a retirar:")
            var monto: Double = readLine()!!.toDouble()

            if (monto <= saldoDisponible && monto>0) {
                println("Confirmar retiro de $monto:\n 1. SI \n 2.NO ")
                var confirmacion: Int = readLine()!!.toInt()

                if (confirmacion == 1) {
                    saldoDisponible -= monto
                    val codigoRetiro = (100000..999999).random()
                    println("Retiro exitoso. Código de retiro: $codigoRetiro")
                } else {
                    println("Retiro cancelado.")
                }
            } else {
                println("Saldo insuficiente para realizar el retiro o monto invalido.")
            }
        }
    }

    fun enviar() {
        println("Ingrese el número de teléfono al que desea enviar dinero:")
        var numeroTelefono: String = readLine()!!.toString()


        if (numeroTelefono.matches(Regex("\\d{10}[0-9]+"))) {
            println("Ingrese el valor a enviar:")
            var valorEnviar: Int = readLine()!!.toInt()

            if (valorEnviar <= saldoDisponible) {
                saldoDisponible -= valorEnviar
                println("Envío de dinero exitoso a $numeroTelefono por valor de $valorEnviar")
            } else {
                println("No es posible enviar el dinero. Saldo insuficiente.")
            }
        } else {
            println("El número de teléfono ingresado no es válido. Debe contener solo dígitos y 10 digitos.")
        }
    }


    fun recargar() {
        println("Ingrese el valor a recargar:")
        var valorRecarga: Double = readLine()!!.toDouble()

        println("¿Desea realizar la recarga por valor de $valorRecarga? \n 1.SI \n 2.NO")
        var confirmacion: Int = readLine()!!.toInt()

        if (confirmacion == 1) {
            saldoDisponible += valorRecarga
            println("Recarga exitosa. Nuevo saldo: $saldoDisponible")
        } else {
            println("Recarga cancelada.")
        }
    }
}

fun main() {
    val celular = "3013442983"
    val clave = "2580"
    val nequi = nequi(celular, clave)
    nequi.ingresar()

    var continuar = true

    while (continuar) {
        println("¿Qué acción desea realizar?")
        println("1. Mostrar saldo")
        println("2. Sacar dinero")
        println("3. Enviar dinero")
        println("4. Recargar")
        println("5. Salir")

        var opcion: Int = readLine()!!.toInt()

        when (opcion) {
            1 -> nequi.mostrarSaldo()
            2 -> nequi.retirar()
            3 -> nequi.enviar()
            4 -> nequi.recargar()
            5 -> {
                println("Saliendo de Nequi...")
                continuar = false
            }
            else -> println("Opción inválida. Intente de nuevo.")
        }
    }
}
