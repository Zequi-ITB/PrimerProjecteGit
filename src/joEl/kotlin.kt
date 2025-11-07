import java.util.Scanner

//En el joc d’Scrabble es disposa d’un taulell de 15x15 caselles on cada jugador forma
// paraules encadenades fins que no resten fitxes per col.locar. Les paraules es formen
// amb lletres (cada lletra en una fitxa). A cada joc hi ha un nombre determinat de lletres,
// les més habituals estan repetides vàries vegades, però hi ha lletres que es troben una o
// dos vegades únicament. En aquesta ocasió considerem es juga a les 26 lletres de l’alfabet
// anglès (de l’A a la Z).


fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos de prova a evaluar
    var casos: Int = scan.nextInt()
    scan.nextLine()

    var paraulaConstruida: String = ""
    var contadorParaulasConstruides: Int = 0


    // Fem un bucle amb la quantitat de casos de prova
    repeat(casos) {

        // Demanem la quantitat de lletras que tenim amb un array de enters
        var llistatNumeros: Array<Int> = Array<Int>(26) { scan.nextInt() }
        scan.nextLine()

        // Creem un array de chars amb tot l'abecedari per poger comparar amb les paraules i relacionarlo amb la posicio de enters que ens dira si tenim lletres o no.
        var llistatLletres: Array<Char> = arrayOf<Char>(
            'a',
            'b',
            'c',
            'd',
            'e',
            'f',
            'g',
            'h',
            'i',
            'j',
            'k',
            'l',
            'm',
            'n',
            'o',
            'p',
            'q',
            'r',
            's',
            't',
            'u',
            'v',
            'w',
            'x',
            'y',
            'z'
        )


        var paraula: String = ""
        paraulaConstruida = ""
        contadorParaulasConstruides = 0

        //Demanem les paraules en un bucle fins que es posi un "." i les comparem amb les lletres que tenim.
        while (paraula != ".") {
            paraula = scan.nextLine().lowercase()
            var paraulaTemporal: String = ""

            for (i in paraula.indices) {
                if (paraula[i] in llistatLletres) {
                    if (llistatNumeros[llistatLletres.indexOf(paraula[i])] > 0) {
                        paraulaTemporal += paraula[i]

                        llistatNumeros[llistatLletres.indexOf(paraula[i])] =
                            llistatNumeros[llistatLletres.indexOf(paraula[i])] - 1


                    }
                }
                if (paraulaTemporal == paraula) {
                    contadorParaulasConstruides++
                    paraulaConstruida += " $paraulaTemporal"
                }
            }


        }

        paraulaConstruida = paraulaConstruida.uppercase()

        println("$contadorParaulasConstruides $paraulaConstruida")

    }





    scan.close()
}


