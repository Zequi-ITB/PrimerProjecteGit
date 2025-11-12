import java.util.Scanner

//El Joc de la Vida és un autòmata cel·lular dissenyat pel matemàtic britànic John Horton Conway al 1970
//És un joc de zero jugadors, el que vol dir que la seva evolució està determinada pel seu estat inicial i no necessita
// cap entrada de dades posterior. El tauler de joc és espai bidimensional rectangular, dividit en caselles (cèl·lules).
// Cada casella te fins a 8 caselles veïnes, les que estan al seu voltant. Les cèl·lules tenen dos estats: vives o mortes.
// Es tracta d’anar evolucionant el tauler de joc en base a unes regles, que marcaran si les caselles estan vives o mortes.
// L’estat d’una casella evoluciona, d’una generació per la següent, sempre en funció de l’estat inicial de la matriu. en funció d’una sèrie de regles:
//Una casella morta amb exactament 2 ó 3 caselles veïnes, “neix” (és a dir, passa a estar viva). Altrament roman morta.
//Una casella viva amb 2 ó 3 caselles veïnes segueix viva, altrament mor o roman morta (per soledat, o superpoblació).

//Per cada cas de prova, caldrà respondre:
//Una línia per cada fila, amb l’estat de cada columna a la següent generació, representat de la manera ja explicada i havent aplicat les regles del “Joc de la Vida”.

fun main() {
    val scan: Scanner = Scanner(System.`in`)

    //Demanem a l'usuari les dimensions i tamany de la matriu
    var filas: Int = scan.nextInt()
    var columnes: Int = scan.nextInt()
    scan.nextLine()

    // Fem la matriu de Strings
    var matriu: MutableList<String> = mutableListOf()

    // Fem un bucle per afeigir les llistes a la matriu, llegim les dades com string
    repeat(filas) {
        var llistat: String = scan.nextLine()
        matriu.add(llistat)
    }

    // Definim la nova matriu (de Chars) i initzialitzem tots els valors a '0'
    var matriuNovaGeneracio = MutableList(filas) { MutableList(columnes) { '0' } }

    //Declarem variables per comptabilitzar els 1 que hi ha al voltant.
    var contadorCelulas: Int = 0
    var fila_comprovar: Int = 0
    var columna_comprovar: Int = 0

    // Fem un bucle per iterar per totes les posicions de la matriu
    for (i in matriu.indices) {
        for (posicio in matriu[i].indices) {

            // Després de cada comprovacio, tornem el comptador a 0
            contadorCelulas = 0

            // Fem un bucle for per fer desplaçaments verticals i horitzontals.
            for (desplazamentVertical in -1..1) {
                for (desplazamentHoritzontal in -1..1) {

                    // Comprovem que la posicio no sigui 0,0.
                    if (desplazamentHoritzontal != 0 || desplazamentVertical != 0) {

                        fila_comprovar = i + desplazamentVertical
                        columna_comprovar = posicio + desplazamentHoritzontal

                        // Comprovem si esta dins del rang de la matriu
                        if (fila_comprovar in 0..filas - 1 && columna_comprovar in 0..columnes - 1) {

                            // Comprovem si es una celula i el comptabilitzem
                            if (matriu[fila_comprovar][columna_comprovar] == '1') {
                                contadorCelulas++
                            }
                        }
                    }
                }
            }

            //Comprovem si hi ha 2 o 3 celula vives al voltant i modifiquem la matriu de la nova generació
            if (contadorCelulas == 2 || contadorCelulas == 3) {
                matriuNovaGeneracio[i][posicio] = '1'
            } else {
                matriuNovaGeneracio[i][posicio] = '0'
            }
        }
    }

    // Fem una ultima iteracio per imprimir tots els elements de la matriu.
    for (i in matriuNovaGeneracio.indices) {
        for (posicio in matriuNovaGeneracio[i].indices) {
            print(matriuNovaGeneracio[i][posicio])
        }
        println()

    }

    scan.close()
}


