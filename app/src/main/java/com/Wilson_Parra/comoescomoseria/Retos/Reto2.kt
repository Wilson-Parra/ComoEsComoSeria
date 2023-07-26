package com.Wilson_Parra.comoescomoseria.Retos

class Reto2 {
}
fun main(){
    var i=1
    var total: Int= 0

    while ( i==1){
        println("ingrese el nombre producto")
        var nombre: String= readLine()!!.toString()
        println("ingrese el precio del producto")
        var precio: Int= readLine()!!.toInt()
        println("ingrese la cantidad producto")
        var cantidad: Int= readLine()!!.toInt()
        total=total+(precio*cantidad)
        println("Desea ingresar mas Productos?: \n 1.Si \n 2. No")
        i=readLine()!!.toInt()
    }
    if(total>50000){
        println("Ingresaste al sorteo")
        var bolita:Int=(1..4).random()
        when(bolita){
            1 -> {var totalfinal=total-(total*0.10)
                println("Felicitaciones has sacado la bola Roja tu compra tiene el descuento de 10% por lo tanto de $total paga solo $totalfinal ")
            }
            2->  {var totalfinal=total-(total*0.30)
                println("Felicitaciones has sacado la bola Azul tu compra tiene el descuento de 30% por lo tanto de $total paga solo $totalfinal ")
            }
            3->  {var totalfinal=total-(total*0.50)
                println("Felicitaciones has sacado la bola Amarilla tu compra tiene el descuento de 50% por lo tanto de $total paga solo $totalfinal ")
            }
            4->  {var totalfinal=0
                println("Felicitaciones has sacado la bola Blanca tu compra tiene el descuento de 100% por lo tanto de $total paga solo $totalfinal")
            }
        }
    }
    else{
        println("Upps no cumples las condiciones para entrar al sorteo, por lo tanto pagas el 100% de tu compra que es $total")
    }
}




