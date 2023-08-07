package com.danfo1.fundamoentoskotlin.taller1

class reto5 {
}

fun main() {
    val codigo= listOf<Int>(123455,765432,763543,123445,765643,123456,876543,123456,765432,432165,676589,543297)
    var randomcodigo=codigo.random()
    val contraseña: Int = 1234
    val numero: Long = 3125923180L
    var res=1
    var saldo=4500
    println("ingrese numero de telefono")
    var t= readln().toLong()
    println("ingrese contraseña")
    var c= readln().toInt()
    while (res==1){
        if (t.toLong() ==numero && c==contraseña ){
            println("bienbenido")
            println("su saldo es de $saldo")
            println("1.saca")
            println("2.enviar")
            println("3.recargar")
            println("4.salir")
            println("funcion desea realizar")
            var op= readln()!!.toInt()
                if (op==1){
                    println("opsiones para sacar")
                    println("punto fisico")
                    println("cajero")
                    var o= readln().toString()
                        when (o){
                        "punto fisico"->{
                                    if (o=="punto fisico"&& saldo>2000){
                                        println("tu codigo es $randomcodigo")
                                        println("tu codigo vence en 30 minutos")

                                }else if (o=="punto fisico" && saldo<2000) {
                                println("no te alcanza")
                            }
                        }
                        "cajero"->{
                            if (o=="cajero"&&saldo>2000) {
                                println("tu codigo es $randomcodigo")
                                println("tu codigo vence en 30 minutos")

                            }else if (o=="cajero"&& saldo<2000){
                                println("no te alcanza")
                            }
                        }
                    }
                }else if (op==2){
                     println("ingrese numero")
                    var num= readln().toInt()
                    println("cuanto va a enviar")
                    var valor= readln().toInt()
                        if (valor<saldo){
                            println("el valor a enviar es $valor")
                            println("envio exitoso")
                            println("su saldo actual es ${saldo-valor}")
                        }else if (valor>saldo){
                            println("no es posible enviar el dinero")
                        }
                }else if (op==3){
                    println("recargar")
                    println("ingrese numero")
                    var numr= readln().toInt()
                    println("cuanto va a recargar")
                    var valorr= readln().toInt()
                    println("¿desea realizar la recarga?")
                    var op= readln().toString()
                    if (op=="si"){
                        println("su recarga a sido un exito")
                        println("telefono:$numr")
                        println("valor=$valorr")
                        println("saldo actual${saldo-valorr}")
                    }else if (op=="no"){
                        println("la recarga no fue realizada ")
                    }
                }else if (op==4){
                    println("desea salir de nequi2")
                    var option= readln().toString()
                    if (option=="si"){
                        println("adios")
                    }else if (option=="no"){
                        println("gracias por seguir en linea")
                    }
                }
        }else if (t.toLong()!=numero){
            println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes tres intentos más")
        }
        println("desea reiniciar 1 es si o es no ")
        res= readln().toInt()
    }
}