package com.danfo1.fundamoentoskotlin.taller1

class reto4 {
}
data class plato(var nombre:String , var descripsion:String , var precio:Int)
fun main() {
    val entrada = mutableListOf<plato>()
    val platof = mutableListOf<plato>()
    val postre = mutableListOf<plato>()
    var res=1
    var i=1
    while(res==1){
        println("1.agregar plato")
        println("2.ver menu")
        println("3.buscar plato")
        println("4.modificar el menu")
        println("5.eliminar un plato")
        println("que opcion deseaa  realizar en el menu ")
        var option= readln()!!.toInt()
        if (option==1){
            println("¿que plato desea agregar?")
            println("entreda")
            println("plato fuerte")
            println("postre")
            var op = readln()!!.toString().lowercase()
                when(op){
                    "entrada"->{
                        println("ingrese nombre del plato")
                        var nombre: String=readLine()!!.toString()
                        println("ingrese la descripsion del plato")
                        var descripsion: String= readln()!!.toString()
                        println("inngrese el precio del plato")
                        var precio: Int= readln()!!.toInt()
                        entrada.add(plato(nombre,descripsion, precio))
                        i++
                    }
                    "plato fuerte"->{
                        println("ingrese nombre del plato")
                        var nombre= readLine().toString()
                        println("ingrese la descripsion del plato")
                        var descripsion= readln().toString()
                        println("inngrese el precio del plato")
                        var precio= readln().toInt()
                        platof.add(plato(nombre,descripsion, precio))
                        i++
                    }
                    "postre"->{
                        println("ingrese nombre del plato")
                        var nombre= readLine().toString()
                        println("ingrese la descripsion del plato")
                        var descripsion= readln().toString()
                        println("inngrese el precio del plato")
                        var precio= readln().toInt()
                        postre.add(plato(nombre,descripsion, precio))
                        i++
                    }
                }
        }else if (option==2){
                println("nuestro menu es\n entradas\n${entrada}\nplato fuerte\n${platof}\n postres\n${postre}" )
        }else if (option==3){
                    println("que plato desea buscar")
                    println("entrada")
                    println("plato fuerte")
                    println("postre")
                    var platos= readln()!!.toString()
                     when(platos){
                         "entrada"->{
                             println("ingrese numero de plato que desea ver")
                             var numero = readln()!!.toInt()
                             val posi =entrada[numero]
                             println("el plato que es $posi")
                         }
                         "plato fuerte"->{
                             println("ingrese numero de plato que desea ver")
                             var numero = readln()!!.toInt()
                             val posi =platof[numero]
                             println("el plato que es $posi")
                         }
                         "postre"->{println("ingrese numero de plato que desea ver")
                             var numero = readln()!!.toInt()
                             val posi =postre[numero]
                             println("el plato que es $posi")
                         }
                     }
        }else if (option==4){
                println("que parte del menu desea modificar ")
                println("1.las entradas")
                println("2.los platos fuertes")
                println("3.los postres")
                var i = readln()!!.toInt()
                    if (i==1){
                        println("que parte desea modificar")
                        println("nombre")
                        println("descripcion")
                        println("precio")
                        var partes= readln().toString()
                        when(partes){
                            "nombre"->{
                                println("codigo del plato que quiere modificar")
                                var codigo= readln()!!.toInt()
                                var editar=entrada[codigo]
                                println("ingrese nuevo nombre")
                                var nom = readln().toString()
                                editar.nombre=nom
                                println("el nombre  a sido camciado a $editar")
                            }
                             "descripcion"->{
                                 println("codigo del plato que quiere cambiar")
                                 var codigo= readln()!!.toInt()
                                 var editar=entrada[codigo]
                                 println("ingrese nuevo nombre")
                                 var des = readln().toString()
                                 editar.descripsion=des
                                 println("el nombre  a sido camciado a $editar")
                             }
                            "precio"->{
                                println("codigo del plato que quiere cambiar")
                                var codigo= readln()!!.toInt()
                                var editar=entrada[codigo]
                                println("ingrese nuevo nombre")
                                var pres = readln().toInt()
                                editar.precio=pres
                                println("el nombre  a sido camciado a $editar")
                            }
                        }
                    }else if(i==2){
                        println("que parte desea modificar")
                        println("nombre")
                        println("descripcion")
                        println("precio")
                        var partes= readln().toString()
                        when(partes) {
                            "nombre" -> {
                                println("codigo del plato que quiere modificar")
                                var codigo = readln()!!.toInt()
                                var editar = platof[codigo]
                                println("ingrese nuevo nombre")
                                var nom = readln().toString()
                                editar.nombre = nom
                                println("el nombre  a sido camciado a $editar")
                            }
                            "descripcion" -> {
                                println("codigo del plato que quiere cambiar")
                                var codigo = readln()!!.toInt()
                                var editar = platof[codigo]
                                println("ingrese nuevo nombre")
                                var des = readln().toString()
                                editar.descripsion = des
                                println("el nombre  a sido camciado a $editar")
                            }
                            "precio" -> {
                                println("codigo del plato que quiere cambiar")
                                var codigo = readln()!!.toInt()
                                var editar = platof[codigo]
                                println("ingrese nuevo nombre")
                                var pres = readln().toInt()
                                editar.precio = pres
                                println("el nombre  a sido camciado a $editar")
                            }
                        }
                    }else if (i==3){
                            println("que parte desea modificar")
                            println("nombre")
                            println("descripcion")
                            println("precio")
                            var partes= readln().toString()
                            when(partes) {
                                "nombre" -> {
                                    println("codigo del plato que quiere modificar")
                                    var codigo = readln()!!.toInt()
                                    var editar = postre[codigo]
                                    println("ingrese nuevo nombre")
                                    var nom = readln().toString()
                                    editar.nombre = nom
                                    println("el nombre  a sido camciado a $editar")
                                }
                                "descripcion" -> {
                                    println("codigo del plato que quiere cambiar")
                                    var codigo = readln()!!.toInt()
                                    var editar = postre[codigo]
                                    println("ingrese nuevo nombre")
                                    var des = readln().toString()
                                    editar.descripsion = des
                                    println("el nombre  a sido camciado a $editar")
                                }
                                "precio" -> {
                                    println("codigo del plato que quiere cambiar")
                                    var codigo = readln()!!.toInt()
                                    var editar = postre[codigo]
                                    println("ingrese nuevo nombre")
                                    var pres = readln().toInt()
                                    editar.precio = pres
                                    println("el nombre  a sido camciado a $editar")
                                }
                            }
                    }
        }    else if (option==5){
            println("que categoria de plato desea eliminar")
            println("1.las entradas")
            println("2.los platos fuertes")
            println("3.los postres")
            var o = readln()!!.toInt()
            if (o==1){
                println("ingrese codigo del plato que desea eliminar")
                var eli= readln()!!.toInt()
                var adiso=entrada[eli]
                entrada.remove(adiso)
                println("el plato a sido eliminado $adiso")


            }else if (o==2){
                println("ingrese codigo del plato que desea eliminar")
                var eli= readln()!!.toInt()
                var adiso=platof[eli]
                platof.remove(adiso)
                println("el plato a sido eliminado $adiso")
            }else if (o==3){
                println("ingrese codigo del plato que desea eliminar")
                var eli= readln()!!.toInt()
                var adiso=postre[eli]
                postre.remove(adiso)
                println("el plato a sido eliminado $adiso")
            }
        }
        println("desea realizar otra acsion en el menu 1 es si 0 es no")
        res= readln()!!.toInt()
    }
}




