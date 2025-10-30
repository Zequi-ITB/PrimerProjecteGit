import java.util.Scanner

//En el Poker Texas Hold’em, al final de la partida jugues amb 7 cartes (les dues a la teva ma i les 5 del flop). Un cop fet això es calcula quina jugada tens. Les escales i les escales Reials son de les millors jugades possibles
//Una escala es quan tens 5 cartes consecutives dintre de les 7.
//Una escala reial es quan tens just 10, Jack, Reina, Rei, i As

//Per a cada cas hauràs de dir si tens una escala, escala reial, o no tens res
fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem els casos de prova a considerar
    var casos: Int = scan.nextInt();
    val CUANTITAT_CARTES: Int = 7

    // Fem un bucle amb la quantitat de casos i demanem el tamany de l'array.
    repeat(casos) {

        // Creem l'array i demanem els valor de les cartes.
        var llistatDeCartes: Array<Int> = Array(CUANTITAT_CARTES) { scan.nextInt() }
        val ORDRE_CARTES: Array<Int> = arrayOf(1, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        var llistatBooleans: Array<Boolean> = Array(CUANTITAT_CARTES) { false }
        var escala: Array<Int> = Array(5) { 0 }


        // Comprovem si es una escala, escala reial o res.
        var cont: Int = 0;
        while (cont <= 7) {

            for (i in ORDRE_CARTES.indices) {
                if (ORDRE_CARTES[i] in llistatDeCartes.indices) {
                    escala[cont] = llistatDeCartes[i]
                    cont++
                } else {
                    for (i in escala.indices) {
                        escala[i] = 0
                        cont = 0
                    }
                }
            }
        }

        if (0 in escala.indices) {
            println("NO")
        } else
            if (13 in escala.indices && 1 in escala.indices)
                println("ESCALA REIAL")
            else {
                println("ESCALA")
            }
    }


    scan.close()
}


