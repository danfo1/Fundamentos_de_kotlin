package com.danfo1.fundamoentoskotlin.taller1

class reto1 {
}

fun main() {
    val mensajes = mutableListOf<String>("")
    var contador=0
    var res=1
    while (res==1){
        println("ingrese su mensaje ")
        var men= readln()!!.toString()
        println("cuantas veces desea enviar el mensaje")
        var num= readln()!!.toInt()
        mensajes.add("$men")

        if (num<100){
            println("$num\n usted a recibido un mensaje")
        }else if (num>=100) {
            println("+99\n usted a recibido un mensaje")
        }else if (num==0){
            println("no existen mensajes disponibles")
        }
        contador+=1
        println("usted desea enviar otro mensaje 1 es si 0 es no ")
        res= readln()!!.toInt()
    }
    println("mensajes almasenados $mensajes \n numero de mensajes enviados $contador")
}

