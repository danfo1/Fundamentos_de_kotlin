package com.danfo1.fundamoentoskotlin.taller1

class reto3 {
}

fun main() {
val productos = listOf<String>("relog de oro","anillo de titanio","carta de charizard calificasio de 10","mt01","iphone14 pro max"
    ,"camioneta raptor2023","peluche de oro salido","caballo de troya ","casa en la playa","computador gamin")
    val randomproductos=productos.random()


    var res=1
    while (res==1){
        println("engrese precio")
        val precio = readln()!!.toInt()


        println("inicia la subasta")
        println("el primer producto es: $randomproductos con un preio base de:$precio")

        println("oferta postor 1")
        var postor1= readln()!!.toFloat()

        println("oferta postor 2")
        var postor2= readln()!!.toFloat()

        if (postor1>postor2 && postor1>precio){
            println("se lo queda el postor 1")
        }else if (postor2>postor1 && postor2>precio ){
            println("se lo queda el postor2")
        }else if (precio>postor1 && precio>postor2){
            println("la casa se queda con el producto")
        }else{}
        println("desea realizar otra subasta 1 es si 0 es no ")
        res= readln()!!.toInt()
    }






}