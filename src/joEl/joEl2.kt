import java.util.Scanner

//El tres en raya pero con gatos.

//La primera línia indica els casos de prova a considerar. Cada cas tindrà dues línies, la primera tindrà el nombre de files (F)
// i la segona el nombre de columnes (C), seguit de una matriu F*C amb una serie de nombres que seràn 1 (gat) o 0 (res).
// (Els gats utilitzats en una ratlla no poden utilitzar-se per formar una altre).
//Per a cada cas hauràs de donar la quantitat de línies que es poden formar amb els gats de la matriu, en format de un nombre únic.

fun main() {
    val scan: Scanner = Scanner(System.`in`);

    // Demanem la quantitat de casos
    var casos: Int = scan.nextInt();

    // Fem un bucle amb la quantitat de casos
    repeat(casos) {

        // Demanem les dimensions i el tamanys de la matriu.
        var dimensions: Int = scan.nextInt()
        var tamany: Int = scan.nextInt()

        // Creem la matriu, i afeigim les llistes amb un bucle.
        var matriu: MutableList<MutableList<Int>> = mutableListOf()

        // Demanem el contingut dels elements i els guardem a les llistas.
        repeat(dimensions) {
            var llistatDeGats: MutableList<Int> = MutableList<Int>(tamany) { scan.nextInt() }
            matriu.add(llistatDeGats)
        }


        // Definim variables per calcular la quantitat de lineas que es podem omplir amb els gats
        var quantitatFilas: Int = 0
        var contadorLinea = 0
        var contadorColumna: Int = 0
        val LINEA: Int = 3

        // Fem una iteracio per comprovar tots els elements de la llista de la matriu en format horizontal
        for (i in matriu.indices) {
            contadorLinea = 0


            // Comprovem les lineas que es forman en vertical amb els gats que queden.
            for (i in matriu.indices) {
                contadorColumna = 0
                for (posicio in matriu[i].indices) {
                    if (matriu[posicio][i] == 1) {
                        contadorColumna++
                        if (contadorColumna == 3) {
                            contadorColumna = 0
                            quantitatFilas++

                            for (gat in (posicio - (LINEA - 1))..posicio) {
                                matriu[posicio][gat] = 0

                            }
                        }
                    } else {
                        contadorColumna = 0
                    }
                }
            }

            for (posicio in matriu[i].indices) {

                // Anem comprovant si es forma una linea en horizontal
                if (matriu[i][posicio] == 1) {
                    contadorLinea++

                    if (contadorLinea == 3) {
                        contadorLinea = 0
                        quantitatFilas++

                        // Si es forma una linea, reemplaçem tots els elements que forman la linea per 0

                    }
                } else {
                    contadorLinea = 0
                }
            }
        }


        // Imprimim el resultat.
        println(quantitatFilas)

    }
    scan.close()
}