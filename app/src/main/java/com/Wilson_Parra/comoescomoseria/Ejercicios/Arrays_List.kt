package com.Wilson_Parra.comoescomoseria.Ejercicios

class Arrays_List {
}
fun main (){
    var pets=arrayOf("dog","cat","canary")
    // Cambiar el elemento de una posicion en particular
    pets[2]="parrafo"

    println(pets.contentToString())

    // Imprimir el elemento de una posicion especifica del array
    println(pets[1])

    // Recorrer el array uno por uno
    for (( index, element) in pets.withIndex()){
        println("La mascota N° $index es $element")
    }

    // Listas inmutables
    var instruments = listOf("trumpet","piano","violin")
    println(instruments)

    println(instruments[0])
    for ((index,elements) in instruments.withIndex())
        println("EL instrumento N° $index es $elements")

    var instrumentos: List<String> =listOf("trumpet","piano","violin")
    println(instruments)

    // Listas mutables
    var instruments1 = mutableListOf("trumpet","piano","violin")
    instruments1[0]="guitarra"
    println(instruments1)

    //Obtener primer elemento
    val primerElemento = instruments1.first()
    println("El primer elemento es $primerElemento")

    //Obtener  ultimo elemento
    val ultimoElemento = instruments1.last()
    println("El ultimo  elemento es $ultimoElemento")

    // Agregar elementos a una lista Mutable
    instruments1+="Trompeta"
    instruments1.add("saxofon")
    println("La lista con los elemtos agregados $instruments1")

    // Como quitar elementos de una lista Mutable
    instruments1.remove("violin")
    println(" La lista con el primer elemento borrado  $instruments1")

    // Que pasa si se quita un elemento que no existe
    instruments1.remove("arroz")
    println("Se borra un elemento que noexiste en la lista $instruments1")

    //Como quitar elementos a traves del index
    instruments1.removeAt(0)
    println(" La lista con el primer elemento borrado atravez del index  $instruments1")

    // Como eliminar la lista completa
    instruments1.clear()
    println("La lista esta limpia $instruments1")

}