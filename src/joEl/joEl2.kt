import java.util.Scanner

//Alecs té dues aficions. Queixar-se i col·leccionar Pokèmon. No obstant, la seva col·lecció es tan gran que s’ha quedat
//sense espai al Banc Pokèmon. Per això, farà una neteja de tots els seus Pokèmon. Vol quedar-se amb només un Pokèmon de cada tipus
//(és a dir, no en vol de repetits), però vol quedar-se amb el que sigui de més nivell. Els Pokèmon tenen dues dades per a identificar-se.
//El seu nom a la Pokèdex, un nombre que va del 1 al 700, i el seu nivell, que va del 1 al 100. L’objectiu es comparar els Pokèmon i quedar-se amb el de més nivell,
//per tal de que no quedin de repetits.

//El programa haura de donar una linea de sortida, amb tots els Pokèmon (mostrant el seu nombre a la Pokèdex)
//que s’han quedat al banc, separats per un espai, amb un espai al final. És molt important que els Pokèmon han d’estar
//en el ordre en que estaven a l’entrada, sent eliminats els de nivell més baix’.


fun main() {
    val scan: Scanner = Scanner(System.`in`)

    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt()
    // Demanem el tamany dels llistats
    var tamany: Int = scan.nextInt()


    // Fem un bucle amb la quantitat de casos
    repeat(casos) {

        // Definim el llistat de pokemons i el de nivells i llegim els valor per teclat
        var llistatPokemons: MutableList<Int> = MutableList<Int>(tamany) { scan.nextInt() }
        var llistatNivells: MutableList<Int> = MutableList<Int>(tamany) { scan.nextInt() }
        var llistatPokemons_Nou: MutableList<Int> = mutableListOf()
        var posicioRepetit_last: Int = 0
        var posicioRepetitFirst: Int = 0

        // Fem una iteracio i anem buscant coincidencies de cada pokemon
        for (i in llistatPokemons.indices) {

            //Mirem si l'element és dins de la llista.
            if (llistatPokemons[i] in llistatPokemons) {

                // Trobem la posicio amb lastIndexOf
                posicioRepetit_last = llistatPokemons.lastIndexOf(llistatPokemons[i])

                // Comprovem si la posicio no es la mateixa que estem comparant.
                if (posicioRepetit_last != i) {

                    // Comparem els nivels dels dos pokemon i posem a 0 el mes baix.
                    if (llistatNivells[i] > llistatNivells[posicioRepetit_last]) {
                        llistatPokemons[posicioRepetit_last] = 0

                    } else {
                        llistatPokemons[i] = 0
                        posicioRepetitFirst = llistatPokemons.indexOf(llistatPokemons[posicioRepetit_last])

                        //Mirem si el element torna a apareixer
                        if (posicioRepetitFirst != -1) {

                            //mirem si no es la mateixa posicio
                            if (posicioRepetitFirst != posicioRepetit_last) {

                                //Comparem i posem a 0 el mes petit.
                                if (llistatPokemons[posicioRepetitFirst] in llistatPokemons) {
                                    posicioRepetit_last =
                                        llistatPokemons.lastIndexOf(llistatPokemons[posicioRepetitFirst])
                                    if (llistatNivells[posicioRepetitFirst] > llistatNivells[posicioRepetit_last]) {
                                        llistatPokemons[posicioRepetit_last] = 0
                                    } else {
                                        llistatPokemons[posicioRepetitFirst] = 0
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Afegim cada element que no sigui 0 a la matriu nova.
        for (posicio in llistatPokemons.indices) {
            if (llistatPokemons[posicio] != 0) {
                llistatPokemons_Nou.add(llistatPokemons[posicio])
            }
        }

        // Imprimim el nou llistat.
        for (element in llistatPokemons_Nou) {
            print("$element ")
        }
        println()
    }

    scan.close()
}