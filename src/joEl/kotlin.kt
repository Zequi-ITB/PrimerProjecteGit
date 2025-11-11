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

    // Fem la matriu
    var matriu: MutableList<String> = mutableListOf()

    // Fem un bucle per afeigir les llistes a la matriu
    repeat(filas) {
        var llistat: String = scan.nextLine()
        matriu.add(llistat)
    }
    println(matriu)

    var matriuNova = MutableList(filas) { MutableList(columnes) { '0' } }

    //Declarem variables per comptabilitzar els 1 que hi ha al voltat.
    var contadorCelulas: Int = 0

    // Fem una iteracio per comprovar si algun número es troba entre dos números buscats.
    for (j in 0..columnes-1) {

    }


    for (i in 1..matriu.size-2) {


        for (posicio in 1..matriu[i].length-2) {
            contadorCelulas = 0

                if (matriu[i][posicio - 1] == '1') {
                    contadorCelulas++
                }
                if (matriu[i][posicio + 1] == '1') {
                    contadorCelulas++
                }
                if (matriu[i + 1][posicio] == '1') {
                    contadorCelulas++
                }
                if (matriu[i + 1][posicio + 1] == '1') {
                    contadorCelulas++
                }
                if (matriu[i + 1][posicio - 1] == '1') {
                    contadorCelulas++
                }
                if (matriu[i - 1][posicio] == '1') {
                    contadorCelulas++
                }
                if (matriu[i - 1][posicio + 1] == '1') {
                    contadorCelulas++
                }
                if (matriu[i - 1][posicio - 1] == '1') {
                    contadorCelulas++
                }

            if (contadorCelulas >= 2) {
                matriuNova[i][posicio] = '1'
            } else {
                matriuNova[i][posicio] = '0'
            }

        }

        print(matriuNova)
        println()

    }

    scan.close()
}


