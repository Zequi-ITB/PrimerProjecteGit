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
    val TOTAL_CARTES: Int = 13

    // Fem un bucle amb la quantitat de casos i demanem el tamany de l'array.
    repeat(casos) {

        // Creem els arrays i demanem els valor de les cartes.
        var llistatDeCartes: Array<Int> = Array(CUANTITAT_CARTES) { scan.nextInt() }
        var llistatBooleans: Array<Boolean> = Array(TOTAL_CARTES) { false }

        // Definim unes variables per portar control sonbre si hi ha escala o no.
        var contEscala: Int = 1;
        var hiHaEscala: Boolean = false;

        // Asignem cada carta a un boolean especific
        for (i in llistatDeCartes.indices) {
            when (llistatDeCartes[i]) {
                1 -> llistatBooleans[0] = true
                13 -> llistatBooleans[1] = true
                12 -> llistatBooleans[2] = true
                11 -> llistatBooleans[3] = true
                10 -> llistatBooleans[4] = true
                9 -> llistatBooleans[5] = true
                8 -> llistatBooleans[6] = true
                7 -> llistatBooleans[7] = true
                6 -> llistatBooleans[8] = true
                5 -> llistatBooleans[9] = true
                4 -> llistatBooleans[10] = true
                3 -> llistatBooleans[11] = true
                2 -> llistatBooleans[12] = true
            }
        }
        // Comprovem si hi ha escala evaluant els booleans consecutius i portan el comptador, en cas de que no es compleixi la seqüència, és resetea el comptador a 1.
        for (i in llistatBooleans.indices) {
            if (llistatBooleans[i]) {
                contEscala++;

                // Si el comptador arriba a 5, vol dir que hi ha escala llavors activem un boolean a true.
                if (contEscala == 5) {
                    hiHaEscala = true;
                }
            } else {
                contEscala = 1;
            }
        }

        // Fem les ultimas comprovacions per saber si es reial o normal i imprimim el resultat
        if (hiHaEscala) {
            if (llistatBooleans[0] && llistatBooleans[4]) {
                println("ESCALA REIAL")
            } else {
                println("ESCALA")
            }
        } else {
            println("NO")
        }
    }
    scan.close()
}


