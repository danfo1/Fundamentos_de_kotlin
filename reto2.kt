package com.danfo1.fundamoentoskotlin.taller1

class reto2 {
}

fun main() {

    val album: MutableList<List<Any>> =mutableListOf()
    var res=1
    var contador=0
    var i=1


        while (res==1) {
            println("1.agregar cansion")
            println("2.ver cuantas canciones hay en el album")
            println("3.ver que tipo de musica hay en el album")
            println("4.cuantas reproducciones tienen las cacniones")
            println("5.la cancion mas popular")
            println("6.la cancion menos popular")
            println("¿que adsion desea realizar?" )
            var option= readln()!!.toInt()

            if (option == 1) {
                println("cuantas canciones quiere agregar")
                var num = readln()!!.toInt()
                while (i<=num) {
                    print("Ingrese el nombre de la cancion: \n")
                    val cancion: String = readLine()!!.toString()
                    print("Ingrese el nombre del artista: \n")
                    val artista: String = readLine()!!.toString()
                    print("Ingrese el año de publicacion: \n")
                    val fecha: String = readLine()!!.toString()
                    print("Ingrese la cantidad de reproducciones que tuvo la cancion: \n")
                    val reproduccion: Int = readLine()!!.toInt()
                    val datos = listOf(cancion, artista, fecha, reproduccion)
                    album.add(datos)
                    i++
                }
            } else if (option == 2) {
                        println("el numero de caciones del album son $i")
            } else if (option == 3) {
                println("los generos musicales que se encuentras en el album son:\nrock\nreggae\nbachata\nrap\nvallenato")
            }else if(option==4){
                println("titulo${album[i][0]}, artista ${album[i][1]}, fecha ${album[i][2]}, ${album[i][3]} reproducciones.")
            }else if (option==5){
                println("la cancion tiene ${album[0][3]} reproducciones")
            }else if (option==6){
                val masescuchada = album.maxByOrNull { (it[3] as Int) }
                print("la musica mas conocida es: ${masescuchada} \n")
            }else if (option==7){
                    val mus = album[0][3] as? Int
                    if (mus != null && mus<= 1000) {
                        print("musica menos popular: ${album[0]}\n")
                    }
            }
            contador+=1
            println("seea realizar otra acsion 1 es si o es no")
            res= readln()!!.toInt()
        }
}